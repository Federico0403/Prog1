package Arreglos;

public class Act28 {
    final static int MAX = 10;
    final static int SEPARADOR = 0;

    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 0, 3, 1, 0, 0, 1, 0 };
        int[] arrB = { 0, 1, 1, 0, 3, 1, 0, 0, 7, 0 };

        int inicio = 0; // para que entre una vez al while
        int fin = -1;// tengo que poner -1 ya que en buscar inicio busca desde fin+1

        int inicioB = 0;
        int finB = -1;

        while (inicio < MAX) {
            inicio = buscarInicio(arr, fin + 1);
            if (inicio < MAX) {
                fin = buscarFin(arr, inicio);
                while (inicioB < MAX) {
                    inicioB = buscarInicio(arrB, finB + 1);
                    if (inicioB < MAX) {
                        finB = buscarFin(arrB, inicioB);
                        // verificar que las secuencias sean del mismo tamaño
                        int tamañoA = tamañoSecuencia(arr, inicio, fin);
                        int tamañoB = tamañoSecuencia(arrB, inicioB, finB);
                        // recorrer ambas secuencias uno a uno para ver que sean iguales (int Sec +=
                        // arr[i])
                        if (tamañoA == tamañoB) {
                            if (comparacionDeSecuencias(arr, arrB, inicio, fin, inicioB, finB)) {
                                System.out.println("→ Secuencia encontrada. Eliminando desde posición " + inicio);
                                eliminarSecuencia(arr, inicio, tamañoA);
                                // Reiniciar búsqueda para evitar saltar secuencias
                                inicio = 0;
                                fin = -1;
                                inicioB = 0;
                                finB = -1;
                                break; // Salir del while interno para reiniciar el externo
                            }
                        }
                        // comparar que sean iguales
                        // eliminar la ocurrencia
                    }
                }
            }
        }
        mostrarArreglo(arr);
    }

    public static boolean comparacionDeSecuencias(int[] arrA, int[] arrB, int inicioA, int finA, int inicioB,
            int finB) {
        boolean condicion = true;
        // comparo tamaño
        if ((finA - inicioA) != (finB - inicioB)) {
            return false;
        }
        int i = 0;
        while (i <= (finA - inicioA) && condicion) {
            // recorre y compara uno a uno la secuencia y si son distintas ej 2,1,3 2,1,4 el 3 y 4 son distintos devuelve F
            if (arrA[inicioA + i] != arrB[inicioB + i]) {
                condicion = false;
            }
            // como suma dsp de haber hecho el if el primer bucle i es 0, inicioA/B + i = inicioA/B
            i++;
        }

        return condicion;
    }

    public static int tamañoSecuencia(int[] arr, int inicio, int fin) {
        return fin - inicio + 1;
    }

    public static void eliminarSecuencia(int[] arr, int inicio, int tamañoSec) {
        for (int i = inicio; i < MAX - tamañoSec; i++) {
            arr[i] = arr[i + tamañoSec];
        }
        for (int i = MAX - tamañoSec; i < MAX; i++) {
            arr[i] = SEPARADOR;
        }
    }

    public static int buscarInicio(int[] arr, int pos) {
        while (pos < MAX && arr[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != SEPARADOR) {
            pos++;
        }
        return pos - 1;
    }

    public static void mostrarArreglo(int arr[]) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("|" + arr[pos] + "|");
        }
    }
}
