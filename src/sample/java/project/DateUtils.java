package sample.java.project;

import java.util.Date;

public class DateUtils {

	public static void main(String[] args) {

		System.out.println("**************************");
		System.out.println("***** TODAY'S DATE *******");
		System.out.println("**************************");
		System.out.println(getLocalCurrentDate());
		System.out.println("**************************");
		System.out.println("**************************");
		System.out.println("**************************");
		System.out.println("**************************");

	}

	private static Date getLocalCurrentDate() {
		return new Date();
	}

}
