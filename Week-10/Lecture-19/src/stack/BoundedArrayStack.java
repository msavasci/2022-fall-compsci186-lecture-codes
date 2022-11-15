package stack;

public class BoundedArrayStack<E> implements Stack<E> {
    E[] array;
    int top;

    public BoundedArrayStack(int capacity) {
        // Because of 'type erasure' in java
        this.array = (E[]) new Object[capacity];
        this.top = -1;
    }

    @Override
    public void push(E e) throws StackOverflowException {
        this.top++;
        this.array[top] = e;
    }

    @Override
    public E pop() throws StackUnderflowException {
        E topElement = this.array[this.top];
        // this.array[this.top] = null;
        this.top--;
        return topElement;
    }

    @Override
    public E peek() throws StackUnderflowException {
        return this.array[this.top];
    }

    @Override
    public boolean isEmpty() {
        return this.top == -1;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return top == this.array.length - 1;
    }

    @Override
    public int size() {
        return this.top + 1;
    }
}