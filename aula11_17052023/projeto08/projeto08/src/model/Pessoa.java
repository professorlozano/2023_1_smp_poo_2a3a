package model;

public abstract class Pessoa {
    protected String nomeCompleto;
    protected int idade;

 
    public Pessoa(String nc, int i) {
        this.setNomeCompleto(nc);
        this.setIdade(i);
    }
    
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
