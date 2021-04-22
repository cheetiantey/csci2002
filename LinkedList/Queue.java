// Interface just describes the behavior
public interface Queue<T> {
    // Add an item to the back of the queue
    void add(T item);

    // Remove the front item and return it
    T remove();

    // Return the number of items in the queue
    int size();

    // Return whether the queue is empty
    boolean isEmpty();
}