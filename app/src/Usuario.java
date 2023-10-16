public class Usuario {
   String nome;
   int idade;
   
   public Usuario(String nome, int idade){
       this.nome = nome;
       this.idade = idade;
   }
   
   public String pegarNome(){
    return nome;
   }
   
   public int pegarIdade(){
   return idade;
   }
   
   public void logar(){
       System.out.println("Usuario logado com sucesso!");
   }
   
   public void deslogar(){
       System.out.println("Usuario deslogado com sucesso!");
   }
}
