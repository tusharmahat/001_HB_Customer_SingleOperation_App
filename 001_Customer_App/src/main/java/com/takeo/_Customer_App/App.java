package com.takeo._Customer_App;

import com.takeo.utilities.PrintUtility;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// insert a Customer with cid 6
		CreateClient.create(6);
		PrintUtility.pause(); // pause statement waits for user to press enter key

		// retrieves a Customer with cid 1
		RetrieveClient.retrieve(1);
		PrintUtility.pause(); // pause statement waits for user to press enter key

		// uodates a Customer with cid 2
		UpdateClient.update(2);
		PrintUtility.pause(); // pause statement waits for user to press enter key

		// deletes a Customer with cid 6
		DeleteClient.delete(6);
		PrintUtility.pause(); // pause statement waits for user to press enter key
		System.exit(0);
	}
}
