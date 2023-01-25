package testMain;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import entity.OddEven;

public class mainTest {

	@Test
	public void testInputIsEven(){
	 assertTrue(OddEven.checkIfInputIsAnEvenNumber(10)); 

	 }
}


