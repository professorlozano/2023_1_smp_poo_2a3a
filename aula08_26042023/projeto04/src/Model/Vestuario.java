package Model;

public class Vestuario extends Produto{
    private String nome;
    private String cor;
    private String tamanho;

    public Vestuario(int c, String d, double v, String n, String co, String t) {
        super(c, d, v);
        this.setNome(n);
        this.setCor(co);
        this.setTamanho(t);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String print(){
        return super.print() + "\nNome: " + this.nome +
                               "\nCor: " + this.cor +
                               "\nTamanho: " + this.tamanho;
    }
}
