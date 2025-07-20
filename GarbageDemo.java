class GarbageDemo {
	public static void main(String... args) {
		GarbageDemo g1 = new GarbageDemo();
		GarbageDemo g2 = new GarbageDemo();
		GarbageDemo g3 = new GarbageDemo();
		GarbageDemo g4 = new GarbageDemo();
		
		System.out.println(g1.hashCode());
		System.out.println(g2.hashCode());
		System.gc();
		try {
			Thread.sleep(10000);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(g3.hashCode());
		System.out.println(g4.hashCode());
	}
	@SuppressWarnings({"removal", "deprecated"})
	protected void finalize() throws Throwable {
		System.out.println("Garbage Collection Works");
	}
}