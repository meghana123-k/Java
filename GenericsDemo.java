
class GenericDemo<gd> {
	private gd x;
	public static <gd> void gdm(gd vname) {
		System.out.println(vname+" = "+vname.getClass());
	}
}
class GenericsDemo {
	public static void main(String... args) {
		GenericDemo<String> g = new GenericDemo<>();
		g.gdm("Meghana");
		GenericDemo<Integer> g1 = new GenericDemo<>();
		g.gdm(100);
		GenericDemo<Double> g2 = new GenericDemo<>();
		g.gdm(45.89);
		GenericDemo<Number> g3 = new GenericDemo<>();
		g3.gdm(10);
	}
}