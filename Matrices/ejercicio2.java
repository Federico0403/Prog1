package Matrices;

public class ejercicio2 {
final static int MAXF = 5;
    final static int MAXC = 10;

    public static void main(String[] args) {
        int[][] mat = { { 1, 3, 5, 6, 7, 8, 9, 1, 2, 3 },
                            { 1, 3, 5, 6, 7, 8, 9, 1, 2, 3 },
                            { 1, 3, 5, 6, 7, 8, 9, 1, 2, 3 },
                            { 1, 3, 5, 6, 7, 8, 9, 1, 2, 3 },
                            { 1, 3, 5, 6, 7, 8, 9, 1, 2, 3 }
        };
        numerosPares(mat);
        mostrarMatriz(mat);
    }
    public static void numerosPares(int[][]mat){
        int cantidadP = 0;
        for (int i = 0; i < MAXF; i++) {
            cantidadP += numerosP(mat[i]);
        }
        System.out.println(cantidadP);
    }
    public static int numerosP(int[]arr){
        int cantidadNumerosP = 0;
        for (int i = 0; i < MAXC; i++) {
            if (arr[i] % 2 == 0) {
                cantidadNumerosP ++;
            }
        }
        return cantidadNumerosP;
    }
    public static void mostrarMatriz(int[][]mat){
        for (int i = 0; i < MAXF; i++) {
            for (int j = 0; j < MAXC; j++) {
                System.out.print("|"+ mat[i][j]);
            }
            System.out.println();
        }
    }
    
} 

