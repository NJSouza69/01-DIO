
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile01 {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0){
            Double valorDoce = valorAleatorio();
             if (valorDoce > mesada)
                valorDoce = mesada;
                System.out.println("Doce do valor: " + valorDoce + "adicionado ao carrinho!" );
                mesada = mesada - valorDoce;
            }
            System.out.println("Mesada: " + mesada);
            System.out.println("Joáozinho gastou toda a sua mesada em doces");

    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
