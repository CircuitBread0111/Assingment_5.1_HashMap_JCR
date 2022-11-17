import java.util.Iterator;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * 
 * @author Jerrin C. Redmon
 * @version 1.0
 */
public class Dictionary implements DictionaryInterface<String, String> {

		public HashMap<String, String> map = new HashMap<String, String>();
		
		
	@Override
	public String add(String key, String value) {
		return map.put(key, value);
	}

	@Override
	public String remove(String key) {
		return map.remove(key);
	}

	@Override
	public String getValue(String key) {
		return map.get(key);
	}

	@Override
	public boolean contains(String key) {
		return map.containsValue(key);
	}

	@Override
	public Iterator<String> getKeyIterator() {
		return map.keySet().iterator();
	}

	@Override
	public Iterator<String> getValueIterator() {
		return map.values().iterator();
	}

	@Override
	public boolean isEmpty() {
		return map.isEmpty();
	}

	@Override
	public int getSize() {
		return map.size();
	}

	@Override
	public void clear() {
		map.clear();
		
	}
	
	public String toString() {
		String str = "";
		for (Entry<String, String> anEntry : map.entrySet()) {
			str += String.format("Key: %s; Value: %s\n", anEntry.getKey(), anEntry.getValue());
		}
		return str;
	}

}
