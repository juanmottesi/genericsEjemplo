package ejemplo2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Function;

public class Array<E> implements List<E>{
	
	private List<E> list;
	
	public Array(){
		this.list = new ArrayList<E>();
	}

	public List<E> select(Function<E, Boolean> condition){
		List<E> elements = new ArrayList<>();
		list.forEach(element -> this.applyCondition(condition, element, elements));
		return elements;	
	}

	private void applyCondition(Function<E, Boolean> condition, E element, List<E> accumulator){
		if(condition.apply(element)){
			accumulator.add(element);
		}
	}
	
	public <A> List<A> collect(Function<E, A> transformation){
		List<A> accumulator = new ArrayList<>();
		list.forEach(element -> this.applyTransformation(transformation, element, accumulator));
		return accumulator;
	}

	private <A> void applyTransformation(Function<E, A> transformation, E element, List<A> accumulator){
		accumulator.add( transformation.apply(element));
	}


	public E detect(Function<E, Boolean> condition){
		return this.select(condition).get(0);
	}

	
	/**
	 * Protocolo basico de List
	 */
	public int size() {
		return this.list.size();
	}

	public boolean isEmpty() {
		return this.list.isEmpty();
	}

	public boolean contains(Object o) {
		return this.list.contains(o);
	}

	public Iterator<E> iterator() {
		return this.list.iterator();
	}

	public Object[] toArray() {
		return this.list.toArray();
	}

	public <T> T[] toArray(T[] a) {
		return this.list.toArray(a);
	}

	public boolean add(E e) {
		return this.list.add(e);
	}

	public boolean remove(Object o) {
		return this.list.remove(o);
	}

	public boolean containsAll(Collection<?> c) {
		return this.list.containsAll(c);
	}

	public boolean addAll(Collection<? extends E> c) {
		return this.list.addAll(c);
	}

	public boolean addAll(int index, Collection<? extends E> c) {
		return this.list.addAll(index, c);
	}

	public boolean removeAll(Collection<?> c) {
		return this.list.removeAll(c);
	}

	public boolean retainAll(Collection<?> c) {
		return this.list.retainAll(c);
	}

	public void clear() {
		this.list.clear();
	}

	public E get(int index) {
		return this.list.get(index);
	}

	public E set(int index, E element) {
		return this.list.set(index, element);
	}

	public void add(int index, E element) {
		this.list.add(index, element);
	}

	public E remove(int index) {
		return this.list.remove(index);
	}

	public int indexOf(Object o) {
		return this.list.indexOf(o);
	}

	public int lastIndexOf(Object o) {
		return this.list.lastIndexOf(o);
	}

	public ListIterator<E> listIterator() {
		return this.list.listIterator();
	}

	public ListIterator<E> listIterator(int index) {
		return this.list.listIterator(index);
	}

	public List<E> subList(int fromIndex, int toIndex) {
		return this.list.subList(fromIndex, toIndex);
	}

}
