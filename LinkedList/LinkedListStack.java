public class LinkedListStack<T> implements Stack<T> {

    private LinkedList<T> stack = new LinkedList<T>();

    @Override
    public void push(T item) {
        stack.addFront(item);
    }

    @Override
    public T pop() {
        return stack.removeFront();
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Stack<Integer> stk = new LinkedListStack<Integer>();
        assert stk.size() == 0;
        assert stk.isEmpty();

        stk.push(42);
        assert stk.size() == 1;
        assert !stk.isEmpty();

        assert stk.pop() == 42;
        assert stk.size() == 0;
        assert stk.isEmpty();

        System.out.println("All tests completed.");

    }

}