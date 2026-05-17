import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ControllerTest {

    @Test
    public void testControllerCreation() {
        IPriorityQueue<Paciente> queue = new VectorPriorityQueue<>();
        Controller controller = new Controller(queue);
        assertNotNull(controller);
    }

    @Test
    public void testLoadPatients() {
        IPriorityQueue<Paciente> queue = new VectorPriorityQueue<>();
        Controller controller = new Controller(queue);
        controller.cargarPacientes("resources/pacientes.txt");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testPatientsAttendInCorrectOrder() {
        IPriorityQueue<Paciente> queue = new VectorPriorityQueue<>();
        Controller controller = new Controller(queue);
        controller.cargarPacientes("resources/pacientes.txt");
        Paciente first = queue.remove();
        assertEquals('A', first.getPrioridad());
    }
}