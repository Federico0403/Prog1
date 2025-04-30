package Arreglos;

public class Act6 {
    final static int MAX = 10;
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8,6,6};
        numerosPares(arr);
    }
    public static void numerosPares(int[]arr){
        int cant = 0;
        for (int i = 0; i < MAX; i++) {
            if (arr[i]%2==0) {
                cant++;
            }
        }
        System.out.println("La cantidad de numeros pares fueron " + cant);
    }
}
