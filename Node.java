/**
 * Single-linked node for constructing linear data structures
 * 
 * @author clair
 * @param element
 */
public class Node<T> {
	private T element;
	private Node<T> next;
	
	/**
	 * Creates a new Node for the given element.
	 * @param element Element associated with this Node
	 */
	public Node(T element) {
		this.element = element;
		next = null;
	}

	/**
	 * @return the lement
	 */
	public T getElement() {
		return element;
	}
	
	/**
	 * @param element the element to set
	 */
	public void setElement(T element) {
		this.element = element;
	}
	
	/**
	 * @return the next
	 */
	public Node<T> getNext() {
		return next;
	}
	
	/**
	 * @param node the next to set
	 */
	public void setNext(Node<T> next) {
		this.next = next;
	}
}
