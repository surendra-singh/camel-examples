/**
 * 
 */
package com.surendra.camel.transform;

import javax.xml.bind.JAXBContext;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.spi.DataFormat;

import com.surendra.camel.entity.User;

/**
 * @author surendra.singh
 *
 */
public class XmlToJsonTransform {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		CamelContext context = new DefaultCamelContext();
		context.addRoutes(new RouteBuilder() {
			
			@Override
			public void configure() throws Exception {
				final DataFormat jaxb = new JaxbDataFormat(JAXBContext.newInstance(User.class));
				final JacksonDataFormat json = new JacksonDataFormat();
				json.setPrettyPrint(true);
				
				from("file:./src/main/resources?fileName=user.xml&noop=true")
					.unmarshal(jaxb).marshal(json).to("file:./target?fileName=user_generated.json");
			}
		});
		
		context.start();
		Thread.sleep(10000);
		context.stop();
	}
}
