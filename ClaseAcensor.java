// El ascensor. Solo sabe subir, bajar y abrir/cerrar puertas.
public class Ascensor {
    private int pisoActual;
    private Puerta puerta;
    private int destino;  // el piso al que quiere ir
    private boolean tieneDestino;

    public Ascensor(int pisoInicial) {
        this.pisoActual = pisoInicial;
        this.puerta = new Puerta();
        this.destino = pisoInicial;
        this.tieneDestino = false;
    }

    public void irAlPiso(int piso) {
        destino = piso;
        tieneDestino = true;
        System.out.println("Nuevo destino: piso " + piso);
    }

    // Esto representa un "paso" del ascensor
    public void mover() {
        if (!tieneDestino) {
            System.out.println("Ascensor sin destino.");
            return;
        }

        if (pisoActual < destino) {
            pisoActual++;
            System.out.println("Subiendo... piso " + pisoActual);
        } else if (pisoActual > destino) {
            pisoActual--;
            System.out.println("Bajando... piso " + pisoActual);
        } else {
            System.out.println("Llegó al piso " + pisoActual);
            puerta.abrir();
            tieneDestino = false;
        }
    }

    public int getPisoActual() {
        return pisoActual;
    }
}
 