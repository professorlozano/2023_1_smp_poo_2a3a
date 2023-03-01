public class Pessoa {
    String nome;
    int idade;     
    
    public Pessoa(String argNome){
        this.nome = argNome;
    }
    
    public Pessoa(String argNome, int argIdade){
        this.nome = argNome;
        this.idade = argIdade;
    }
    
    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }
}
