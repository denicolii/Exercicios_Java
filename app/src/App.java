public class App {

    public static void main(String[] args) {
        Usuario acessar = new Usuario("denicoli",18);
        Usuario ver = new Usuario("leo",18);
        System.out.println(acessar.pegarNome());
        System.out.println(acessar.pegarIdade());
        acessar.logar();
        
        System.out.println(ver.pegarNome());
        System.out.println(ver.pegarIdade());
        ver.logar();
        
        System.out.println(Soma(25,50));
        
    }
 public static int Soma(int n1, int n2){
     return n1 + n2;
 }
    
}