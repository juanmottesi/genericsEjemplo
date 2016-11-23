package ejemplo1.mejora;

import static org.junit.Assert.*;

import org.junit.Test;

import ejemplo1.mejora.Tuple;

public class TupleTest {

	@Test
	public void testGetStringElements(){
		Tuple<String, String> tuple = new Tuple<String, String>("hello", "world");
		assertEquals("hello", tuple.getFirstElement());
		assertEquals("world", tuple.getSecondElement());
	}

	@Test
	public void testGetIntegerElements(){
		Tuple<Integer, Integer> tuple = new Tuple<Integer, Integer>(1, 2);
		assertEquals(new Integer(1), tuple.getFirstElement());
		assertEquals(new Integer(2), tuple.getSecondElement());
	}
	
	@Test
	public void testGetElementsWithDiferentTypes(){
		Tuple<Integer, String> tuple = new Tuple<Integer, String>(1, "world");
		assertEquals(new Integer(1), tuple.getFirstElement());
		assertEquals("world", tuple.getSecondElement());
	}

}
