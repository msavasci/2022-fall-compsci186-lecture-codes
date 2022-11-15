package queue;

public class LinkedQueue<E> implements Queue<E> {
    public Node<E> front;
    public Node<E> tail;
    public int size;

    public LinkedQueue() {
        this.front = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void add(E e) {
        // We added to tail to make complexity constant.
        Node<E> node = new Node<>(e);

        if (isEmpty()) {
            this.front = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }

        this.size++;
    }

    @Override
    public E remove() {
        E data = this.front.data;
        this.front = this.front.next;

        if (this.front == null) {
            this.tail = null;
        }

        this.size--;
        return data;
    }

    @Override
    public E peek() {
        return this.front.data;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }


}
