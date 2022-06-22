public class Bucle {
    public static void main(String[]args){
        int contador = 10;

        while (contador > 0) {
            System.out.println(contador);
            contador = contador -1;
            contador = contador - 10;
        }
        System.out.println("Mi contador ya dejo de iterar, por no cumplir su condición");
    }
}
