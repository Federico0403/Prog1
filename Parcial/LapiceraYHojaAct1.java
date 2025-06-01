package Arreglos;

public class LapiceraYHojaAct1 {
    final static int MAXM = 20;
    final static int SEPARADOR = 0;
  
    public static void main(String[] args) {
        int[] arr = { 0, 67, 67, 0, 67, 67, 67, 67, 67, 0, 32, 32, 32, 32, 0, 45, 45, 45, 45, 0 };

        int inicio = 0;
        int fin = -1;

        int x = 3;

        int tamaño = 0;

        while (inicio<MAXM) {
            inicio = buscarInicio(arr, fin+1);
            if (inicio<MAXM) {
                fin = buscarFin(arr, inicio);
                tamaño = fin-inicio+1;
                if (tamaño > x && secuenciaValida(arr, inicio, fin)){

                    arr[inicio] = -tamaño;
                    compresion(arr, inicio, tamaño);
                    fin = inicio+1;
                }
            }
        }
        mostrarArreglo(arr);
    }
    public static void compresion(int[]arr, int inicio, int tamaño){
        tamaño = tamaño-2;
        inicio = inicio +2;
        for (int i = 0; i <= tamaño; i++) {
            corrimientoIzquierda(arr,inicio);
        }
    }
    public static void corrimientoIzquierda(int[]arr, int inicio){
        for (int i = inicio; i < MAXM-1; i++) {
            arr[i] = arr[i+1];
        }
    }
    public static boolean secuenciaValida(int[]arr, int inicio, int fin){
        while (inicio < fin && arr[inicio] == arr[inicio+1]) {
            inicio++;
        }
        if (inicio == fin) {
            return true;
        } else {
            return false;
        }
    }
    public static int buscarInicio(int[] arr, int pos) {
        while (pos < MAXM && arr[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[] arr, int pos) {
        while (pos < MAXM && arr[pos] != SEPARADOR) {
            pos++;
        }
        return pos - 1;
    }

    public static void mostrarArreglo(int[] arr) {
        for (int pos = 0; pos < MAXM; pos++) {
            System.out.print("|" + arr[pos] + "|");
        }
    }
}
