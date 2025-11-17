# ascensor
para hacer este proyecto primero pensé en las partes reales que tiene un ascensor:
los botones, el ascensor como tal, la puerta y los pisos.

Decidí crear una clase para cada cosa porque así es más fácil entenderlo y trabajar paso por paso.
Primero hice el ascensor solo, que pudiera subir y bajar.
Después hice los botones y las puertas.
Al final junté todo en la clase SistemaControl, que es la que recibe las solicitudes.

La idea general es que:

Si alguien presiona un botón en un piso → el sistema manda el ascensor allá.

Si alguien presiona un botón dentro del ascensor → lo lleva a ese piso.

El ascensor se mueve de uno en uno usando un método mover().

Cuando llega, abre la puerta.

Lo mantuve sencillo para poder entenderlo bien.
