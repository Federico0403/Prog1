public class Act10 {
    public static void main(String[] args) {
      opciones();  
    }
    public static void opciones(){
        int numero = 0;
        System.out.println("Ingrese un numero entre 1 y 10");
        numero = Utils.leerInt();

        if (numeroValido(numero) && !(numero % 5 == 0)) {
        while (numeroValido(numero)) {
            char caracter = ' ';
            System.out.println("Ingrese un caracter");
            caracter = Utils.leerChar();
            if (caracter >= 'a' && caracter <= 'z') {
                System.out.println("letra minuscula");
            } else if (caracter >= 'A' && caracter <= 'Z') {
                System.out.println("Mayusula");
            } else if (caracter >= '1' && caracter <= '9'){
                System.out.println("Digito");
            } else {
                System.out.println("otro");
            }
            System.out.println("Ingrese 0 para terminar");
            numero = Utils.leerInt();
        }    
        } else {
            for (int i = 1; i <= 10; i++) {
                System.out.println((i * numero));
            }
        }
        

    }
    public static boolean numeroValido(int numero){
        boolean valorDeVerdad = false;
        if (numero >= 1 && numero <= 10) {
            valorDeVerdad = true;
        }
        return valorDeVerdad;
    }
}
