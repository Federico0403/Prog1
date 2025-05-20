package Arreglos;

public class EjTipoParcial5 {

    final static int MAXE = 16;
    final static int SEPARADOR = 0;

    public static void main(String[] args) {

        int[] arrE = { -1, 5, 5, 7, 7, -6, 4, 9, 10, -4, 1, 1, 2, 7, -9, -8 };

        int empanada = 10;
        int pedido = 3; // Cambiá entre 1, 2, 3, etc.

        int inicio = 0;
        int fin = -1;

        int contarSecuencia = 0;
        int posicionAcolocarEmpanada;
        boolean pedidoEncontrado = false;

        while (inicio < MAXE && !pedidoEncontrado) {
            inicio = buscarInicio(arrE, fin + 1);
            if (inicio < MAXE && !pedidoEncontrado) {
                fin = buscarFin(arrE, inicio);
                contarSecuencia++;
                System.out.println("s" + contarSecuencia);

                if (pedido == contarSecuencia) {
                    posicionAcolocarEmpanada = encontrarPosicion(arrE, inicio, fin, empanada);
                    corrimientoDerecha(arrE, posicionAcolocarEmpanada);
                    arrE[posicionAcolocarEmpanada] = empanada;
                    pedidoEncontrado = true;
                }
            }
            inicio = fin + 1;
        }

        if (!pedidoEncontrado) {
            System.out.println("No se encontró ese pedido.");
        }

        mostrarArreglo(arrE);
    }

    public static void corrimientoDerecha(int[] arr, int desde) {
        for (int i = MAXE - 1; i > desde; i--) {
            arr[i] = arr[i - 1];
        }
    }

    public static int encontrarPosicion(int[] arrE, int inicio, int fin, int empanada) {
        int i = inicio;
        boolean posicionEncontrada = false;
        int posicion = fin + 1; // por defecto al final porsi empanada es un numero grande y ninguno lo supera

        while (i <= fin && !posicionEncontrada) {
            if (empanada < arrE[i]) {
                posicion = i;
                posicionEncontrada = true;
            }
            i++;
        }
        return posicion;
    }

    public static int buscarInicio(int[] arr, int inicio) {
        while (inicio < MAXE && arr[inicio] < SEPARADOR) {
            inicio++;
        }
        return inicio;
    }

    public static int buscarFin(int[] arr, int fin) {
        if (fin < 0)
            fin = 0;
        while (fin < MAXE && arr[fin] >= SEPARADOR) {
            fin++;
        }
        return fin - 1;
    }

    public static void mostrarArreglo(int arr[]) {
        for (int pos = 0; pos < MAXE; pos++) {
            System.out.print("|" + arr[pos] + "|");
        }
    }
}
