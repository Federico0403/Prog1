package Arreglos;

public class Act22 {
    final static int MAX = 10;
    public static void main(String[] args) {
        int[]arr = {10,9,8,7,6,5,4,3,2,1};

        esPar(arr);
        mostrarArreglo(arr);
    }
    public static void esPar(int[]arr){
        for (int i = 0; i < MAX; i++) {
            if (arr[i] % 2 == 0) {
                corrimientoIzquierda(i, arr);
            }
        }
    }
    public static void corrimientoIzquierda(int pos, int[]arr){
        if (pos == MAX - 1) {
            arr[pos] = 0;
        } else {
            for (int i = pos; i < MAX - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[MAX - 1] = 0;
        }
    }
    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println();
    }
}
