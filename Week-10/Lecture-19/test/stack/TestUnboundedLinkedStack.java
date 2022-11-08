package stack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestUnboundedLinkedStack {
    @Test
    public void testOnePush()
    {
        try {
            UnboundedLinkedStack<String> ba = new UnboundedLinkedStack<>();
            ba.push("a");
            assertEquals("a", ba.peek());
        } catch (StackOverflowException | StackUnderflowException e) {
            
        }
    }

    @Test
    public void testOnePushOnePop()
    {
        try {
            UnboundedLinkedStack<String> ba = new UnboundedLinkedStack<>();
            ba.push("a");
            ba.pop();
            assertEquals(0, ba.size());
        } catch (StackOverflowException | StackUnderflowException e) {

        }
    }
}
