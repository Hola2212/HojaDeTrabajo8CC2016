import java.io.InputStream;
import java.util.Scanner;
import java.util.Vector;

public class FileReaderUtil {
    public Vector<Paciente> readPatients(String fileName) {
        Vector<Paciente> pacientes = new Vector<>();
        InputStream input = getClass().getClassLoader().getResourceAsStream(fileName);
        if (input == null) {
            throw new IllegalArgumentException(
                    "No se encontró el archivo: " + fileName
            );
        }
        Scanner scanner = new Scanner(input);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            String nombre = parts[0].trim();
            String sintoma = parts[1].trim();
            char prioridad = parts[2].trim().charAt(0);
            Paciente paciente = new Paciente(nombre, sintoma, prioridad);
            pacientes.add(paciente);
        }
        scanner.close();
        return pacientes;
    }
}