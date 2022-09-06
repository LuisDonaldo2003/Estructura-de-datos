public class Complejidad2 {

    public int Complejidad2(int numero) {
        long tiempoinicial = System.nanoTime();
        int Suma = 0;
        Suma =(numero * (numero + 1)) / 2;

        long tiempofinal = System.nanoTime();

        long tiempototal = tiempofinal - tiempoinicial;
        System.out.println("El tiempo de ejecución en nanosegundos es: " + tiempototal);
        System.out.println("La suma es: "+ Suma);
        return Suma;
    }
    public static void main(String[] args){
        Complejidad2 com = new Complejidad2();
        com.Complejidad2(1000);
    }
}
