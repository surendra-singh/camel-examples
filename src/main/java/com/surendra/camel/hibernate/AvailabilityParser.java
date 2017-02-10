/**
 * 
 */
package com.surendra.camel.hibernate;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.impl.DefaultCamelContext;
import org.apacheextras.camel.component.hibernate.HibernateComponent;

import com.surendra.camel.hibernate.entity.Availability;
import com.surendra.camel.hibernate.utils.HibernateUtil;

/**
 * @author TTND
 *
 */
public class AvailabilityParser {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) {
		HibernateComponent component = new HibernateComponent();
		component.setSessionFactory(HibernateUtil.getHibernateSessionFactory());
		
		CamelContext context = new DefaultCamelContext();
		context.addComponent("hibernate", component);
		try {
			context.addRoutes(new RouteBuilder() {
				@Override
				public void configure() throws Exception {

					from("file:C:/Users/TTND/Desktop/Clavis - GEO/data?fileName=201702021032-FreshAmazon-Location-Availability.csv&noop=true")
						.unmarshal(new BindyCsvDataFormat(Availability.class))
						.to("hibernate:List<com.surendra.camel.entity.Availability>");
				}
			});
			context.start();
			Thread.sleep(10000);;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
