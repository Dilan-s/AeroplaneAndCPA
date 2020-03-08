import java.util.Objects;

public class Node<T> {

	private T item;
	private Node<T> next;


	public Node(T newItem) {
		item = newItem;
	}
	
	public  T getItem() {
		return item;
	}

	public  Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> nextNode) {
		this.next = nextNode;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Node)) {
			return false;
		}
		Node<?> node = (Node<?>) o;
		return Objects.equals(item, node.item);
	}

	@Override
	public int hashCode() {
		return Objects.hash(item, next);
	}
}
