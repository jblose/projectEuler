package com.jblose.projectEuler.problems;

import org.junit.Test;

import com.jblose.projectEuler.problems.Problem002;

import static org.junit.Assert.*;


/**
 * @author jblose
 *
 */

public class testProblem002 {
			
	@Test 
	public void testGetAnswer(){
		Problem002 p2 = new Problem002();
		assertEquals(0,p2.getAnswer(),0);
	}
	
	//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
	@Test 
	public void testSolve(){
		Problem002 p2 = new Problem002();
		p2.setUp(100);
		p2.solve();
		assertEquals(44,p2.getAnswer(),0);
	}

}
