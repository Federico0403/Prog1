package Arreglos;

public class LapiceraYHojaAct4 {
    final static int MAXP = 25;
    final static int MAXT = 2;
    final static int SEPARADOR = 0;

    public static void main(String[] args) {
        int[] arrP = { 0, 0, 12, 9, 18, 0, 15, 5, 4, 7, 10, 0, 8, 9, 12, 0, 19, 10, 9, 0, 0, 0, 0, 0, 0 };
        int R = 22;
        int C = 3;
        int[] arrT = { 8, 9 };
        int inicio = 0;
        int fin = -1;
        int contadorPromociones = 0;

        while (inicio < MAXP && contadorPromociones < C) {
            inicio = buscarInicio(arrP, fin + 1);
            if (inicio < MAXP) {
                fin = buscarFin(arrP, inicio);
                if (secuenciaValida(arrP, inicio, fin, arrT)) {
                    contadorPromociones++;
                    corrimientoDerecha(arrP, fin+1);
                    fin = fin+1;
                    arrP[fin] = R;
                }
            }
        }
        System.out.println("Quedaron sin agregar " + C + " Cantidad de productos");
        mostrarArreglo(arrP);
    }
    public static boolean secuenciaValida(int[]arrP, int inicio, int fin, int[]arrT){
        int i = 0;
        boolean encontrado = false;
        while (i<MAXT && !encontrado) {
            if (buscarTenP(arrT[i], arrP, inicio, fin)) {
                encontrado = true;
            }
            i++;
        }
        return encontrado;
    }
    public static boolean buscarTenP(int T, int[]arrP, int inicio, int fin){
        int i = inicio; boolean encontrado = false;
        while (i<=fin && !encontrado) {
            if (T == arrP[i]) {
                encontrado = true;
            }
            i++;
        }
        return encontrado;
    }
    public static void corrimientoDerecha(int[]arr, int pos){
        for (int i = MAXP-1; i > pos; i--) {
            arr[i] = arr[i-1];
        }
    }
    public static int buscarInicio(int[] arr, int pos) {
        while (pos < MAXP && arr[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[] arr, int pos) {
        while (pos < MAXP && arr[pos] != SEPARADOR) {
            pos++;
        }
        return pos - 1;
    }

    public static void mostrarArreglo(int[] arr) {
        for (int pos = 0; pos < MAXP; pos++) {
            System.out.print("|" + arr[pos] + "|");
        }
    }
}
