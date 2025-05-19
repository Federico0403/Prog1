package Arreglos;

public class EjTipoParcial2 {
    final static int MAX = 20; final static int MAXM = 5;
    public static void main(String[] args) {
        int[]arregloPersonas = {4,3,8,6,2,12,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[]arregloMesas = {2,3,5,6,12};

        asignarMesas(arregloPersonas, arregloMesas);
        mostrarArreglo(arregloMesas, MAXM);
        mostrarArreglo(arregloPersonas, MAX);
    }

    public static void asignarMesas(int[] arregloP, int[] arregloM) {
    int i = 0;
    while (i < MAX && arregloP[i] != 0) {
        boolean asignado = false;

        int j = 0;
        while (j < MAXM && !asignado) {
            if (arregloM[j] > 0 && arregloP[i] <= arregloM[j]) {
                System.out.println("El cliente con " + arregloP[i] + " personas se asignó a la mesa " + j);
                arregloM[j] = -arregloM[j];
                corrimientoIzquierda(arregloP);
                asignado = true; 
            } else {
                j++;
            }
        }

        if (!asignado) {
            System.out.println("No hay mesa con capacidad para " + arregloP[i] + " personas");
            i++;
        }
    }
}

    public static void corrimientoIzquierda(int[] arr) {
        for (int i = 0; i < MAX - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[MAX - 1] = 0; 
    }
    public static void mostrarArreglo(int arr[], int limite) {
    for (int pos = 0; pos < limite; pos++) {
        System.out.print("|" + arr[pos] + "|");
    }
    System.out.println();
}

    
}
