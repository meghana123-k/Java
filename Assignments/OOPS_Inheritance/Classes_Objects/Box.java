class Box {
	int width, height, depth;
	public Box(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public int calculateVolume() {
		return width * height * depth;
	}
	public static void main(String... args){
		
	}
	static {
		Box b2 = new Box(10, 20, 30);
		System.out.println("Volume = "+b2.calculateVolume());
	}
}