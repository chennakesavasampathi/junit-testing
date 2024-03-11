package com.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.junittesting.Sum;

class CalculatingNumbers {
//	private Sum sum=new Sum();

	@Test
	void test() {
		int[] num= {1,2,3};
		Sum sum=new Sum();
		int value=sum.sumThreeDigits(num);
		int expectedValue=6;
		assertEquals( expectedValue, value);
		
		
		
////		fail("Not yet implemented");
//		assertEquals(6,sum.sumThreeDigits (new int[] {1,2,3}));
//		
	}
	
	
	
	
	@Test
	void test1() {
		int[] num= {1,2,3};
List<String> peru=Arrays.asList("chenna","thiru");		
		Sum sum=new Sum();
		String value=sum.list(peru);
		boolean expect=true;
		
	boolean result=peru.contains("chenna");
		assertEquals(true, result);
		
		
		
////		fail("Not yet implemented");
//		assertEquals(6,sum.sumThreeDigits (new int[] {1,2,3}));
//		
	}

}
