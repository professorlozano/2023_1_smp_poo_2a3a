public class Poupanca extends Conta {
    private int aniversario;

    public Poupanca(String banco, int agencia, int conta, int aniversario) {
        super(banco, agencia, conta);
        this.setAniversario(aniversario);
    }

    @Override
    public boolean Sacar(double valor) {
        if(valor <= this.getSaldo())
        {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        else{
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    public int getAniversario() {
        return aniversario;
    }

    public void setAniversario(int aniversario) {
        this.aniversario = aniversario;
    }
}
