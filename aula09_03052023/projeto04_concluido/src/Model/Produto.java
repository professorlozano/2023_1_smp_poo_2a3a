package Model;

public class Produto {
    private int codigo;
    private String descricao;
    private double valor;

    public Produto(int c, String d, double v) {
        this.setCodigo(c);
        this.setDescricao(d);
        this.setValor(v);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String print(){
        return "Codigo: " + this.codigo +
                "\nDescrição: " + this.descricao +
                "\nValor: " + this.valor;
    }
}
