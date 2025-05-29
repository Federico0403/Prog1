package Arreglos;

public class LapiceraYHojaAct3 {
    final static int MAXM = 20;
    final static int MAXA = 3;
    final static int SEPARADOR = 0;

    public static void main(String[] args) {
        int[] arrM = {0, 5, 34, 2, 12, 25, 0, 32, 2, 12, 3, 88, 14, 5, 0, 5, 5, 19, 0, 0};
        int[] arrA = {2, 3, 6};

        int inicio = 0;
        int fin = -1;
        int tamañoSec = 0;
        int contadorMateria = 0;

        while (inicio < MAXM) {
            inicio = buscarInicio(arrM, fin+1);
            if (inicio < MAXM) {
                fin = buscarFin(arrM, inicio);
                contadorMateria++;
                tamañoSec = fin-inicio+1;
                System.out.println(inicio  +" " +fin);
                if (seAsigno(arrM,arrA,tamañoSec, inicio, contadorMateria)) {
                    fin = inicio;
                }
            }
        }
    }
    public static boolean seAsigno(int[]arrM, int[]arrA, int tamañoSec, int inicio, int contadorMateria){
        int i = 0;
        while (i<MAXA && tamañoSec > arrA[i]) {
            i++;
        }
        if (i < MAXA) {
            borrado(arrM, tamañoSec, inicio);
            System.out.println("La materia " + contadorMateria + " se asigno al salon " + i);
            return true;
        } else {
            System.out.println("La materia " + contadorMateria + " no se puede asignar");
            return false;
        }
        
    }
    public static void borrado(int[]arrM, int tamañoSec, int inicio){
        for (int i = 0; i < tamañoSec; i++) {
            corrimientoIzquierda(arrM, inicio);
        }
    }
    public static void corrimientoIzquierda(int[]arrM, int inicio){
        for (int i = inicio; i < MAXM-1; i++) {
            arrM[i] = arrM[i+1];
        }
        arrM[MAXM-1] = SEPARADOR;
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
}
