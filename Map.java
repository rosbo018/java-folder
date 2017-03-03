public interface Map<K,V>{
	public V get(K key);
	//gets value defined by the key

	public boolean contains(K key);
	//returns if key exists

	public void put(K key, V value);
	//adds the key:value to the map

	public void replace(K key, V value);
	//replaces the values defined by K key with value

	public V remove(K key);
	// removes the first occurance of the key, and returns the value

}