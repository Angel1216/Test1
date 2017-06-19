package com.test.others;

public class Test {

	  
	public static void main(String[] args){
		String product = "Pen";
		product=product.toLowerCase();
		product=product.concat(" BOX ABCDEFGHIJK".toLowerCase());
		
		    
		System.out.println(product.subSequence(6, 11));
		// X ABC
	}
		  
		
}
