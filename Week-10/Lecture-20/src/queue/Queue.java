package queue;

public interface Queue<E> {
    void add(E e); 
    E remove(); // note: we would probably declare over/underflow in a "real" implementation
    E peek();
    boolean isEmpty();
    boolean isFull();
    int size();
}