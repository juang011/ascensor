// Cada piso tiene dos botones: subir y bajar.
public class Piso {
    private int numero;
    private Boton subir;
    private Boton bajar;

    public Piso(int numero) {
        this.numero = numero;

        subir = new Boton(numero);
        bajar = new Boton(numero);
    }

    public Boton getSubir() {
        return subir;
    }

    public Boton getBajar() {
        return bajar;
    }

    public int getNumero() {
        return numero;
    }
}
