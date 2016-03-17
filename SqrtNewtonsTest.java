package commonQuestions;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.internal.runners.model.EachTestNotifier;

public class SqrtNewtonsTest {
	
	@Test
	public void test0() {		
		int actual = SqrtNewtons.sqrtNewtons(0, 0, 0);
		assertEquals(0, actual);
	}

	@Test
	public void test1() {		
		int actual = SqrtNewtons.sqrtNewtons(1, 0, 1);
		assertEquals(1, actual);
	}
	
	@Test
	public void test2() {		
		int actual = SqrtNewtons.sqrtNewtons(2, 0, 2);
		assertEquals(1, actual);
	}
	
	@Test
	public void test3() {		
		int actual = SqrtNewtons.sqrtNewtons(3, 0, 3);
		assertEquals(1, actual);
	}
	
	@Test
	public void test4() {		
		int actual = SqrtNewtons.sqrtNewtons(4, 0, 4);
		assertEquals(2, actual);
	}
	
	@Test
	public void test5() {		
		int actual = SqrtNewtons.sqrtNewtons(5, 0, 5);
		assertEquals(2, actual);
	}

	@Test
	public void test6() {		
		int actual = SqrtNewtons.sqrtNewtons(6, 0, 6);
		assertEquals(2, actual);
	}
	
	@Test
	public void test7() {		
		int actual = SqrtNewtons.sqrtNewtons(7, 0, 7);
		assertEquals(2, actual);
	}
	
	@Test
	public void test8() {		
		int actual = SqrtNewtons.sqrtNewtons(8, 0, 8);
		assertEquals(2, actual);
	}
	
	@Test
	public void test9() {		
		int actual = SqrtNewtons.sqrtNewtons(9, 0, 9);
		assertEquals(3, actual);
	}
	
	@Test
	public void test10() {		
		int actual = SqrtNewtons.sqrtNewtons(10, 0, 10);
		assertEquals(3, actual);
	}
}
