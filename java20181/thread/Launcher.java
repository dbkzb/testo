package thread;

public class Launcher {

	public static void main(String[] args) {
	
		Film p1 = new Film("Heidi");
		Film p2 = new Film("Biene Maja");
		Film p3 = new Film("Nils Holgersson");

		p1.start();
		p2.start();
		p3.start();
	}
}
