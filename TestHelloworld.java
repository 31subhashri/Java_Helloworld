import static org.junit.Assert.*;

import org.junit.Test;

class TestHelloworld extends Helloworld {
	
	
	@Test
	public void testResult() {
		Helloworld ob = new Helloworld();
		String output = ob.Result();
		assertEquals("Hello SUBHASHRI",output);
	}

}
