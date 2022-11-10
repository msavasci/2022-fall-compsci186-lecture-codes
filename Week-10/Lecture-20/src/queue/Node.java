package queue;

public class Node<E> {
    public E data;
    public Node<E> next;

    public Node() {

    }

    public Node(E data) {
        this.data = data;
        this.next = null;
    }
}
