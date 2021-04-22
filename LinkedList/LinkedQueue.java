public class LinkedQueue<T> implements Queue<T> {

    private LinkedList<T> q = new LinkedList<T>();

    @overide
    public void add(T item) {
        q.addBack(item);
    }

    @override 
    public T remove() {
        return q.removeFront();
    }

    @override
    public int size() {
        return q.size();
    }

    @override
    public boolean isEmpty() {
        q.isEmpty();
    }

    public static void main(String[] args) {
         Queue<Integer> queue = new LinkedQueue<Integer>();
         assert queue.size() == 0;
         assert queue.isEmpty();

         queue.add(42);
         assert queue.size() == 1;
         assert !queue.isEmpty();

         assert queue.remove == 42;
         assert queue.size() == 0;
         assert queue.isEmpty();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        assert queue.remove() == 1;
        assert queue.remove() == 2;
        assert queue.remove() == 3;
        assert queue.size() == 0;
        assert queue.isEmpty();

        System.out.println("All tests completed.");
    }

}