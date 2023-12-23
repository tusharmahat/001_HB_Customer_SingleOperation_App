package com.takeo.utilities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtility {
	public static Session getSession() {
		// 1)Instantiate the configuration
		Configuration cfg = new Configuration(); // all properties are null

		// 2)add hibernate configuration file to configure the cfg object with your
		// hibernate config
		cfg.configure("hibernate.cfg.xml");

		// 3)BuilSession factory, now config details will be destroyed from the memory
		// in cfg reference
		SessionFactory factory = cfg.buildSessionFactory();

		// 4) create a session object
		Session ses = factory.openSession();

		return ses;
	}

}
