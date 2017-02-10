package com.surendra.camel.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author TTND
 *
 */
public class HibernateUtil {

	public static SessionFactory getHibernateSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		return configuration.buildSessionFactory();
	}
}
