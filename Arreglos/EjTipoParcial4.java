package Arreglos;

public class EjTipoParcial4 {

    // pedidos arrego p tamaño MAXP
    final static int MAXP = 25;

    final static int SEPARADOR = 0;

    // MAXT
    final static int MAXT = 2;

    public static void main(String[] args) {
        // los numeros mayor a 0 son productos
        int[] arrP = { 0, 0, 12, 9, 18, 0, 15, 5, 4, 7, 10, 0, 8, 9, 12, 0, 19, 10, 9, 0, 0, 0, 0, 0, 0 };

        // producto promocionado
        int R = 22;
        // cantidad del productos promocionados R es de 2
        int C = 4;

        // si arrP tiene almenos un producto de este arreglo debo insertar R en arrP
        int[] arrT = { 8, 9 };

        // se debe notificar cuantos productos R quedaron sin agregar si es que los haya

        // que debo hacer:

        int inicio = 0;
        int fin = -1;

        int cantidadSecuencias = contarSecuencias(arrP);

        int contadorDePromociones = 0;
        // buscar inicio y fin
        while (inicio < MAXP) {
            inicio = buscarInicio(arrP, fin + 1);
            if (inicio < MAXP) {
                fin = buscarFin(arrP, inicio);
                // validar que haya R para dar todavia, R marcado por C
                if (contadorDePromociones < C && C < cantidadSecuencias) {
                    // validar si es posible poner la promocion en cada secuencia buscando los
                    // elementos de arrT en arrP
                    if (promocionValida(arrP, arrT, inicio, fin)) {
                        if (fin + 1 < MAXP && arrP[fin + 1] == SEPARADOR) {
                        corrimientoDerecha(arrP, fin + 1);
                        arrP[fin + 1] = R;
                        contadorDePromociones++;
                    }
                    }
                } else {
                    System.out.println("No se pudieron dar todas las ofertas sobraron " + (C - contadorDePromociones));
                }
                inicio = fin + 1;
            }
        }
        if (contadorDePromociones < C) {
            System.out.println("No se pudieron dar todas las ofertas. Sobraron " + (C - contadorDePromociones));
        }
        mostrarArreglo(arrP);

    }
    public static int contarSecuencias(int[]arrP){
        int inicio = 0;
        int fin = -1;
        int cantidad = 0;

        while (inicio < MAXP) {
            inicio = buscarInicio(arrP, fin+1);
            if (inicio < MAXP) {
                fin = buscarInicio(arrP, inicio);
                cantidad++;
            }
        }

        return cantidad;
    }

    public static void corrimientoDerecha(int[] arr, int desde) {
        for (int i = MAXP - 1; i > desde; i--) {
            arr[i] = arr[i - 1];
        }
    }

    public static boolean promocionValida(int[] arrP, int[] arrT, int inicio, int fin) {
        int i = inicio;
        boolean promocion = false;

        while (i <= fin && !promocion) {
            int j = 0;
            while (j < MAXT && !promocion) {
                if (arrP[i] == arrT[j]) {
                    promocion = true;
                }
                j++;
            }
            i++;
        }
        return promocion;
    }

    public static int buscarInicio(int[] arr, int inicio) {
        while (inicio < MAXP && arr[inicio] == SEPARADOR) {
            inicio++;
        }
        return inicio;
    }

    public static int buscarFin(int[] arr, int fin) {
        while (fin < MAXP && arr[fin] != SEPARADOR) {
            fin++;
        }
        return fin - 1;
    }
    public static void mostrarArreglo(int arr[]) {
        for (int pos = 0; pos < MAXP; pos++) {
            System.out.print("|" + arr[pos] + "|");
        }
    }
}
