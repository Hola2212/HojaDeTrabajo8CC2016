import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JavaPriorityQueueTest {

    @Test
    public void testAddAndRemove() {
        JavaPriorityQueue<Integer> queue = new JavaPriorityQueue<>();
        queue.add(50);
        queue.add(10);
        queue.add(30);
        assertEquals(10, queue.remove());
        assertEquals(30, queue.remove());
        assertEquals(50, queue.remove());
    }

    @Test
    public void testIsEmpty() {
        JavaPriorityQueue<Integer> queue = new JavaPriorityQueue<>();
        assertTrue(queue.isEmpty());
        queue.add(1);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testSize() {
        JavaPriorityQueue<Integer> queue = new JavaPriorityQueue<>();
        queue.add(1);
        queue.add(2);
        assertEquals(2, queue.size());
        queue.remove();
        assertEquals(1, queue.size());
    }

    @Test
    public void testRemoveEmptyQueue() {
        JavaPriorityQueue<Integer> queue = new JavaPriorityQueue<>();
        assertNull(queue.remove());
    }
}