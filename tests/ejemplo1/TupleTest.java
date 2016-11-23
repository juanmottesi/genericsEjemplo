package ejemplo1;


import static org.junit.Assert.*;

import org.junit.Test;


public class TupleTest {
	
	@Test
	public void testGetStringElements(){
		Tuple<String> tuple = new Tuple<String>("hello", "world");
		assertEquals("hello", tuple.getFirstElement());
		assertEquals("world", tuple.getSecondElement());
	}

	@Test
	public void testGetIntegerElements(){
		Tuple<Integer> tuple = new Tuple<Integer>(1, 2);
		assertEquals(new Integer(1), tuple.getFirstElement());
		assertEquals(new Integer(2), tuple.getSecondElement());
	}
	
}
