/**
 * 
 */
package com.surendra.camel.util;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * @author surendra.singh
 *
 */
public class FileProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println(exchange.getIn().getHeader("CamelFileName"));
	}
}
