package disk;

public class Hockey extends Puck{

	public Hockey(double g) {
		super(g);
	}
	public static void main(String[] args) {
		Puck p = new Puck(4.4);

		System.out.println(p.toString());
	}

}
