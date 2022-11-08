package stack;

public class Node<E> {
    public E value;
    public Node<E> next;

    public Node(E value) {
        this.value = value;
        this.next = null;
    }

}
