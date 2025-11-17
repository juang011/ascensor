// Las puertas del ascensor. Se abren y se cierran.
public class Puerta {
    private boolean abierta;

    public Puerta() {
        abierta = false;
    }

    public void abrir() {
        System.out.println("Puerta abierta.");
        abierta = true;
    }

    public void cerrar() {
        System.out.println("Puerta cerrada.");
        abierta = false;
    }

    public boolean estaAbierta() {
        return abierta;
    }
}
