package Iterativas;

public class Act19_2024 {
    /*
     * 19. Construir un programa que solicite desde teclado un número de
     * mes válido y posteriormente notifique por pantalla la cantidad de
     * días de ese mes. En el caso de que ingrese 2 como número de
     * mes (febrero) deberá además solicitar ingresar un número de año
     * entre 2000 y 2024 inclusive (no debe seguir si no está en ese
     * rango), y dependiendo de si es bisiesto o no imprimir la cantidad
     * de días correspondiente.
     */

    public static void main(String[] args) {

        int mes;
        int dias;
        int año;

        System.out.println("Ingrese un numero de mes");
        mes = Utils.leerInt();

        if ((mes <= 12) && (mes >= 1)) {
            switch (mes) {
                case 4:
                case 6:
                case 9:
                case 11:
                    dias = 30;
                    System.out.println("El mes " + mes + " tiene " + dias + " días.");
                    break;

                case 2:
                System.out.println("Ingrese un año entre el 2000 y el 2004");
                año = Utils.leerInt();
                if ((año <= 2024) && (año >= 2000)) {
                    if ((año % 4 == 0) && (año % 100 != 0)) {
                        System.out.println("Febrero en ese año tiene 28 dias es bisiesto");
                    } else {
                        System.out.println("Febrero en ese año tiene 29 dias");
                    }
                }
                break;


                default:
                dias = 31;
                System.out.println("este mes tiene " + dias + " dias");
                    break;
            }
        }
    }
}
