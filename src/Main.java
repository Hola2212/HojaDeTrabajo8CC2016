//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        IPriorityQueue<Paciente> queue = new VectorPriorityQueue<>();
        //IPriorityQueue<Paciente> queue = new JavaPriorityQueue<>();
        Controller controller = new Controller(queue);
        controller.cargarPacientes("resources/pacientes.txt");
        controller.atenderPacientes();
    }
}