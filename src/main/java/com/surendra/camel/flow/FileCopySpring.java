/**
 * 
 */
package com.surendra.camel.flow;

import org.apache.camel.spring.SpringCamelContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author surendra.singh
 *
 */
public class FileCopySpring {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		new SpringCamelContext(new ClassPathXmlApplicationContext("applicationContext.xml"));
		Thread.sleep(10000);
	}
}
