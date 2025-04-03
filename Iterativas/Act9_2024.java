package Iterativas;

public class Act9_2024 {
    /*
     * 9. Escribir un programa que mientras que el usuario ingrese un
     * carácter dígito o carácter letra minúscula, imprima si es carácter
     * dígito o carácter letra minúscula, y si es letra minúscula imprimir si
     * es vocal o consonante.
     */
    public static void main(String[] args) {
        char caracter = ' ';

        System.out.println("Ingrese un caracter");
        caracter = Utils.leerChar();

        while ((caracter >= 'a') && (caracter <= 'z') || ((caracter >= '1') && (caracter <= '9'))) {
            if ((caracter >= '1') && (caracter <= '9')) {
                System.out.println("Es caracter digito");
            } else if ((caracter != 'a') && (caracter != 'e') && (caracter != 'i') && (caracter != 'o') && (caracter != 'u')) {
                System.out.println("Es caracter consonante");
            } else {
                System.out.println("Es caracter vocal");
            }
            System.out.println("Ingrese otro caracter para continuar");
            caracter = Utils.leerChar();
        }
    }
}
