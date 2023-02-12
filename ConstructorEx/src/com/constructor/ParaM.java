package com.constructor;

public class ParaM {
	
	int id;
	String name;
	String city;
	
	public ParaM(int userId, String userName, String userCity) {
		id = userId;
		name = userName;
		city  = userCity;
	}
	  public static void main(String[] args) {
		  ParaM param = new ParaM(10, "Pushakar", "Pune");
		  System.out.println(param.id);
		  System.out.println(param.name);
		  System.out.println(param.city);
	}

}
