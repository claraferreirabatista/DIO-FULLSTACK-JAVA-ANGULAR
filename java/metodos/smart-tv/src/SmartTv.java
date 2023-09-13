import java.util.InputMismatchException;
import java.util.Scanner;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Volume atual: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Volume atual: " + volume);
    }

    public void mudarCanal() {
        System.out.println(
                "Qual canal você quer assistir? (Digite um número de canal de 1 a 25, '+' para aumentar, '-' para diminuir ou 'q' para sair)");

        Scanner resposta = new Scanner(System.in);

        try {
            int novoCanal = canal; // Inicializa com o canal atual

            boolean continuar = true;

            while (continuar) {
                System.out.println("Canal atual: " + novoCanal);
                String entrada = resposta.nextLine();

                if (entrada.matches("\\d+")) { // Verifica se a entrada é um número
                    int numero = Integer.parseInt(entrada);

                    if (numero >= 1 && numero <= 25) { // Verifica se o número está no intervalo válido
                        novoCanal = numero;
                        continuar = false; // Sai do loop se o canal for definido corretamente
                    } else {
                        System.out.println("Número de canal fora do intervalo permitido (1 a 25). Tente novamente.");
                    }
                } else if (entrada.equals("+")) { // Aumentar o canal
                    if (novoCanal < 25) {
                        novoCanal++;
                    } else {
                        System.out.println("Você já está no canal 25.");
                    }
                } else if (entrada.equals("-")) { // Diminuir o canal
                    if (novoCanal > 1) {
                        novoCanal--;
                    } else {
                        System.out.println("Você já está no canal 1.");
                    }
                } else if (entrada.equals("q")) { // Para sair
                    continuar = false;
                } else {
                    System.out.println(
                            "Comando inválido. Digite um número de canal de 1 a 25, '+' para aumentar, '-' para diminuir ou 'q' para sair.");
                }
            }

            canal = novoCanal;
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido. Por favor, insira um número inteiro.");
        } finally {
            resposta.close();
        }
    }

}
