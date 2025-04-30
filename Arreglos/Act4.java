package Arreglos;

public class Act4 {
    final static int MAX = 10;
    public static void main(String[] args) {
        char [] arrCaracteres = {'a','b','e','d','e','f','g','h','e','j'};
        System.out.println("Ingrese un caracter a buscar");
        char caracter = Utils.leerChar();
        compararCaracteres(arrCaracteres, caracter);
    }

    public static void compararCaracteres(char[]arr, char caracter){
        int coinsidencias = 0;
        for (int i = 0; i < MAX; i++) {
            if (arr[i] == caracter) {
                System.out.println("En la posicion " + i + " se encuentra una letra " + caracter);
                coinsidencias++;
            }
        }
        System.out.println("La cantidad de igualdades encontradas fueron " + coinsidencias);
    }

}

