import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Estou pensando em um número de 0 a 100...");

        // Gera um número aleatório entre 0 e 100
        int numeroSecreto = (int) (Math.random() * 101);

        int tentativas = 0;
        boolean acertou = false;

        while (!acertou) {
            System.out.print("Faça seu palpite: ");
            int palpite = scanner.nextInt();
            tentativas++;

            // Verifica se o palpite está perto ou não
            if (Math.abs(palpite - numeroSecreto) <= 10) {
                System.out.println("Você está perto!");
            } else {
                System.out.println("Você está longe!");
            }

            // Verifica se o palpite é correto
            if (palpite == numeroSecreto) {
                acertou = true;
            }
        }

        System.out.println("Parabéns! Você acertou o número " + numeroSecreto + " em " + tentativas + " tentativas.");
        scanner.close();
    }
}

