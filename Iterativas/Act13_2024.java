package Iterativas;

public class Act13_2024 {
    /*
     * 13. Escribir un programa que mientras que el usuario ingrese un
     * caracter letra minúscula, pida ingresar un número entero. Si el
     * número ingresado está entre 1 y 5 inclusive deberá imprimir la
     * tabla de multiplicar de dicho número.
     */
    public static void main(String[] args) {
        char caracter;
        int numero;
        int min = 1;
        int max = 10;

        System.out.println("Ingrese un caracter letra minuscula");
        caracter = Utils.leerChar();

        while ((caracter >= 'a') && (caracter <= 'z')) {
            System.out.println("Ingrese un numero entero");
            numero = Utils.leerInt();
            if ((numero >= min) && (numero <= max)) {
                for (int i = 1; i <= max; i++) {
                    System.out.print("|" + numero*i + "|");
                }
            }
            System.out.println("Ingrese un caracter digito para terminar");
            caracter = Utils.leerChar();
        }
    }
}
