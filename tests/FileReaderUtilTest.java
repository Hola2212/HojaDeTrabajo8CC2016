import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderUtilTest {

    @Test
    public void testReadPatients() {
        FileReaderUtil reader = new FileReaderUtil();
        Vector<Paciente> pacientes = reader.readPatients("resources/pacientes.txt");
        assertFalse(pacientes.isEmpty());
        assertEquals("Carlos Méndez", pacientes.get(0).getNombre());
    }

    @Test
    public void testInvalidFile() {
        FileReaderUtil reader = new FileReaderUtil();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    reader.readPatients("archivoFake.txt");
                });
    }
}