package Arreglos;

public class EjercicioTipoParcial3 {

    // arreglo M de tamaño MaxM siendo m legajo de inscriptos a cada una de las
    // materias
    // separador sera 0
    final static int MAXM = 20;
    final static int MAXA = 3;
    final static int SEPARADOR = 0;
    // arreglo M comienza y termina con un o mas ceros
    // cada secuencia es una materia
    // y cada numero es un alumno
    // 0 0 34 2 12 25 0 32 55 12 3 88 14 0 0 17 36 19 0 0
    // 1 2 3 materias

    // segundo arreglo de aulas, que cada una te dice su tamaño empezando desde cero
    // arreglo a con tamaño maxA
    // 2 3 6

    // Se pide implementar un programa en Java que asigne a cada materia almacenada
    // en el arreglo M, un aula del arreglo A

    public static void main(String[] args) {
        int[] arrM = { 0, 0, 34, 2, 12, 25, 0, 32, 55, 12, 3, 88, 14, 0, 0, 17, 36, 19, 0, 0 };
        int[] arrA = { 2, 3, 6 };

        int inicio = 0;
        int fin = -1;
        int tamañoSec = 0;
        int materia = 0;

        while (inicio < MAXM) {
            inicio = buscarInicio(arrM, fin + 1);
            while (inicio < MAXM) {
                fin = buscarFin(arrM, inicio);
                tamañoSec = fin - inicio + 1;
                materia++;
                if (asignarAlumnosASalon(arrM, arrA, tamañoSec, materia, inicio)) {

                }
                inicio = fin + 1;

                System.out.println(" \n " + inicio + " " + fin);
                
            }
            fin = inicio + 1;
        }
        mostrarArregloM(arrM);
        mostrarArregloA(arrA);
    }

    public static boolean asignarAlumnosASalon(int[] arrM, int[] arrA, int tamañoSec, int materia, int inicio) {
        int i = 0;
        boolean encontrado = false;

        while (i < MAXA && !encontrado) {
            i++;
            if (tamañoSec <= arrA[i]) {
                System.out.println("Los alumnos en la materia " + materia + " se asignaron al aula " + arrA[i]);
                arrA[i] = -arrA[i];
                corrimientoIzquierda(arrM, tamañoSec, inicio);
                mostrarArregloM(arrM);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("no se encontro aula para los alumnos de la materia " + materia);
        }
        return encontrado;
    }

    public static void corrimientoIzquierda(int[] arrM, int tamañoSec, int inicio) {
        for (int i = 0; i < tamañoSec; i++) {
            for (int j = inicio; j < MAXM - 1; j++) {
                arrM[j] = arrM[j + 1];
            }
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
    }

    public static void mostrarArregloM(int arr[]) {
        for (int pos = 0; pos < MAXM; pos++) {
            System.out.print("|" + arr[pos] + "|");
        }
    }

}
