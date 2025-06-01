package Parcial;

public class Act3P {
    public static int MAXM = 20;
    public static int MAXA = 3;
    public static int SEPARADOR = 0;

    public static void main(String[] args) {
        int[] arrM = { 0, 0, 34, 2, 12, 25, 0, 32, 55, 12, 3, 88, 14, 0, 0, 17, 36, 19, 0, 0 };
        int[] arrA = { 2, 3, 6 };
        int ini = 0, fin = -1;
        int contador = 0;
        while (ini < MAXM) {
            ini = buscarIni(arrM, fin + 1);
            if (ini < MAXM) {
                fin = buscarFin(arrM, ini);
                int tamano = fin - ini + 1;
                contador++;
                if (asignarAula(arrM, arrA, tamano, contador)) {
                    eliminar(arrM, ini, fin);
                    fin = ini;
                }
            } else {
                System.out.println("no se pudo " + contador);
            }
        }
        mostrarArreglo(arrM);
        System.err.println();
        mostrarArregloB(arrA);
    }

    public static boolean asignarAula(int[] arrM, int[] arrA, int tamano, int contador) {
        boolean encontrada = false;
        int i = 0;
        while (i < MAXA && !encontrada) {
            if (tamano <= arrA[i]) {
                System.out.println(contador + " asignar " + i);
                arrA[i] = -arrA[i];
                encontrada = true;
            }
            i++;
        }
        return encontrada;
    }

    public static void eliminar(int[] arrM, int ini, int fin) {
        for (int i = 0; i < fin; i++) {
            corrimientoIzq(arrM, ini);
        }
    }

    public static void corrimientoIzq(int[] arrM, int ini) {
        for (int i = ini; i < MAXM - 1; i++) {
            arrM[i] = arrM[i + 1];
        }
    }

    public static int buscarIni(int[] arreglo, int ini) {
        while (ini < MAXM && arreglo[ini] == SEPARADOR) {
            ini++;
        }
        return ini;
    }

    public static int buscarFin(int[] arreglo, int ini) {
        while (ini < MAXM && arreglo[ini] != SEPARADOR) {
            ini++;
        }
        return ini - 1;
    }
    public static void mostrarArreglo(int arr[]){
        for (int pos = 0; pos < MAXM; pos++) {
            System.out.print("|"+arr[pos]+"|");
        }
    }
    public static void mostrarArregloB(int arr[]){
        for (int pos = 0; pos < MAXA; pos++) {
            System.out.print("|"+arr[pos]+"|");
        }
    }
}
