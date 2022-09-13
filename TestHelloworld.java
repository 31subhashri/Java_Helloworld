

class TestHelloworld {
	
	Helloworld object = new Helloworld();
	
	public void testResult() {
		
		String output = "Hello Subhashri";
		assertEquals("Hello Subhashri",output);
	}
	public static void main(String args[]) {
		TestHelloworld object1 = new TestHelloworld();
		object1.testResult();
	}

}
