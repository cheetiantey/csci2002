public interface Map<Key, Value> {

    // Associate the given key with the given value. If there is already
    // a value for this key, we change it to this value instead.
    void put(Key k, Value x);

    // Retrieve the value associated with the given key
    Value get(Key k);

    // Checks to see if the givne key is in the map
    boolean contains(Key k);

    // Returns the number of entreis in the map. 
    int size();

    // Returns true if it's empty, false otherwise
    boolean isEmpty();
}