package com.jblose.projectEuler.problems;

public class driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Problem001();
		Problem002();
		
	}
	
	public static void Problem001(){
		System.out.println("EXEC: Problem 1");
		Problem001 p1 = new Problem001();
		p1.setUp(1000,3,5);
		p1.solve();
		System.out.println("*ANS: ".concat(Double.toString(p1.getAnswer())));
	}
	
	public static void Problem002(){
		System.out.println("EXEC: Problem 2");
		Problem002 p2 = new Problem002();
		p2.setUp(4000000);
		p2.solve();
		System.out.println("*ANS: ".concat(Double.toString(p2.getAnswer())));
	}
}
