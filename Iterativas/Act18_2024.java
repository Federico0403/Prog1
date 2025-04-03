package Iterativas;

public class Act18_2024 {
    /*
     * 18. Escribir un programa que mientras que el usuario ingrese un
     * número distinto de 0, pida ingresar otros dos números e imprima
     * el resultado de la división entre los dos últimos números
     * ingresados. ¿Existe alguna restricción para la división?
     */
    
     public static void main(String[] args) {
        
        int numero = 0;
        double divisor;
        double dividendo;
        double resultado;
        
        System.out.println("Ingrese un numero distinto de 0");
        numero = Utils.leerInt();

        while (numero != 0) {
            System.out.println("Ingrese el divisor");
            divisor = Utils.leerDouble();
            System.out.println("Ingrese el dividendo");
            dividendo = Utils.leerDouble();
            resultado = (divisor/dividendo);
            System.out.println("El resultado de dividir |" + divisor + "| por |" + dividendo + "| es " + resultado);
            System.out.println("Ingrese 0 para salir u otro numero para continuar");
            numero = Utils.leerInt();
        }
     }
}
