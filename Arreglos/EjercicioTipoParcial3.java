package Arreglos;

public class EjercicioTipoParcial3 {
    final static int MAXM = 20;
    final static int MAXA = 3;
    final static int SEPARADOR = 0;

    public static void main(String[] args) {
        int[] arrM = {0, 5, 34, 2, 12, 25, 0, 32, 2, 12, 3, 88, 14, 5, 0, 5, 5, 19, 0, 0};
        int[] arrA = {2, 3, 6};

        int inicio = 0;
        int fin = -1;
        int materia = 0;

        while (inicio < MAXM) {
            inicio = buscarInicio(arrM, fin + 1);
            if (inicio < MAXM) {
                fin = buscarFin(arrM, inicio);
                int tamañoSec = fin - inicio + 1;
                materia++;
                boolean asignado = asignarAlumnosASalon(arrM, arrA, tamañoSec, materia);
                if (asignado) {
                    corrimientoIzquierda(arrM, tamañoSec, inicio);
                    fin = inicio - 1;
                }
            }
        }

        System.out.println("\nArreglo final M:");
        mostrarArregloM(arrM);
        System.out.println("\nArreglo final A:");
        mostrarArregloA(arrA);
    }

    public static boolean asignarAlumnosASalon(int[] arrM, int[] arrA, int tamañoSec, int materia) {
    int i = 0;
    boolean encontrado = false;

    while (i < MAXA && !encontrado) {
        if (arrA[i] > 0 && tamañoSec <= arrA[i]) {
            System.out.println("La materia " + materia + " se asignó al aula " + i);
            arrA[i] = -arrA[i]; // se marca como usada
            encontrado = true;
        }
        i++;
    }

    if (!encontrado) {
        System.out.println("No se pudo asignar aula para la materia " + materia);
    }

    return encontrado;
}


    public static void corrimientoIzquierda(int[] arrM, int tamañoSec, int inicio) {
        for (int i = inicio; i < MAXM - tamañoSec; i++) {
            arrM[i] = arrM[i + tamañoSec];
        }
        for (int i = MAXM - tamañoSec; i < MAXM; i++) {
            arrM[i] = 0;
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

    public static void mostrarArregloA(int arr[]) {
        for (int pos = 0; pos < MAXA; pos++) {
            System.out.print("|" + arr[pos] + "|");
        }
        System.out.println();
    }

    public static void mostrarArregloM(int arr[]) {
        for (int pos = 0; pos < MAXM; pos++) {
            System.out.print("|" + arr[pos] + "|");
        }
        System.out.println();
    }
}
