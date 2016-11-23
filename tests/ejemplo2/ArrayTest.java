package ejemplo2;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ArrayTest {

	private void assertContains(List<?> arrayResult, List<?> asList) {
		arrayResult.forEach((element) -> assertTrue(asList.contains(element)));		
	}

	@Test
	public void testSelect(){
		Array<String> array = new Array<>();
		array.add("hello");
		array.add("world");
		array.add("first");
		array.add("second");
		array.add("end");
		
		List<String> arrayResult = array.select((element) -> element.contains("o"));
		
		assertEquals(3, arrayResult.size());
		this.assertContains(arrayResult, Arrays.asList("hello", "world", "second"));		
	}
	
	@Test
	public void testCollect(){
		Array<String> array = new Array<>();
		array.add("hello");
		array.add("world");
		array.add("first");
		array.add("second");
		array.add("end");
		
		List<Integer> arrayResult = array.collect((element) -> element.length());
		
		assertEquals(5, arrayResult.size());
		this.assertContains(arrayResult, Arrays.asList(5,5,5,6,3));		
	}

	
	@Test
	public void testDetect(){
		Array<String> array = new Array<>();
		array.add("hello");
		array.add("world");
		array.add("first");
		array.add("second");
		array.add("end");
		
		String arrayResult = array.detect((element) -> element.contains("world"));
		
		assertEquals("world", arrayResult);		
	}

}
