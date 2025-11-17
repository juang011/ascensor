// Esta clase es un botón normal. Solo guarda si está prendido o no.
public class Boton {
    private boolean encendido;
    private int piso;

    public Boton(int piso) {
        this.piso = piso;
        this.encendido = false;
    }

    public void presionar() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }

    public boolean estaEncendido() {
        return encendido;
    }

    public int getPiso() {
        return piso;
    }
}
