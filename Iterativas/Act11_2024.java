package Iterativas;

public class Act11_2024 {
    /*
     * 11. Escribir un programa que mientras el usuario ingrese un
     * caracter letra minúscula, acumule la cantidad de vocales que
     * ingresó. Finalmente muestre por pantalla dicha cantidad.
     */
    public static void main(String[] args) {
        char caracter = ' ';
        int cantidadIngresada = 0;
        String caracterAcumulado = " ";

        System.out.println("Ingrese un caracter letra minuscula");
        caracter = Utils.leerChar();

        while ((caracter >= 'a') && (caracter <= 'z')) {
            if ((caracter == 'a')||(caracter == 'e')||(caracter == 'i')||(caracter == 'o')||(caracter == 'u')) {
                cantidadIngresada++;
                caracterAcumulado += caracter;
            }
            System.out.println("Ingrese otro caracter");
            caracter = Utils.leerChar();
        }
        System.out.println("La cantidad de caracteres fueron |" + cantidadIngresada + "| y los mismos fueron " + caracterAcumulado);
    }
}
