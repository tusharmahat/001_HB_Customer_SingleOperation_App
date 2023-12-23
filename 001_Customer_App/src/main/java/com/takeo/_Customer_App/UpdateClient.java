package com.takeo._Customer_App;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.takeo.entity.Customer;
import com.takeo.utilities.SessionUtility;

public class UpdateClient {

	public static void update(int cid) {
		Session ses = SessionUtility.getSession();
		Transaction tx = ses.beginTransaction();

		Customer c = new Customer();
		c.setCid(cid);
		c.setCname("Mahat updated");
		c.setEmail("tusharmahat@gmail.com");
		c.setAddress("Canada");
		c.setPhone(90232132);

		Customer cu = (Customer) ses.merge(c); // returns object, if data available update else inserts

		// ses.saveOrUpdate(c);

		if (cu != null) {
			System.out.println("Updated successfully, Customer with cid: " + cu.getCid());
		} else {
			System.out.println("Inserted successfully, Customer with cid: " + cu.getCid());
		}

		tx.commit();
		ses.close();
	}
}
