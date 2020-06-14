package cs12;

public class Paar<T, U> {
	protected T z1;
	protected U z2;

	public Paar(T z1, U z2) {
		super();
		this.z1 = z1;
		this.z2 = z2;
	}

	public T getZ1() {
		return z1;
	}

	public U getZ2() {
		return z2;
	}

}
