import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Digite o ano que deseja saber:");
        int ano = scanner.nextInt();

        if (ano %4 == 0) {
            System.out.println("Esse ano é bissexto.");
        } else {
            System.out.println("Esse ano não é bissexto.");
        }
    } 
}

