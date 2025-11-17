// Este sistema controla las solicitudes del ascensor.
// Lo hice lo más simple posible.
public class SistemaControl {

    private Ascensor ascensor;
    private Piso[] pisos;

    public SistemaControl(int cantidadPisos) {
        ascensor = new Ascensor(1);

        pisos = new Piso[cantidadPisos];
        for (int i = 0; i < cantidadPisos; i++) {
            pisos[i] = new Piso(i + 1);
        }
    }

    public void presionarSubir(int piso) {
        pisos[piso - 1].getSubir().presionar();
        ascensor.irAlPiso(piso);
    }

    public void presionarBajar(int piso) {
        pisos[piso - 1].getBajar().presionar();
        ascensor.irAlPiso(piso);
    }

    public void presionarDentro(int piso) {
        ascensor.irAlPiso(piso);
    }

    public void tick() {
        ascensor.mover();
    }
}
