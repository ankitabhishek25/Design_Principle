package com.cognizant.singleton;

public class DBConn {

	private static DBConn instance = null;

	private DBConn() {

	}

	public static DBConn getInstance() {

		if (instance == null) {
			instance = new DBConn();
		}
		return instance;
	}

}
