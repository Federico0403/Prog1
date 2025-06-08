package Matrices;

public class ejercicio1 {
    final static int MAXF = 5;
    final static int MAXC = 10;

    public static void main(String[] args) {
        int[][] mat = { { 1, 3, 5, 6, 7, 8, 9, 1, 2, 3 },
                            { 1, 3, 5, 6, 7, 8, 9, 1, 2, 3 },
                            { 1, 3, 5, 6, 7, 8, 9, 1, 2, 3 },
                            { 1, 3, 5, 6, 7, 8, 9, 1, 2, 3 },
                            { 1, 3, 5, 6, 7, 8, 9, 1, 2, 3 }
        };
        invertirMat(mat);
        mostrarMatriz(mat);
    }
    public static void invertirMat(int[][]mat){
        for (int i = 0; i < MAXF; i++) {
            invertirArreglo(mat[i]);
        }
    }
    public static void invertirArreglo(int[]arr){
        int i = 0;
        int j = MAXC-1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
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
