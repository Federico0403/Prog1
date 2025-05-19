package Arreglos;

public class EjTipoParcial5 {

    // MAXE pedidos de empanadas
    final static int MAXE = 16;
    final static int SEPARADOR = 0;// (NUMEROS negativos)

    public static void main(String[] args) {

        // arreglo de empanadas
        int[] arrE = { -1, 5, 5, 7, 7, -6, 4, 9, 10, -4, 1, 1, 2, 7, -9, -8 };

        // si el cliente ingresa un 7 para en el pedido 2
        // asi deberia quedar el arr E {-1 5 5 7 7 -6 4 7 9 10 -4 1 1 2 7 -9}

        int empanada = 7;
        int pedido = 2;

        int inicio = 0;
        int fin = -1;

        int contarSecuencia = 0;

        int posicionAcolocarEmpanada = 0;

        while (inicio < MAXE) {
            inicio = buscarFin(arrE, fin + 1);
            if (inicio < MAXE) {
                fin = buscarFin(arrE, inicio);
                contarSecuencia++;
                if (pedido == contarSecuencia) {
                    posicionAcolocarEmpanada = encontrarPosicion(arrE, inicio, fin, empanada);
                    corrimientoDerecha(arrE, posicionAcolocarEmpanada);
                    arrE[posicionAcolocarEmpanada] = empanada;
                } else {
                    System.out.println("no se encontro ese pedido");
                }
            }
            inicio = fin + 1;
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
        int posicion = 0;

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
            fin = 0; // corregimos valores negativos
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
