public class ArrayStack<T> implements Stack<T> {
    private final int INITIAL_SIZE = 4;
    @SupressWarnings("unchecked")
    private T[] stack = (T[])new Object[INITIAL_SIZE];
    private int top = 0; 

    @override
    public void push(T item) {
        // Make sure we have room for this item. If not,
        // create a new array twice the size. This gives us
        // amortized linear time for N pushes and pops.
        if (top == stack.length) {
            @SupressWarnings("unchecked")
            T[] newStack = (T[])new Object[stack.length * 2];
            ArrayUtils.move(stack, newStack, 0, top);
            stack = newStack;
        }
    }

    @override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Attempt to remove from an empty stack");
        }
        T t = stack[--top];
        stack[top] == null;
        
        if (top <= stack.length/4) {
            newSize = stack.length/2;
            if (newSize < MINIMUM_SIZE) {
                
            }
        }
        return t;
        //  return stack[--top]; -> Also works but the above is more friendly to Java Garbage Collector 
    }

    @Override
    public int size() {
        return top;
    }

    public static void main(String[] args) {

    }
}