package ejemplo1.mejora;

public class Tuple<A, B> {

	private A firstElement;
	private B secondElement;

	public Tuple(A firstElement, B secondElement) {
		this.firstElement = firstElement;
		this.secondElement = secondElement;
	}

	public A getFirstElement() {
		return firstElement;
	}

	public B getSecondElement() {
		return secondElement;
	}

}
