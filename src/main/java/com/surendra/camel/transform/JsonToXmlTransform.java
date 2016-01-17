/**
 * 
 */
package com.surendra.camel.transform;

import javax.xml.bind.JAXBContext;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.spi.DataFormat;

import com.surendra.camel.entity.User;

/**
 * @author surendra.singh
 *
 */
public class JsonToXmlTransform {

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
				from("file:./src/main/resources?fileName=user.json&noop=true")
					.unmarshal().json(JsonLibrary.Jackson, User.class)
						.marshal(jaxb).to("file:./target?fileName=user_generated.xml");
			}
		});
		
		context.start();
		Thread.sleep(10000);
		context.stop();
	}
}
