package queue;

public class Node<E> {
    public E data;
    public Node<E> next;

    public Node() {
        this.next = null;
    }

    public Node(E data) {
        this.data = data;
        this.next = null;
    }
}
