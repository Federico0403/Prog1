package Arreglos;

public class Act24 {
    final static int MAX = 10;
    final static int SEPARADOR = 0;

    public static void main(String[] args) {
        int[] arr = {0, 5, 5, 0, 8, 8, 0, 3, 2, 0};
        secuenciaMayor(arr);
    }

    public static void secuenciaMayor(int[] arr) {
        int sumaMayor = 0;
        int posInicioMayor = -1;
        int posFinMayor = -1;
        int i = 0;

        while (i < MAX) {
            // primero encuentro el inicio
            while (i < MAX && arr[i] == SEPARADOR) {
                i++;
            }
            // dsp lo guardo en la variable inicio
            int inicio = i;
            int suma = 0;
            // declaro la suma y recorro la secuencia sumandola a la suma
            while (i < MAX && arr[i] != SEPARADOR) {
                suma += arr[i];
                i++;
            }
            // una vez que arr[i] es distinto de separador (ENCONTRE EL FINAL) lo guardo en la variable fin 
            int fin = i - 1;
            if (suma > sumaMayor) {
                sumaMayor = suma;
                posInicioMayor = inicio;
                posFinMayor = fin;
            }
            // comparo si suma es > a suma menor y el while sigue recorriendo
            // hasta que i sea menor por uno a max, osea se recorre todo el arreglo 
        }
        if (posInicioMayor != -1) {
            System.out.println("Secuencia con mayor suma:");
            System.out.println("Inicio: " + posInicioMayor + ", Fin: " + posFinMayor + ", Suma: " + sumaMayor);
        } else {
            System.out.println("No se encontró ninguna secuencia.");
        }
    }
}
