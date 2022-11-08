package stack;

public interface Stack<E> {
    public void push(E e) throws StackOverflowException;
    public E pop() throws StackUnderflowException;
    public E peek() throws StackUnderflowException;  
    public boolean isEmpty();
    public boolean isFull();
    public int size();
}
