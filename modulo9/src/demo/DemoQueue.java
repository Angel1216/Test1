package demo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DemoQueue {
	
	public static void main(String[] args){
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		LinkedList<Integer> n = new LinkedList<Integer>();
	
		System.out.println("With LinkedList!!");
		n.add(1);
		n.add(5);
		n.add(10);
		
		
		System.out.println(n.size());
		n.remove(1);
		System.out.println(n.size());
		
		
	}

}
