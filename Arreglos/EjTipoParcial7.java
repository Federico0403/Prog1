package Arreglos;

public class EjTipoParcial7 {
    final static int MAXA = 23;
    final static char SEPARADOR = ' ';

    public static void main(String[] args) {
        
        char [] arrI = {' ','A', 'A', '1', '2', '3','Z', 'Z', 'P', 'R', 'G','0', '1', '0', 'A', 'B','9', '8', '7', 'E', 'X',' ',' '};
        char [] arrE = {' ',' ','A', 'B', '9', '8', '7','E', 'X', 'A', 'A', '1','2', '3', 'Z', 'Z', 'F','O', 'R', '0', '0', '1',' '};

        int inicio = 0;
        int fin = -1;


        while (inicio < MAXA) {
            inicio = buscarInicio(arrI, fin+1);
            if (inicio < MAXA) {
                fin = buscarFin(arrI, inicio);
                

            }
        }
        mostrarArreglo(arrI);
        System.out.println("\n");
        mostrarArreglo(arrE);
    }
    public static void arrIEstaenArrE(char[]arrI, char[]arrE, int inicio, int fin){
        int inicioE = 0;
        int finE = -1;

        while (inicioE < MAXA) {
            inicioE = buscarInicio(arrE, finE+1);
            if (inicioE < MAXA) {
                finE = buscarFin(arrE, inicioE);
                int j = inicioE;
                for (int i = inicio; i <= fin; i++) {
                    if (arrI[i] != arrE[j]) {
                        
                    }
                    j++;
                }
            }
        }
    }
    public static int buscarInicio(char[]arr, int pos){
        while (pos < MAXA && arr[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }
    public static int buscarFin(char[]arr, int pos){
        while (pos < MAXA && arr[pos] != SEPARADOR) {
            pos++;
        }
        return pos-1;
    }
    public static void mostrarArreglo(char arr[]) {
        for (int pos = 0; pos < MAXA; pos++) {
            System.out.print("|" + arr[pos] + "|");
        }
    }
}
