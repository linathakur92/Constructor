package com.constructor;

import java.util.Scanner;

public class ParameterizedC {

	int globalvar;
	
	public ParameterizedC(int c) {
		globalvar=c;
	
	}
	public static void main(String[] args) {
		
	System.out.println(" Take the value from user");
	
	Scanner s = new Scanner(System.in);
	    int p =s.nextInt();
	    ParameterizedC  parameterizedc = new ParameterizedC(p);
	    System.out.println("Value of Global Variable :" + parameterizedc.globalvar);
	    
	             
	                    
		
	}
}
