package com.static123.pro;

public class Maharashtra {
	static String state_name = "Maharashtra State";
	int distric_id;
	String distric_name;
	
	
	public static void main(String[] args) {
		
		System.out.println("in Maharashtra state...");

		System.out.println(state_name);
		
		
		Maharashtra m1 = new Maharashtra();
		m1.distric_id = 502;
		m1.distric_name  = "kolhapur";
		System.out.println("id of distric ........1 "+m1.distric_id);
		System.out.println("Name of distric...... 1 "+m1.distric_name);
		
		
		Maharashtra m2 = new Maharashtra();
		m2.distric_id = 545;
		m2.distric_name = "Ratnagiri";
		System.out.println("id of distric 2........ "+m2.distric_id);
		System.out.println("Name of distric 2......e.  "+m2.distric_name);
		
		
		India i1 = new India();
		System.out.println("Country name is......."+i1.country_name);
		
		i1.m1();

	}

}
