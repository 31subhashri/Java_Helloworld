import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestHelloworld {
	
	Helloworld object = new Helloworld();
	@Test
	public void testResult() {
		
		String output = object.Display();
		assertEquals("Hello Subhashri",output);
	}

}
