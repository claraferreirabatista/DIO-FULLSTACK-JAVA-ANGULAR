import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        DecimalFormat df = new DecimalFormat("#.##");//format duas casas decimais

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();

            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + df.format(valorDoce) + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + df.format(mesada)); // Formatando a mesada
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
