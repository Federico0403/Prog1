package Arreglos;

public class Act23 {
    final static int MAX = 10;
    final static int SEPARADOR = 0;
    public static void main(String[] args) {
        int[]arr = {0,0,1,2,3,3,4,3,0,0};
        encontrarPrimeraSecuencia(arr);
    }

    public static void encontrarPrimeraSecuencia(int[]arr){
        int posInicial = 0;
        int posFinal = 0;
        int i = 0;

        while (i < MAX && arr[i]==0) {
            i++;
        }
        if (arr[i] > SEPARADOR) {
            posInicial = i;
            while (i < MAX && arr[i]!=SEPARADOR) {
                i++;
            }
            if (arr[i]==SEPARADOR) {
                posFinal = i-1;
            }
        }
        System.out.println("La primera secuencia distinta de ceros " + posInicial + " y la posicion final " + posFinal);
    }
}

