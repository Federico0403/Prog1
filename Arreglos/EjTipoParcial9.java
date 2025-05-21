package Arreglos;

public class EjTipoParcial9 {

    final static int MAXAZ = 26;
    final static int MAXC = 17;
    final static char SEPARADOR = ' ';
    final static int MAXClave = 3;

    public static void main(String[] args) {
        char[] arrAZ = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's','t', 'u', 'v', 'w', 'x', 'y', 'z' };

        char[] arrC = { ' ', 'h', 'o', 'l', 'a', ' ', 'c', 'o', 'm', 'o', ' ', 'e', 's', 't', 'a', 's', ' ' };

        int inicio = 0;
        int fin = -1;

        int[] arrClave = { 1, 2, 3 };
        int claveIndex = 0;

        while (inicio < MAXC) {
            inicio = buscarInicio(arrC, fin + 1);
            if (inicio < MAXC) {
                fin = buscarFin(arrC, inicio);
                claveIndex = codificarMensaje(arrC, arrAZ, arrClave, inicio, fin, claveIndex);
            }
        }
        mostrarArreglo(arrC);
    }

    public static int codificarMensaje(char[] arrC, char[] arrAZ, int[] arrClave, int inicio, int fin, int clavePos) {

        for (int i = inicio; i <= fin; i++) {
            int j = 0;
            while (j < MAXAZ && arrC[i] != arrAZ[j]) {
                j++;
            }

            if (j < MAXAZ) {
                int desplazamiento = arrClave[clavePos];
                // el % es para volver al princio del arreglo cunado llega a su final
                int nuevaPos = (j + desplazamiento) % MAXAZ;
                arrC[i] = arrAZ[nuevaPos];
                // el % es para volver al princio del arreglo cunado llega a su final
                clavePos = (clavePos + 1) % MAXClave;
            }
        }

        return clavePos; 
    }

    public static int buscarInicio(char[] arr, int pos) {
        while (pos < MAXC && arr[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(char[] arr, int pos) {
        while (pos < MAXC && arr[pos] != SEPARADOR) {
            pos++;
        }
        return pos - 1;
    }

    public static void mostrarArreglo(char arr[]) {
        for (int pos = 0; pos < MAXC; pos++) {
            System.out.print("|" + arr[pos] + "|");
        }
    }
}
