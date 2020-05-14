package com.cognizant.singleton;

public class Main {
	public static void main(String[] args) {

		DBConn dbConn1 = DBConn.getInstance();
		System.out.println(dbConn1.hashCode());

		DBConn dbConn2 = DBConn.getInstance();
		System.out.println(dbConn2.hashCode());

		System.out.println(dbConn1 == dbConn2);

	}

}
