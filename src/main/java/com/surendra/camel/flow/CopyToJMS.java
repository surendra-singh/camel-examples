/**
 * 
 */
package com.surendra.camel.flow;

import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * @author surendra.singh
 *
 */
public class CopyToJMS {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
		CamelContext context = new DefaultCamelContext();
		context.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));
		
		context.addRoutes(new RouteBuilder() {
			@Override
			public void configure() throws Exception {
				from("file:./src/main/resources?noop=true").choice()
					.when(header("CamelFileName").endsWith("xml")).to("jms:queue:doc-queue")
					.otherwise().to("jms:queue:other-queue").end();
				
				from("jms:queue:doc-queue").to("file:./target/xml");
				from("jms:queue:other-queue").to("file:./target/other");
			}
		});
		
		context.start();
		Thread.sleep(10000);
		context.stop();
	}
}
