package Arreglos.Parcial;

public class patron {
    final static int MAX = 21;
    final static int MAXP = 3;
    final static int SEPARADOR = -1;

    public static void main(String[] args) {
        
        int [] arr = {-1,12,22,44,-1,23,34,55,-1,23,34,55,-1,23,34,55,-1,23,34,57,-1};

        int cantidadMaximaPatron = 2;
        int cantidadEncontradaPatron = 0;
        int ini = 0;
        int fin = -1;
        int [] patron = {23,34,55};

        while (ini < MAX) {
            ini = buscarIni(arr, fin+1);
            if (ini < MAX) {
                fin = buscarFin(arr, ini);

                if (secuenciaValida(arr, ini, fin, patron)) {
                    
                    cantidadEncontradaPatron++;

                    if (cantidadEncontradaPatron > cantidadMaximaPatron) {
                        
                        eliminarSecuencia(arr, ini, fin);

                        fin = ini;
                    }
                } else {
                    cantidadEncontradaPatron = 0;
                }
            }
        }
        mostrarArreglo(arr);
    }
    public static boolean secuenciaValida(int[]arr, int ini, int fin, int [] patron){
        int i = 0;
        int j = ini;
        boolean valida = true;
        while (i < MAXP && valida) {
            if (arr[j] != patron[i]) {
                valida = false;
            }
            i++;
            j++;
        }
        return valida;
    }
    public static void eliminarSecuencia(int[]arr, int ini, int fin){
        for (int i = ini; i <= fin; i++) {
            corrimientoIzquierda(arr, ini);
        }
    }
    public static void corrimientoIzquierda(int[]arr, int pos){
        for (int i = pos; i < MAX - 1; i++) {
            arr[i] = arr[i+1];
        }
    }
    public static int buscarIni(int[]arrE, int pos){
        while (pos < MAX && arrE[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }
    public static int buscarFin(int[]arrE, int pos){
        while (pos < MAX && arrE[pos] != SEPARADOR) {
            pos++;
        }
        return pos-1;
    }
    public static void mostrarArreglo(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("|" + arr[pos] + "|");
        }
    }
}
