package com.jblose.projectEuler.problems;

import java.lang.Math;
/**
 * Problem 001
 * Solves: Find the sum of all the multiples of 3 or 5 below 1000. 
 * Example: If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * @author jblose
 *
 */
public class Problem001 {
	
	private double entryNumber;
	private double multiple1;
	private double multiple2;
	private double answer;
	
	/**
	 * Sets up the problem with the inputs.
	 * 
	 * @param entrynumber
	 * @param multiple1
	 * @param multiple2
	 */
	public void setUp(double entrynumber, double multiple1, double multiple2 ){
		this.entryNumber = entrynumber;
		this.multiple1 = multiple1;
		this.multiple2 = multiple2;
	}
	
	public void solve(){
		this.answer = 0;
		
		for (double x = 0; x < this.entryNumber; x++){
		// Solution 1 
		//	if( Math.IEEEremainder(x, multiple1) == 0 ||Math.IEEEremainder(x, multiple2) == 0){
		// Solution 2
			if (x % multiple1 == 0 || x % multiple2 == 0 ){
				this.answer += x;
			}
		}
	}
	
	public double getAnswer(){
		return this.answer;
	}

}
