package Parcial;

public class BorradoStopwords {
    final static int MAXA = 41;
    final static int MAXS = 20;
    final static char SEPARADOR = ' ';

    public static void main(String[] args) {
        char[] texto = {
                'l', 'a', ' ', 'c', 'a', 's', 'a', ' ', 'r', 'o', 'j', 'a', ',', ' ',
                'a', ' ', 'l', 'a', ' ', 'v', 'u', 'e', 'l', 't', 'a', ' ', 'd', 'e', ' ',
                'l', 'a', ' ', 'e', 's', 'q', 'u', 'i', 'n', 'a', '.', ' '
        };

        char[] stopWords = {
                ' ', 'a', ' ', 'l', 'o', ' ', 'l', 'o', 's', ' ', 'd', 'e', ' ',
                'l', 'a', ' ', 'l', 'a', 's', ' '
        };

        int ini = 0;
        int fin = -1;

        while (ini < MAXS) {
            ini = buscarIni(stopWords, fin + 1, MAXS);
            if (ini < MAXS) {
                fin = buscarFin(stopWords, ini, MAXS);
                recorrerSenT(stopWords, ini, fin, texto);
            }
        }

        mostrarArreglo(texto);
    }

    public static void recorrerSenT(char[] stopWords, int ini, int fin, char[] texto) {
        int iniT = 0;
        int finT = -1;
        int tamañoS = fin - ini + 1;

        while (iniT < MAXA) {
            iniT = buscarIni(texto, finT + 1, MAXA);
            if (iniT < MAXA) {
                finT = buscarFin(texto, iniT, MAXA); // CORREGIDO: antes era ini
                int tamaño = finT - iniT + 1;
                if (tamañoS == tamaño && sonIguales(stopWords, texto, ini, fin, iniT, finT)) {
                    eliminarSecuencia(texto, iniT, finT); // CORREGIDO: antes era ini, fin
                    finT = iniT; // Volver a chequear desde aquí
                }
            }
        }
    }

    public static boolean sonIguales(char[] stopWords, char[] texto, int iniA, int finA, int iniB, int finB) {
        int i = iniA;
        int j = iniB;
        boolean sonIguales = (finA - iniA) == (finB - iniB);

        while (i <= finA && sonIguales) { // CORREGIDO: era < finA
            if (stopWords[i] != texto[j]) {
                sonIguales = false;
            }
            i++;
            j++;
        }
        return sonIguales;
    }

    public static void eliminarSecuencia(char[] arr, int ini, int fin) {
        for (int i = ini; i <= fin; i++) {
            corrimientoIzquierda(arr, ini);
        }
    }

    public static void corrimientoIzquierda(char[] arr, int pos) {
    for (int i = pos; i < arr.length - 1; i++) {
        arr[i] = arr[i + 1];
    }
    arr[arr.length - 1] = ' '; // para "limpiar" el último
}


    public static int buscarIni(char[] arr, int pos, int MAX) {
        while (pos < MAX && arr[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(char[] arr, int pos, int MAX) {
        while (pos < MAX && arr[pos] != SEPARADOR) {
            pos++;
        }
        return pos - 1;
    }

    public static void mostrarArreglo(char[] arr) {
        for (int pos = 0; pos < MAXA; pos++) {
            System.out.print("|" + arr[pos] + "|");
        }
        System.out.println();
    }
}
