import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * Single-linked Node-based implementation of IndexedUnsortedList.
 * 
 * @author clair
 */
public class IUSingleLinkedList<T> implements IndexedUnsortedList<T>{

	// Instance variable for our single-linked list
	private Node<T> head;
	private Node<T> tail;
	private int size;
	
	public IUSingleLinkedList() {
		head = tail = null;
		size = 0;
	}
	
	@Override
	public void addToFront(T element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addToRear(T element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(T element) {
		
	}

	@Override
	public void addAfter(T element, T target) {		
		Node<T> current = head;
		while(current != null && !current.getElement().equals(current)) {
			current = current.getNext();
		}
		if(current == null) {
			throw new NoSuchElementException();
		}
		Node<T> newNode = new Node<T>(element);
		newNode.setNext(current.getNext());
		current.setNext(newNode);
		if(newNode.getNext() == null) {
			tail = newNode;
		}
		size++;
	}

	@Override
	public void add(int index, T element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T remove(T element) {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		T retVal;
		if(head.getElement().equals(element)) {
			retVal = head.getElement();
			head = head.getNext();
			if(head == null) {
				tail = null;
			}
		}
		else {
			Node<T> preNode = head;
			while(preNode.getNext() != null && !preNode.getNext().getElement().equals(element)) {
				preNode = preNode.getNext();
			}
			
			if(preNode.getNext() == null) {
				throw new NoSuchElementException();
			}
			retVal = preNode.getNext().getElement();
			preNode.setNext(preNode.getNext().getNext());
			if(preNode.getNext() == null) {
				tail = preNode;
			}
		}
		
		size--;
		return retVal;
	}

	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void set(int index, T element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(T element) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T first() {
		if(head == null) {
			throw new NoSuchElementException();
		}
		return head.getElement();
	}

	@Override
	public T last() {
		if(tail == null) {
			throw new NoSuchElementException();
		}
		return tail.getElement();
	}

	@Override
	public boolean contains(T target) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int startingIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
