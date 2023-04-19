package Model;

public class Cliente extends Pessoa{
    private double valorDivida;

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public Cliente(String n, String f, double v) {
        super(n, f);
        this.setValorDivida(v);
    }


    public void print() {
        super.print();
        System.out.println("Valor da Divida: " + this.valorDivida);
    }

}
