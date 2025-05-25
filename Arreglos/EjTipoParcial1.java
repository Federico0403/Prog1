package Arreglos;

public class EjTipoParcial1 {
    final static int MAX = 20;
    final static int SEPARADOR = 0;

    public static void main(String[] args) {
        int[] arr = { 0, 67, 67, 0, 67, 67, 67, 67, 67, 0, 32, 32, 32, 32, 0, 45, 45, 45, 45, 0 };

        int inicio = 0;
        int fin = -1;

        int x = 1;

        while (inicio < MAX) {
            inicio = buscarInicio(arr, fin + 1);
            if(inicio < MAX) {
                fin = buscarFin(arr, inicio);
                if (esSecuenciaRepetida(arr, inicio, fin)) {
                    int tamañoSec = fin - inicio + 1;
                    if (tamañoSec >= x) {
                        int valor = arr[inicio]; // guardamos el valor repetido
                        arr[inicio] = -tamañoSec;
                        arr[inicio + 1] = valor;
                        comprecion(arr, inicio, tamañoSec);
                        fin = inicio + 1;
                    }
                }
                
            }
        }
        mostrarArreglo(arr);
    }

    public static boolean esSecuenciaRepetida(int[] arr, int inicio, int fin) {
        int valor = arr[inicio];
        for (int i = inicio + 1; i <= fin; i++) {
            if (arr[i] != valor) {
                return false;
            }
        }
        return true;
    }

    public static int buscarInicio(int[] arr, int inicio) {
        while (inicio < MAX && arr[inicio] == SEPARADOR) {
            inicio++;
        }
        return inicio;
    }

    public static int buscarFin(int[] arr, int fin) {
        while (fin < MAX && arr[fin] != SEPARADOR) {
            fin++;
        }
        return fin - 1;
    }

    public static void insertarTamañoNegativo(int[] arr, int inicio, int tamañoSec) {
        int tamañoSecNegativo = tamañoSec - tamañoSec - tamañoSec;
        arr[inicio] = tamañoSecNegativo;
    }

    public static void comprecion(int[] arr, int inicio, int tamañoSec) {
        for (int i = 0; i < tamañoSec - 2; i++) {
            corrimientoIzquierda(arr, inicio + 2);
        }
    }

    public static void corrimientoIzquierda(int[] arr, int inicio) {
        for (int i = inicio; i < MAX - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[MAX - 1] = SEPARADOR; // importante: poner SEPARADOR al final
    }

    public static void mostrarArreglo(int arr[]) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("|" + arr[pos] + "|");
        }
    }
}
