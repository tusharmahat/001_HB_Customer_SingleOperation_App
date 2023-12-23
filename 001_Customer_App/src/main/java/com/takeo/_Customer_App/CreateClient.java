package com.takeo._Customer_App;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.takeo.entity.Customer;
import com.takeo.utilities.SessionUtility;

public class CreateClient {
	public static void create(int cid) {
		Session ses = SessionUtility.getSession();
		Transaction tx = ses.beginTransaction();

		// create a new Customer object
		Customer c = new Customer();
		c.setCid(cid);
		c.setCname("Tushar Mahat");
		c.setEmail("tusharmahat@hotmail.com");
		c.setAddress("Canada");
		c.setPhone(90232132);

		Integer id = (Integer) ses.save(c); // save returns id

		// ses.persist(c); //return type void

		System.out.println("Created a Customer with " + id + " successfully");
		tx.commit();
		ses.close();
	}
}
