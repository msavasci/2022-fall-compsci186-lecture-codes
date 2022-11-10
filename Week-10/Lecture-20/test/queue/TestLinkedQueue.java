package queue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLinkedQueue {
    @Test
    public void addOneElement() {
        LinkedQueue<Integer> lq = new LinkedQueue<>();
        lq.add(2);
        assertEquals(Integer.valueOf(2), lq.peek());
    }
}
