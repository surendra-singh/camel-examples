/**
 * 
 */
package com.surendra.camel.transform;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.impl.DefaultCamelContext;

import com.surendra.camel.entity.User;

/**
 * @author surendra.singh
 *
 */
public class JacksonTransform {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		CamelContext context = new DefaultCamelContext();
		context.addRoutes(new RouteBuilder() {
			
			@Override
			public void configure() throws Exception {
				from("file:./src/main/resources?fileName=user.json&noop=true").unmarshal(new JacksonDataFormat(User.class)).process(new Processor() {
						@Override
						public void process(Exchange exchange) throws Exception {
							System.out.println(exchange.getIn().getBody().toString());
						};
				});
			}
		});
		
		context.start();
		Thread.sleep(10000);
		context.stop();
	}
}
