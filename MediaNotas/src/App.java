import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        int nota1 = scanner.nextInt();

        System.out.println("Digite a segunda nota:");
        int nota2 = scanner.nextInt();

        System.out.println("Digite a terceira nota:");
        int nota3 = scanner.nextInt();

        int media = ( (nota1 + nota2 + nota3) / 3);

        if (media >= 7) {
            System.out.println("A média das notas é igual a: " + media + " e o aluno está aprovado!");
        } else {
            System.out.println("A média das notas é igual a: " + media + " e o aluno está reprovado!");

        }

        
    }
}
