package queue;

public class LinkedQueue<E> implements Queue<E> {
    public Node<E> head;
    public Node<E> tail;
    public int size;

    public LinkedQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        
        if (isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        
        this.size++;
    }

    @Override
    public E remove() {
        E removedData = this.head.data;
        this.head = this.head.next;

        if (this.size == 1) {
            this.tail = null;
        }
        
        this.size--;
        return removedData;
    }

    @Override
    public E peek() {
        return this.head.data;
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
