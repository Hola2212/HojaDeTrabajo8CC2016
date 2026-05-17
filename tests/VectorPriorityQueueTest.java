import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VectorPriorityQueueTest {

    @Test
    public void testAddOneElement() {
        VectorPriorityQueue<Integer> queue = new VectorPriorityQueue<>();
        queue.add(10);
        assertEquals(1, queue.size());
    }

    @Test
    public void testRemoveSmallestElement() {
        VectorPriorityQueue<Integer> queue = new VectorPriorityQueue<>();
        queue.add(30);
        queue.add(10);
        queue.add(20);
        Integer result = queue.remove();
        assertEquals(10, result);
    }

    @Test
    public void testRemoveMaintainsPriorityOrder() {
        VectorPriorityQueue<Integer> queue = new VectorPriorityQueue<>();
        queue.add(50);
        queue.add(40);
        queue.add(10);
        queue.add(30);
        queue.add(20);
        assertEquals(10, queue.remove());
        assertEquals(20, queue.remove());
        assertEquals(30, queue.remove());
        assertEquals(40, queue.remove());
        assertEquals(50, queue.remove());
    }

    @Test
    public void testIsEmptyInitially() {
        VectorPriorityQueue<Integer> queue = new VectorPriorityQueue<>();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testIsEmptyAfterInsert() {
        VectorPriorityQueue<Integer> queue = new VectorPriorityQueue<>();
        queue.add(1);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testIsEmptyAfterRemoveAll() {
        VectorPriorityQueue<Integer> queue = new VectorPriorityQueue<>();
        queue.add(1);
        queue.add(2);
        queue.remove();
        queue.remove();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testRemoveFromEmptyQueue() {
        VectorPriorityQueue<Integer> queue = new VectorPriorityQueue<>();
        assertNull(queue.remove());
    }

    @Test
    public void testPatientsPriorityOrder() {
        VectorPriorityQueue<Paciente> queue = new VectorPriorityQueue<>();
        queue.add(new Paciente("Juan", "fractura", 'C'));
        queue.add(new Paciente("Maria", "apendicitis", 'A'));
        queue.add(new Paciente("Pedro", "dolor", 'B'));
        Paciente first = queue.remove();
        Paciente second = queue.remove();
        Paciente third = queue.remove();
        assertEquals('A', first.getPrioridad());
        assertEquals('B', second.getPrioridad());
        assertEquals('C', third.getPrioridad());
    }

    @Test
    public void testSizeAfterOperations() {
        VectorPriorityQueue<Integer> queue = new VectorPriorityQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        assertEquals(3, queue.size());
        queue.remove();
        assertEquals(2, queue.size());
    }

    @Test
    public void testDuplicatePriorities() {
        VectorPriorityQueue<Paciente> queue = new VectorPriorityQueue<>();
        queue.add(new Paciente("Paciente1", "dolor", 'A'));
        queue.add(new Paciente("Paciente2", "fractura", 'A'));
        queue.add(new Paciente("Paciente3", "fiebre", 'B'));
        Paciente first = queue.remove();
        Paciente second = queue.remove();
        Paciente third = queue.remove();
        assertEquals('A', first.getPrioridad());
        assertEquals('A', second.getPrioridad());
        assertEquals('B', third.getPrioridad());
    }
}