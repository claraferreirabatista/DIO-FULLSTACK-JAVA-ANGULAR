import java.util.InputMismatchException;
import java.util.Scanner;

public class SmartTv {
    boolean ligada = false; // Variável que controla se a TV está ligada ou desligada.
    int canal = 1; // Variável que armazena o canal atual da TV.
    int volume = 25; // Variável que armazena o volume atual da TV.

    public void ligar() { // Método para ligar a TV.
        ligada = true; // Define o estado da TV como ligada.
    }

    public void desligar() { // Método para desligar a TV.
        ligada = false; // Define o estado da TV como desligada.
    }

    public void aumentarVolume() { // Método para aumentar o volume da TV.
        volume++; // Incrementa o valor do volume.
        System.out.println("Volume atual: " + volume); // Exibe o volume atual.
    }

    public void diminuirVolume() { // Método para diminuir o volume da TV.
        volume--; // Decrementa o valor do volume.
        System.out.println("Volume atual: " + volume); // Exibe o volume atual.
    }

    public void mudarCanal() { // Método para mudar o canal da TV.
        System.out.println(
                "Qual canal você quer assistir? (Digite um número de canal de 1 a 25, '+' para aumentar, '-' para diminuir ou 'q' para sair)");

        Scanner resposta = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário.

        try {
            int novoCanal = canal; // Inicializa com o canal atual.

            boolean continuar = true; // Variável de controle para continuar ou sair do loop.

            while (continuar) {
                System.out.println("Canal atual: " + novoCanal); // Exibe o canal atual.

                String entrada = resposta.nextLine(); // Lê a entrada do usuário como uma string.

                if (entrada.matches("\\d+")) { // Verifica se a entrada é um número.
                    int numero = Integer.parseInt(entrada);

                    if (numero >= 1 && numero <= 25) { // Verifica se o número está no intervalo válido de canais.
                        novoCanal = numero; // Define o novo canal.
                        continuar = false; // Sai do loop se o canal for definido corretamente.
                    } else {
                        System.out.println("Número de canal fora do intervalo permitido (1 a 25). Tente novamente.");
                    }
                } else if (entrada.equals("+")) { // Aumentar o canal.
                    if (novoCanal < 25) {
                        novoCanal++;
                    } else {
                        System.out.println("Você já está no canal 25.");
                    }
                } else if (entrada.equals("-")) { // Diminuir o canal.
                    if (novoCanal > 1) {
                        novoCanal--;
                    } else {
                        System.out.println("Você já está no canal 1.");
                    }
                } else if (entrada.equals("q")) { // Para sair.
                    continuar = false;
                } else {
                    System.out.println(
                            "Comando inválido. Digite um número de canal de 1 a 25, '+' para aumentar, '-' para diminuir ou 'q' para sair.");
                }
            }

            canal = novoCanal; // Define o canal atual com o novo canal selecionado.
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido. Por favor, insira um número inteiro.");
        } finally {
            resposta.close(); // Fecha o Scanner após o uso.
        }
    }
}

