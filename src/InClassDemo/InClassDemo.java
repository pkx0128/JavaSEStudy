package InClassDemo;

public class InClassDemo {
	class Contents {
		private int i = 11;
		public int value() {
			return i;
		}
	}
	
	class Destination {
		private String label;
		public Destination(String label) {
			this.label = label;
		}
		String readLabel() {
			return label;
		}
	}
	
	public void ship(String dest) {
		Contents contents = new Contents();
		Destination destination = new Destination(dest);
		System.out.println(destination.readLabel());
	}

	public static void main(String[] agrs) {
		InClassDemo demo = new InClassDemo();
		demo.ship("pankx");
		InClassDemo.Destination dest2 = new InClassDemo().new Destination("pp");
	}
}
