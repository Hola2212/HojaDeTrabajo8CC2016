import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PacienteTest {

    @Test
    public void testPacienteCreation() {
        Paciente paciente = new Paciente("Juan", "fractura", 'B');
        assertEquals("Juan", paciente.getNombre());
        assertEquals("fractura", paciente.getSintoma());
        assertEquals('B', paciente.getPrioridad());
    }

    @Test
    public void testCompareToHigherPriority() {
        Paciente p1 = new Paciente("Maria", "dolor", 'A');
        Paciente p2 = new Paciente("Pedro", "fiebre", 'C');
        assertTrue(p1.compareTo(p2) < 0);
    }

    @Test
    public void testCompareToSamePriority() {
        Paciente p1 = new Paciente("Ana", "gripe", 'B');
        Paciente p2 = new Paciente("Luis", "fractura", 'B');
        assertEquals(0, p1.compareTo(p2));
    }

    @Test
    public void testToString() {
        Paciente paciente = new Paciente("Carlos", "migraña", 'D');
        String expected = "Carlos, migraña, D";
        assertEquals(expected, paciente.toString());
    }
}