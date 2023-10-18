import java.util.Scanner;

public class App {

    private static int contarOcorrencias(String palavra, char letra) {
        int contador = 0;

        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == letra) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String palavra = scanner.nextLine();

        System.out.print("Digite a letra a ser contada: ");
        char letra = scanner.next().charAt(0);

        palavra = palavra.toLowerCase();
        letra = Character.toLowerCase(letra);

        int ocorrencias = contarOcorrencias(palavra, letra);
        System.out.println("O número de ocorrências da letra '" + letra + "' na string é: " + ocorrencias);

        scanner.close();
    }
}
