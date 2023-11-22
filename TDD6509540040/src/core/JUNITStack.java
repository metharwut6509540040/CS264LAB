package core;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	
	public void testCreateNewEmptyStack() {
		Stack s1 = new Stack();
		int size = s1.getSize() ;
		
		assertEquals(0 , size);
		boolean empty = s1.isEmpty();
		assertTrue(empty);
	}
	
	public void testPushElementToTop() {
		Stack s2 = new Stack();
		s2.pushElementToTop(1);
		int size = s2.getSize();
		
		assertEquals(1, size);
		boolean empty = s2.isEmpty();
		assertFalse(empty);
	}
	
	public void testLastInFirstOut() {
		Stack s3 = new Stack();
		s3.pushElementToTop(4);
		s3.pushElementToTop(5);
		
		int size = s3.getSize();
		int check = s3.pop();
		assertEquals(5,check);
	}
	
}
