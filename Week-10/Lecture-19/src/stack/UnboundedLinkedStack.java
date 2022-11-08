package stack;

public class UnboundedLinkedStack<E> implements Stack<E> {
    public Node<E> top;
    public int size;

    @Override
    public void push(E e) throws StackOverflowException {
        // This check is really unnecessary because our stack is unbounded but we do it here to make it compatible with the interface.
        if (isFull()) {
            throw new StackOverflowException("Overflow Exception");
        }
        
        Node<E> newNode = new Node<>(e);
        newNode.next = top;
        this.top = newNode;
        this.size++;
    }

    @Override
    public E pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Underflow Exception");
        }

        E topElement = top.value;
        this.top = top.next;
        this.size--;
        return topElement;
    }

    @Override
    public E peek() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Underflow Exception");
        }

        return this.top.value;
    }

    @Override
    public boolean isEmpty() {
        return this.top == null;
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