package com.test.others;

public class Student {

	public String name="";
	public int age = 0;
	public String major = "Undeclared";
	public boolean fulltime = true;
	
	
	public void display(){
		System.out.println("name" + name + "Major:" + major);
	}
	
	
	public boolean isFullTime(){
		return fulltime;
	}
	
	public static void main(String[] args){
			
		byte by = 127;
		byte by2 = -128;
		
		short sort = 32767;
		short sort2 = -32768;
		
		int it = 2147483647;
		int it2 = -2147483648;
	
		long lng = 9223372036854775807L;
		long lng2 = -9223372036854775808L;
		
		float flat = 4.2E6F;
		
		
		double doule = 99970132745699999.999D;
		
		System.out.println(doule-1);
		
	}
	
}
