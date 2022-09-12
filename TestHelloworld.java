import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestHelloworld {
	
	
	@Test
	public void testResult() {
		
		String output = Helloworld.main();
		assertEquals("Hello Subhashri",output);
	}

}
