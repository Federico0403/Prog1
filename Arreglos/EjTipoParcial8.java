package Arreglos;

public class EjTipoParcial8 {
    final static int MAX = 21;
    final static int SEPARADOR = 0;

    public static void main(String[] args) {
        
        double [] arrSismos = {0,2.1,1.5,4.1,0,3.4,0,2.5,3.0,0,3.8,0,2.7,2.7,3.9,2.5,0,4.2,2.0,0,0};

        int inicio = 0;
        int fin = -1;

        int N = 2;
        double M = 2.6;

        double promedio = 0;
        int tamañoSec = 0;
        int contadorDeSecuencia = 0;
        int secuenciasEncontradas = 0;

        while (inicio < MAX) {
            inicio = buscarInicio(arrSismos, fin+1);
            if (inicio < MAX) {
                fin = buscarFin(arrSismos, inicio);
                tamañoSec = fin - inicio + 1;
                contadorDeSecuencia++;
                if (tamañoSec == N) {
                    promedio = promedioSismos(arrSismos, inicio, fin, tamañoSec);
                    if (promedio > M) {
                        secuenciasEncontradas++;
                        System.out.println("\n Cantidad de secuencias encontradas : " + secuenciasEncontradas);
                        System.out.println("Existio dicha dia en la " + contadorDeSecuencia + " secuencia el promedio fue " + promedio);
                    }
                }
            }
        }
        // ojala y dios quiera que el parcial sea asi de facil porfavorrrrrrrrr que lindo
    }
    public static double promedioSismos(double[]arrSismos, int inicio, int fin, int tamañoSec){
        double promedio = 0;
        for (int i = inicio; i <= fin; i++) {
            promedio += arrSismos[i];
        }
        promedio = promedio / tamañoSec;
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
