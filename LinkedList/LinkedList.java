public class LinkedList <T> {

    private class Node {
        T data;
        Node next;

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    // (front == null && back == null) || (front != null && back != null)
    private Node front = null;
    private Node back = null;
    private int numItems = 0;

    void addFront(T data) {
        // Node newNode = new Node(data, front);
        // front = newNode;
        front = new Node(data, front);
        // If the list was empty, this new front node is also the back node
        if (back == null) {
            back = front;
        }
        numItems++;
    }

    void addBack(T data) {
        Node newNode = new Node(data, null);
        if (back != null) {
            back.next = newNode;
        } else {
            // If the list was empty, the new back node is also the front node. 
            front = newNode;
        }
        back = newNode;

        numItems++;
    }


    T removeFront() {
        if (front == null) {
            throw new RuntimeException("Attempt to remove an empty list");
        } 
        Node oldFront = front;
        front = front.next;
        if (front == null) {
            back = null;
        }
        --numItems;
        return oldFront.data;
        // edge case? one item, no items
    }

    int size() {
        // O(n)
        // int count = 0;
        // for (Node n = front; n != null; n = n.next) { 
        //     count++;
        // }
        // return count;

        // O(1)
        return numItems;
    }
    boolean isEmpty() {
        return front == null;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        assert list.isEmpty();
        assert list.size() == 0;

        list.addFront(42);
        assert !list.isEmpty();
        assert list.size() == 1;

        assert list.removeFront() == 42;
        assert list.isEmpty();
        assert list.size() == 0;

        list.addBack(24);
        assert !list.isEmpty();

        assert list.removeFront() == 24;
        assert list.isEmpty();

        // LinkedList<String> strList = new LinkedList<String>();
        // assert strList.isEmpty();
        // assert strList.size() == 0;

        // strList.addFront("Hello");
        // strList.addFront("Hi");
        // strList.addBack("World!");
        // assert !strList.isEmpty();
        // assert strList.size() == 3;

        // assert strList.removeFront() == "Hi";
        // assert !strList.isEmpty();
        // assert strList.size() == 2;

        System.out.println("All tests completed.");
    }
}