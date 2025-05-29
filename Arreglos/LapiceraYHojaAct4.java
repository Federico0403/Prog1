package Arreglos;

public class LapiceraYHojaAct4 {
    final static int MAXP = 25;
    final static int MAXT = 2;
    final static int SEPARADOR = 0;

    public static void main(String[] args) {
        int[] arrP = { 0, 0, 12, 9, 18, 0, 15, 5, 4, 7, 10, 0, 8, 9, 12, 0, 19, 10, 9, 0, 0, 0, 0, 0, 0 };
        int R = 22;
        int C = 30;
        int[] arrT = { 8, 9 };
        int inicio = 0;
        int fin = -1;

        while (inicio < MAXP) {
            inicio = buscarInicio(arrP, fin + 1);
            if (inicio < MAXP) {
                fin = buscarFin(arrP, inicio);

                if (secuenciaPromocionado(arrP, inicio, fin, arrT) && C > 0) {
                    C--;
                    agregarPromocion(arrP, fin, R);
                    fin = fin + 1;
                }
            }
        }
        System.out.println("Quedaron sin agregar " + C + " Cantidad de productos");
        mostrarArreglo(arrP);
    }

    public static boolean secuenciaPromocionado(int[] arrP, int inicio, int fin, int[] arrT) {
        int j = 0;
        boolean promocionado = false;
        while (j < MAXT) {
            int i = inicio;
            while (i <= fin && arrT[j] != arrP[i]) {
                if (arrT[j] == arrP[i]) {
                    promocionado = true;
                }
                i++;
            }
            j++;
        }
        return promocionado;
    }

    public static void agregarPromocion(int[] arrP, int fin, int R) {
        fin = fin + 1;
        for (int i = MAXP - 1; i > fin; i--) {
            arrP[i] = arrP[i - 1];
        }
        arrP[fin] = R;
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
