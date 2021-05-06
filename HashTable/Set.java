public interface Set<Key> {
    
    // Add the given key to the set. If the key already exists in the set,
    // nothing happends.
    void add(Key k);

    // Checks to see if the given key is int the st
    boolean contains();

    // Returns the number of entries in the set.
    int size();

    // Returns true if the set is empty, false otherwise
    boolean isEmpty();
}