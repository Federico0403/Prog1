package Arreglos;

public class Act12 {
    final static int MAX = 10;
    final static int MAXB = 2;
    public static void main(String[] args) {
        int[]arrA = {1,2,3,4,5,6,7,8,9,10};
        int[]arrB = {1,9};

        System.out.println(sumaDeArreglos(arrA, arrB));
    }
    public static int sumaDeArreglos(int[]arrA, int[]arrB){
        int suma = 0;
        int posicion = 0;
        for (int i = 0; i < MAXB; i++) {
            posicion = arrB[i];
            suma += arrA[posicion];
        }
        return suma;
    }
}
