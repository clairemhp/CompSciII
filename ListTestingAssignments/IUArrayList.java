import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * Array-based implementation of IndexedUnsortedList.
 * Does not support ListIterator.
 * 
 * @author Claire Haener-Pope
 * 
 * @param <T> type to store
 */

public class IUArrayList<T> implements IndexedUnsortedList<T> {
	
	private T[] array;
	private int rear;
	private int modCount;
	private static final int DEFAULT_CAPACITY = 10;
	
	/**
	 * Default constructor. Creates an array with the default capacity of 10.
	 */
	public IUArrayList() {
		this(DEFAULT_CAPACITY);
	}
	
	/**
	 * Single-argument constructor. Array size is based on the initialCapacity parameter.
	 * @param initialCapacity - the initial capacity of the array
	 */
	@SuppressWarnings("unchecked")
	public IUArrayList(int initialCapacity) {
		array = (T[]) new Object[initialCapacity];
		rear = 0;
		modCount = 0;
	}

	private void expandIfNecessary() {
		if(rear >= array.length) {
			array = Arrays.copyOf(array, (array.length * 2));
		}
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAfter(T element, T target) {
		// Locate target element
		int targetIndex = indexOf(target);
		if(targetIndex < 0) {
			throw new NoSuchElementException();
		}
		// Expand capacity if necessary
		expandIfNecessary();
		// Shift all elements after target back to make room for the new element
		for(int i = (rear - 1); i > targetIndex; i--) {
			array[i+1] = array[i];
		}
		// Insert new element
		array[targetIndex + 1] = element;
		// Update rear
		rear++;
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
		// Set the last value as the returned one and remove it from the array
		T retVal = array[size() - 1];
		array[size() - 1] = null;
		// Decrement the rear
		rear--;
		// Return the value removed
		return retVal;
	}

	@Override
	public T remove(T element) {
		// Locate element and store the value for later return
		int index = indexOf(element);
		// Throw NoSuchElementException if not found
		if(index < 0) {
			throw new NoSuchElementException();
		}
		T retVal = array[index];
		// Shift all following elements forward to overwrite removed element and leave no gaps
		for(int i = index; i < rear; i++) {
			array[i] = array[i+1];
			
		}
		// Clear duplicate last element
		array[rear-1] = null;
		//Decrement rear
		rear--;
		// Return removed element
		return retVal;
	}

	@Override
	public T remove(int index) {
		// Check index is within the current array and throw a NoSuchElementException if not
		if(index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		// Set return value for later
		T retVal = array[index];
		// Shift all following elements forward to overwrite removed element and leave no gaps
		for(int i = index; i < rear; i++) {
			array[i] = array[i+1];
			
		}
		// Clear duplicate last element
		array[rear-1] = null;
		//Decrement rear
		rear--;
		// Return removed element
		return retVal;
	}

	@Override
	public void set(int index, T element) {
		// Check index is within the current array and throw a NoSuchElementException if not
		if(index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		// Set the value of the index to the given element
		array[index] = element;
	}

	@Override
	public T get(int index) {
		// Check index is within the current array and throw a NoSuchElementException if not
		if(index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		return array[index];
	}

	@Override
	public int indexOf(T element) {
		int index = -1;
		
		for(int i = 0; i < rear && index == -1; i++) {
			if(array[i].equals(element)) {
				index = i;
			}
		}
		
		return index;
	}

	@Override
	public T first() {
		if(size() == 0) {
			throw new NoSuchElementException();
		}
		return array[0];
	}

	@Override
	public T last() {
		if(size() == 0) {
			throw new NoSuchElementException();
		}
		return array[rear-1];
	}

	@Override
	public boolean contains(T target) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		return rear == 0;
	}

	@Override
	public int size() {
		return rear;
	}

	@Override
	public Iterator<T> iterator() {
		return new ALIterator();
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
	
	/** Iterator for IUArrayList */
	private class ALIterator implements Iterator<T> {
		private int nextIndex;
		private int iterModCount;
		
		public ALIterator() {
			nextIndex = 0;
			iterModCount = modCount;
		}

		@Override
		public boolean hasNext() {
			// TODO 
			return false;
		}

		@Override
		public T next() {
			// TODO 
			return null;
		}
		
		@Override
		public void remove() {
			// TODO
			
		}
	}
}
