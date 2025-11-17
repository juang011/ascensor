public class Main {
    public static void main(String[] args) {
        SistemaControl sistema = new SistemaControl(5);

        System.out.println("=== Prueba 1: Usuario llama el ascensor desde piso 3 ===");
        sistema.presionarSubir(3);

        for (int i = 0; i < 5; i++) {
            sistema.tick();
        }

        System.out.println("\n=== Prueba 2: Usuario dentro pide ir al piso 5 ===");
        sistema.presionarDentro(5);

        for (int i = 0; i < 5; i++) {
            sistema.tick();
        }
    }
}
