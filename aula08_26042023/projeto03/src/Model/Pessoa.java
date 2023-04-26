package Model;

public class Pessoa {
    private String nome;
    private String fone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Pessoa(String n, String f) {
        //this.nome = nome;
        //this.fone = fone;
        this.setNome(n);
        this.setFone(f);
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void print(){
        System.out.println("Nome: " + this.nome +
                         "\nFone: " + this.fone);
    }
}
