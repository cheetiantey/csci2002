// Interface just describes the behavior
public interface Stack<T> {
    // Add an item to the top of the stack
    void push(T item);

    // Remove the top item and return it
    T pop();

    // Return the number of items in the stack
    int size();

    // Return whether the stack is empty
    boolean isEmpty();
}