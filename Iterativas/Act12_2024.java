package Iterativas;

public class Act12_2024 {
    /*
     * 12. Escribir un programa que mientras el usuario ingrese un
     * carácter letra minúscula, se quede con la menor y la mayor letra
     * ingresada. Finalmente muestre por pantalla dichas letras.
     */
    public static void main(String[] args) {
        
        char caracter;
        char menor = 'z';
        char mayor = 'a';

        System.out.println("Ingrese un caracter");
        caracter = Utils.leerChar();

        while ((caracter >= 'a') && (caracter <= 'z')) {
            if (caracter < menor) {
              menor = caracter;  
            }
            if (caracter > mayor) {
                mayor = caracter;  
            }
            System.out.println("Ingrese otro caracter");
            caracter = Utils.leerChar();
        }
        System.out.println("La menor fue |" + menor + "| y la myor fue |" + mayor + "|");
    }
}
