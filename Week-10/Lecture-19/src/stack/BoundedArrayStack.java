package stack;

public class BoundedArrayStack<E> implements Stack<E> {
    E[] array;
    int top;

    public BoundedArrayStack(int capacity) {
        this.array = (E[]) new Object[capacity];
        this.top = -1;
    }

    @Override
    public void push(E e) throws StackOverflowException {
        if (isFull()) {
            throw new StackOverflowException("StackOverflow Exception");
        }

        this.top++;
        this.array[top] = e;
    }

    @Override
    public E pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("StackUnderflow Exception");
        }

        E topElement = this.array[top];
        this.array[top] = null;
        top--;
        return topElement;
    }

    @Override
    public E peek() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("StackUnderflow Exception");
        }
        
        return this.array[top];
    }

    @Override
    public boolean isEmpty() {
        return this.top == -1;
    }

    @Override
    public boolean isFull() {
        return this.top == this.array.length - 1;
    }

    @Override
    public int size() {
        return this.top + 1;
    }
}