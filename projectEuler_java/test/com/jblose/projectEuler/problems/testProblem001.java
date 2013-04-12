package com.jblose.projectEuler.problems;

import org.junit.Test;

import com.jblose.projectEuler.problems.Problem001;

import static org.junit.Assert.*;


/**
 * Problem 001
 * Solves: Find the sum of all the multiples of 3 or 5 below 1000. 
 * Example: If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * @author jblose
 *
 */

public class testProblem001 {
			
	@Test 
	public void testGetAnswer(){
		Problem001 p1 = new Problem001();
		assertEquals(0,p1.getAnswer(),0);
	}
	
	//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
	@Test 
	public void testSolve(){
		Problem001 p1 = new Problem001();
		p1.setUp(10, 3, 5);
		p1.solve();
		assertEquals(23,p1.getAnswer(),0);
	}

}
