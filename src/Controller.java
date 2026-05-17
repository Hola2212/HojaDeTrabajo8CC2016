import java.util.Vector;

public class Controller {

    private IPriorityQueue<Paciente> queue;
    private FileReaderUtil reader;

    public Controller(IPriorityQueue<Paciente> queue) {
        this.queue = queue;
        reader = new FileReaderUtil();
    }

    public void cargarPacientes(String archivo) {
        Vector<Paciente> pacientes = reader.readPatients(archivo);
        for (Paciente paciente : pacientes) {
            queue.add(paciente);
        }
    }

    public void atenderPacientes() {
        System.out.println("\nOrden de atención:\n");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}