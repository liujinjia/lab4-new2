import static org.junit.Assert.*;
import java.util.*;

import org.junit.Before;
import org.junit.Test;

public class Assignment3Test {
	Assignment3 test = new Assignment3();

	

	@Test
	public void testFindPowerOfThree() {
		
		int[] res=test.findPowerOfThree(4);
		int[] a = {1,3,9,27};
		assertEquals(a, res);
	}

	@Test
	public void testCountDigits() {
		int a = test.countDigits(100);
		
		assertEquals(1, a);
	}

	@Test
	public void testPrintNumbers() {
	     
	       assertEquals(1, test.countDigits(100));
		
	}

	@Test
	public void testGeneratePascalsTriangle() {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        one.add(1);
        list.add(one);
        List<Integer> two = new ArrayList<>();
        two.add(1); two.add(1);
        list.add(two);
        List<Integer> three = new ArrayList<>();
        three.add(1); three.add(2); three.add(1);
        list.add(three);
        assertEquals(list,test.generatePascalsTriangle(3));
	}

	@Test
	public void testReverseVowels() {
		String a = test.reverseVowels("hello");
		assertEquals(a, "holle");
	}

	@Test
	public void testLengthOfLastWord() {
		int a = test.lengthOfLastWord("hello world");
		assertEquals(a, 5);
	}

	@Test
	public void testReverseString2() {
		String a = test.reverseString2("I like soccer");
		assertEquals(a, "soccer like I");
	}

	@Test
	public void testCheckMessage() {
		int a = test.checkMessage("SOSSUSSOP");
		assertEquals(a, 2);
	}


}
