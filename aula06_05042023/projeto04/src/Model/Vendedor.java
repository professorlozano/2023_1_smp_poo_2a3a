package Model;

public class Vendedor {
    private double vendas;
    private double salario;
    private String nome;
    private int falta;

    public Vendedor(double v, double s, String n, int f) {
        this.setVendas(v);
        this.setSalario(s);
        this.setNome(n);
        this.setFalta(f);
        this.calcularSalario();
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFalta() {
        return falta;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }

    public void imprimirDados(){
        System.out.println("Nome: " + this.nome +
                "\nSalario: " + this.salario +
                "\nVendas: " + this.vendas +
                "\nFaltas: " + this.falta);
    }

    public double calcularComissao(){
        if (this.vendas >= 1000 && this.vendas < 2000){
            return (this.vendas * 0.10);
        }
        else if(this.vendas >= 2000){
            return (this.vendas * 0.15);
        }
        return 0;
    }

    public double descontarFalta(){
        return this.salario / 30 * this.falta;
    }

    public void calcularSalario(){
        this.salario = (this.salario + this.calcularComissao() - this.descontarFalta());
    }
}
