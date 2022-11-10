package queue;

public class CircularQueue<E> implements Queue<E> {
    public E[] array;
    public int front;
    public int rear;
    public int size;

    public CircularQueue(int capacity) {
        this.array = (E[]) new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    @Override
    public void add(E e) {
        // if full, throw exception
        this.rear = (this.rear + 1) % this.array.length;
        this.array[this.rear] = e;
        this.size++;
    }

    @Override
    public E remove() {
        // if empty, throw exception
        E returnedElement = this.array[front];
        this.array[front] = null;
        this.front = (this.front + 1) % this.array.length;
        this.size--;
        return returnedElement;
    }

    @Override
    public E peek() {
        return this.array[front];
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean isFull() {
        return this.size == this.array.length;
    }

    @Override
    public int size() {
        return this.size;
    }
}
