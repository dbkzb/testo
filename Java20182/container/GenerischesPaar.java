package container;

public class GenerischesPaar<T> {

	private T l;
	private T r;

	public GenerischesPaar(T l, T r) {

		this.l = l;
		this.r = r;
	}

	public T getL() {

		return this.l;
	}

	public T getR() {

		return this.r;
	}

	public String toString() {

		return "(l,r) = (" + this.l + "," + this.r + ")";
	}
}
