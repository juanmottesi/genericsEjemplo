package ejemplo1;

public class Tuple<E> {

	private E firstElement;
	private E secondElement;

	public Tuple(E firstElement, E secondElement) {
		this.firstElement = firstElement;
		this.secondElement = secondElement;
	}

	public E getFirstElement() {
		return firstElement;
	}

	public E getSecondElement() {
		return secondElement;
	}

}
