public class Node<E> {
	private E item;
	public Node<E> next;
	private Node<E> prev;

	public Node() {
		item = null;
		next = null;
		prev = null;
	}

	public void setItem(E e) {
		item = e;
	}

	public void setNext(Node<E> n) {
		next = n;
	}

	public void setPrev(Node<E> n) {
		prev = n;
	}

	public E getItem() {
		return item;
	}

	public Node<E> getNext() {
		return next;
	}

	public Node<E> getPrev() {
		return prev;
	}
}
