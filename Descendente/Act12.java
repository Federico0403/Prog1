public class Act12 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero del 1 al 6");
        int numero = Utils.leerInt();
        if (numero > 0 && numero <= 6) {
            simulacion(numero);
        }
    }

    public static void simulacion(int numero){
        int contador = 0;
        for (int i = 0; i < 1000; i++) {
            int dado = (int) (6*Math.random() + 1);
            if (numero == dado) {
               contador++; 
            }
        }
        System.out.println("La cantidad de veces que el dado cayo en el numero " + numero + " es " + contador);
    }
}
