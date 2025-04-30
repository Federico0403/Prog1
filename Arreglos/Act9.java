package Arreglos;

public class Act9 {
    final static int MAX = 10;
    public static void main(String[] args) {
        char [] arrCaracteres = {'a','b','c','d','e','f','g','h','i','j'};

        if (repetida(arrCaracteres)) {
           System.out.println("Se encuentran letras repetidas"); 
        } else {
            System.out.println("No se encuentran letras repetidas");
        }
    }
    public static boolean repetida(char[]arr){
        boolean condicion = false;
        int i = 0;
        while (i < MAX-1 && !condicion) {
            int j = i + 1;
            while (j < MAX && !condicion) {
                if (arr[i] == arr[j]) {
                    condicion = true;
                }
                j++;
            }
            i++;
        }
        return condicion;
    }
}
