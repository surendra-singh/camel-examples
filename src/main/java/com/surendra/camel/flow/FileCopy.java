/**
 * 
 */
package com.surendra.camel.flow;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

import com.surendra.camel.util.FileProcessor;

/**
 * @author surendra.singh
 *
 */
public class FileCopy {

	private static final String COMPONENT = "file:";

	private static final String SOURCE = "./src/main/resources";

	private static final String DISTINATION = "./target/copy"; 

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		CamelContext context = new DefaultCamelContext();
		context.addRoutes(new RouteBuilder() {
			public void configure() {
				from(COMPONENT + SOURCE + "?noop=true").process(new FileProcessor()).to(COMPONENT + DISTINATION);
			}
		});
		context.start();
		Thread.sleep(10000);
		context.stop();
	}
}
