import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("Esse número é positivo.");
        }

        else if (num < 0) {
            System.out.println("Esse número é negativo.");
        } 

        else if (num == 0) {
             System.out.println("Esse número é 0.");
             
        }

    }

}
