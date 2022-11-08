package stack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBoundedArrayStack {
    @Test
    public void testOnePush()
    {
        try {
            BoundedArrayStack<String> ba = new BoundedArrayStack<>(10);
            ba.push("a");
            assertEquals("a", ba.peek());
        } catch (StackOverflowException | StackUnderflowException e) {

        }
    }

    @Test
    public void testOnePushOnePop()
    {
        try {
            BoundedArrayStack<String> ba = new BoundedArrayStack<>(10);
            ba.push("a");
            ba.pop();
            assertEquals(0, ba.size());
        } catch (StackOverflowException | StackUnderflowException e) {

        }
    }
}
