package com.takeo._Customer_App;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.takeo.entity.Customer;
import com.takeo.utilities.SessionUtility;

public class RetrieveClient {

	public static void retrieve(int cid) {
		Session ses = SessionUtility.getSession();
		Transaction tx = ses.beginTransaction();

//		Customer c = ses.get(Customer.class, 5); // EAGER LOADING, returns object or NULL
//		if (c != null) {
//			System.out.println(c.getCid() + "\t" + c.getCname());
//		} else {
//			System.out.println("Not found");
//		}

		Customer c = ses.load(Customer.class, cid); // LAZY LOADING, returns proxy object

		try {
			System.out.println("Found Customer: id: " + c.getCid() + "\t Customer name:" + c.getCname());
		} catch (ObjectNotFoundException e) {
			System.out.println("Customer not found");
		}

		ses.close();
	}
}
