package Iterativas;

public class Act20_2024 {

    public static void main(String[] args) {

        int numero = -1; // Inicializamos en un número distinto de 0
        char caracter;

        while (numero != 0) {
            System.out.println("Ingrese un número entero positivo (0 para salir):");
            numero = Utils.leerInt();

            if (numero != 0) {
                boolean caracterValido = false;

                while (!caracterValido) {
                    System.out.println("Ingrese un carácter ('a', 'b', 'c'):");
                    caracter = Utils.leerChar();

                    switch (caracter) {
                        case 'a':
                            caracterValido = true;
                            System.out.println("Ingrese un texto:");
                            String textoUsuario = Utils.leerString();
                            System.out.println("Su texto fue: " + textoUsuario);
                            break;

                        case 'b':
                            caracterValido = true;
                            int[] numeros = new int[5];
                            boolean ascendente = true;

                            System.out.println("Ingrese 5 números positivos:");
                            for (int i = 0; i < 5; i++) {
                                System.out.print("Número " + (i + 1) + ": ");
                                numeros[i] = Utils.leerInt();
                            }

                            for (int i = 1; i < 5; i++) {
                                if (numeros[i] < numeros[i - 1]) {
                                    ascendente = false;
                                    break;
                                }
                            }

                            if (ascendente) {
                                System.out.println("Los números fueron ingresados en orden ascendente.");
                            } else {
                                System.out.println("Los números no están en orden ascendente.");
                            }
                            break;

                        case 'c':
                            caracterValido = true;
                            System.out.println("Ingrese dos números enteros negativos:");

                            int n1 = Utils.leerInt();
                            int n2 = Utils.leerInt();

                            if (n1 < 0 && n2 < 0) {
                                double raiz = Math.sqrt(n1 * n2);
                                System.out.println("La raíz cuadrada de la multiplicación es: " + raiz);
                            } else {
                                System.out.println("Ambos números deben ser negativos.");
                            }
                            break;

                        default:
                            System.out.println("Carácter inválido. Intente de nuevo.");
                    }
                }
            }
        }

        System.out.println("Programa finalizado.");
    }
}
