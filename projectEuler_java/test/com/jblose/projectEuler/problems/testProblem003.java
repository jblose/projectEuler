package com.jblose.projectEuler.problems;

import org.junit.Test;

import com.jblose.projectEuler.problems.Problem003;

import static org.junit.Assert.*;


/**
 * @author jblose
 *
 */

public class testProblem003 {
			
	@Test 
	public void testGetAnswer(){
		Problem003 p3 = new Problem003();
		assertEquals(0,p3.getAnswer(),0);
	}
	
	//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
	@Test 
	public void testSolve(){
		Problem003 p3 = new Problem003();
		p3.setUp(13195);
		p3.solve();
		assertEquals(29,p3.getAnswer(),0);
	}

}
