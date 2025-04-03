package Iterativas;

public class Act16_2024 {
    /*
     * 16. Pedir por consola 15 caracteres. Imprimir la mayor cantidad de
     * ‘a’ seguidas que se ingresaron.
     */
    public static void main(String[] args) {
        
        char caracter = ' ';
        int contador = 0;
        int contadorMayor = 0;

        System.out.println("ingrese un caracter");
        
        for (int i = 1; i <= 15; i++) {
            caracter = Utils.leerChar();

            if (caracter == 'a') {
                contador++;
                if (contador > contadorMayor) {
                    contadorMayor = contador;
                }
            } else {
                contador = 0;
            }
            System.out.println("Ingrese otro caracter hasta llegar a 15 " + i);
        }
        System.out.println("La mayor cantidad de 'a' seguidas ingresadas fue: " + contadorMayor);
    }
}
