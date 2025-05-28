package Arreglos;

public class PapelYHojaAct8 {
    final static int MAX = 21;
    final static int SEPARADOR = 0;

    public static void main(String[] args) {
        double[] arr = { 0, 2.1, 1.5, 1.1, 0, 3.4, 0, 2.5, 3.0, 0, 3.8, 0, 2.7, 2.7, 3.9, 2.5, 0, 4.2, 2.0, 0, 0 };

        int inicio = 0;
        int fin = -1;

        int N = 2;
        double M = 2.6;
        int contador = 0;

        while (inicio < MAX) {
            inicio = buscarInicio(arr, fin + 1);
            if (inicio < MAX) {
                fin = buscarFin(arr, inicio);
                contador++;
                int tamañoSec = fin - inicio + 1;
                if (tamañoSec >= N) {
                    if (obtenerPromedio(arr, inicio, fin) > M) {
                        System.out.println("en el dia +" + contador + " cumple");
                    }
                }
            }
        }
    }
    public static double obtenerPromedio(double[]arr, int inicio, int fin){
        double promedio = 0;
        int tamañoSec = fin-inicio+1;
        for (int i = inicio; i <= fin; i++) {
            promedio += arr[i];
        }
        promedio = (promedio/tamañoSec);
        return promedio;
    }
    public static int buscarInicio(double[]arr, int pos){
        while (pos < MAX && arr[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }
    public static int buscarFin(double[]arr, int pos){
        while (pos < MAX && arr[pos] != SEPARADOR) {
            pos++;
        }
        return pos-1;
    }
}
