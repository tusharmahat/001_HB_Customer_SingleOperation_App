package com.takeo._Customer_App;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.takeo.entity.Customer;
import com.takeo.utilities.SessionUtility;


public class DeleteClient {

	public static void delete(int cid) {
		Session ses = SessionUtility.getSession();
		Transaction tx = ses.beginTransaction();

		// create a new Customer
		Customer c = new Customer();
		c.setCid(cid);

		ses.delete(c);
		System.out.println("Deleted Customer with cid: " + c.getCid() + " successfully");

		tx.commit();
		ses.close();
	}
}
