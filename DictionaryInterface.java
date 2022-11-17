import java.util.Iterator;

/**
 * Interface for the dictionary data structure
 * @author Jerrin C. Redmon
 * @version 1.0
 */
public interface DictionaryInterface <T,E> {

	/**
	 * Adds object to the dictionary
	 * @param key the key to add
	 * @param value the value paired with the given key
	 * @return the value which was given
	 */
	public T add(E key, T value);
	
	/**
	 * Removes object from the dictionary
	 * @param key the key to remove
	 * @return the value removed
	 */
	public T remove(E key);
	
	/**
	 * Gets the value paired with given key
	 * @param key the key to look up
	 * @return the value
	 */
	public T getValue(E key);
	
	/**
	 * Checks if key exists
	 * @param key the key to find
	 * @return true if it exist, otherwise false
	 */
	public boolean contains(E key);
	
	/**
	 * gets the iterator for the key
	 * @return the iterator
	 */
	public Iterator<E> getKeyIterator();
	
	/**
	 * gets the iterator for the value
	 * @return the iterator
	 */
	public Iterator<T> getValueIterator();
	
	/**
	 * checks if empty
	 * @return true if empty, otherwise false
	 */
	public boolean isEmpty();
	
	/**
	 * gets the size of the dictionary
	 * @return an int of the size
	 */
	public int getSize();
	
	/**
	 * Clears the dictionary
	 */
	public void clear();
	
}
