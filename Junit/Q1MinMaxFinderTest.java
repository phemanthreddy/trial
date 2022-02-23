
package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Q1MinMaxFinderTest {
	Q1MinMaxFinderTest finder;
 @BeforeEach
 void init()
 {
	 finder=new Q1MinMaxFinderTest();
 }
	@Test
	void test1() {
		int exp[]= {3,56};
		int a[]=new int[]{56, 34, 7,3, 54, 3, 34, 34, 53};

		assertArrayEquals(exp, finder.findMinMax(a),"It will check first and last element");
	}
	@Test
	void test2() {
		int exp[]= {-96,-3};
		int a[]=new int[]{-96, -34, -7,-3, -54, -3, -34, -34, -53};

		assertArrayEquals(exp, finder.findMinMax(a),"It will check first and last element");
	}
	private int[] findMinMax(int[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	@Test
	void test3() {
		int exp[]= {0,99};
		int a[]=new int[]{99, 34, 7,4, 54, 0, 34, 34, 53};

		assertArrayEquals(exp, finder.findMinMax(a),"It will check first and last element");
	}

}