public class Act4 {
    public static void main(String[] args) {
        /*
         * Escribir un diseño de programa que mientras que el usuario
         * ingrese un número distinto de 0, pida ingresar otros dos números
         * e imprima el resultado de la multiplicación entre los dos últimos
         * números ingresados.
         */
        int numero = 0;
        System.out.println("Ingrese un numero");

        numero = Utils.leerInt();

        if (distintoDeCero(numero)) {
            multiplicación();
        }

    }
    public static void multiplicación(){

        int numero1;
        int numero2;

        System.out.println("Ingrese dos numero");
        System.out.println("Numero 1:");
        numero1 = Utils.leerInt();
        System.out.println("Numero2");
        numero2 = Utils.leerInt();

        System.out.println("Multiplicacion de :" + numero1 + " * " + numero2 + " = " + (numero1*numero2));
    }
    public static boolean distintoDeCero(int numero){
        boolean valorDeVerdad = false;
        if (numero != 0) {
            valorDeVerdad = true;
        }
        return valorDeVerdad;
    }
}
