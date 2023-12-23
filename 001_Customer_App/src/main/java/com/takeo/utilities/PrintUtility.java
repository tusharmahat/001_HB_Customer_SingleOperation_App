package com.takeo.utilities;

import java.util.Scanner;

public class PrintUtility {
	public static void pause() {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Press <Enter> to Continue......");
		scnr.nextLine();
	}
}
