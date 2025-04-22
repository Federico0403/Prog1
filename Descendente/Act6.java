public class Act6 {
    public static void main(String[] args) {
        /*
         * Escribir un programa que mientras el usuario cargue desde
         * teclado un carácter letra minúscula, llame a un método que
         * imprime por pantalla la tabla de multiplicar del 9.
         */

        char caracter = ' ';
        System.out.println("ingrese una letra minuscula");
        caracter = Utils.leerChar();

        if (caracter >= 'a' && caracter <= 'z') {
            minuscula(caracter);
        }
    }
    public static void minuscula(char caracter){
        while (caracter >= 'a' && caracter <= 'z') {
            tabla();
            System.out.println("\n Ingrese un caracter minuscula para seguir");
            caracter = Utils.leerChar();
        }
    }
    public static void tabla(){

        final int tabla = 9;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * tabla);
        }
    }
}
