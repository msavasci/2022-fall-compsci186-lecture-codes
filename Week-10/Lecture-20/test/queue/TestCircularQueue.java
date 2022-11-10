package queue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCircularQueue {
    @Test
    public void addOneElement() {
        CircularQueue<Integer> cq = new CircularQueue<>(5);
        cq.add(2);
        assertEquals(Integer.valueOf(2), cq.peek());
    }
}
