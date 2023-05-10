public class Corrente extends Conta
{
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Corrente(String banco, int agencia, int conta, double limite) {
        super(banco, agencia, conta);
        this.setLimite(limite);
    }

    @Override
    public boolean Sacar(double valor) {
        if(valor <= (this.getSaldo() + this.limite))
        {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        else{
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
}
