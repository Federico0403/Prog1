package Arreglos;

public class Act8 {
    final static int MAX = 10;
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8,9,10};

        ascendente(arr);
    }
    public static void ascendente(int[]arr){
        int i = 0;
        while (i < MAX-1 && arr[i] < arr[i+1]) {
            i++;
        }
        if (i == MAX-1) {
            System.out.println("Esta en forma ascendente");
        } else {
            System.out.println("No esta en forma ascendente");
        }
    }
}
