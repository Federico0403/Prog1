package Iterativas;

public class Act7_2024 {
    /*
     * 7. Escribir un programa que mientras el usuario ingrese un caracter
     * distinto del carácter ‘*’, muestre por pantalla si es carácter dígito, o
     * si es carácter vocal minúscula.
     */
    
     public static void main(String[] args) {
        
        char caracter = ' ';
        
        System.out.println("Ingrese un caracter \n");
        caracter = Utils.leerChar();

        while (caracter != '*') {
            if ((caracter >= '1') && (caracter <= '9')) {
                System.out.println("Es un caracter digito \n");
            } else if ((caracter == 'a')||(caracter == 'e')||(caracter == 'i')||(caracter == 'o')||(caracter == 'u')) {
                System.out.println("Es un caracter vocal minuscula \n");
            } else {
                System.out.println("Su caracter no es ni vocal minuscula ni digito \n");
            }
            System.out.println("Ingrese otro caracter para continuar, o * para terminar");
            caracter = Utils.leerChar();
        }
     }
}
