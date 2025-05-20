package Arreglos;

public class EjTipoParcial6 {
    
    final static int SEPARADOR = 0;
    final static int MAXP = 28;
    final static int MAXR = 2;

    public static void main(String[] args) {
        
        int[]arrP = {0, 0, 9, 12, 18, 0, 1, 5, 43, 73, 88, 0, 8, 9, 52, 0, 1, 10, 90, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        
        int[]arrR = {44,6};

        int inicio = 0;
        int fin = -1;

        while (inicio < MAXP) {
            inicio = buscarInicio(arrP, fin+1);
            if (inicio < MAXP) {
                fin = buscarFin(arrP, inicio);
                // encontrar posicion de arrR en arrP por secuencias
                fin = encontrarYInsertarProductos(arrP, arrR, inicio, fin);
            }
        }
        mostrarArreglo(arrP);

    }
    public static int encontrarYInsertarProductos(int[] arrP, int[] arrR, int inicio, int fin) {
    int j = 0;

    while (j < MAXR) {
        boolean encontrado = false;
        int i = inicio;
        while (i <= fin && !encontrado) {
            if (arrR[j] < arrP[i]) {
                corrimientoDerecha(i, arrP);
                arrP[i] = arrR[j];
                encontrado = true;
                fin++;
            }
            i++;
        }
        if (!encontrado) {
            corrimientoDerecha(fin + 1, arrP);
            arrP[fin + 1] = arrR[j];
            fin++;
        }
        j++;
    }
    System.out.println(inicio + " " + fin);
    return fin;
}


    public static void corrimientoDerecha(int pos, int[]arr){
        for (int i = MAXP-1; i > pos; i--) {
            arr[i] = arr[i-1];
        }
    }
    public static int buscarInicio(int[] arr, int inicio) {
        while (inicio < MAXP && arr[inicio] == SEPARADOR) {
            inicio++;
        }
        return inicio;
    }

    public static int buscarFin(int[] arr, int fin) {
        while (fin < MAXP && arr[fin] != SEPARADOR) {
            fin++;
        }
        return fin - 1;
    }
    public static void mostrarArreglo(int arr[]) {
        for (int pos = 0; pos < MAXP; pos++) {
            System.out.print("|" + arr[pos] + "|");
        }
    }
}
