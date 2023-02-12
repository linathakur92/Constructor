package com.constructor;

public class NoArgumentC {
	
	String s="name";
	
	public NoArgumentC() {    
		
		s= "name";
	}
    public static void main(String[] args) {
		NoArgumentC n = new NoArgumentC();
	    System.out.println(n.s);
	    }
	}

