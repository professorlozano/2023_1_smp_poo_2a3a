public abstract class Conta implements Regras{
    private String banco;
    private int agencia;
    private int conta;
    private double saldo;

    public Conta(String banco, int agencia, int conta) {
        this.setBanco(banco);
        this.setAgencia(agencia);
        this.setConta(conta);
        this.saldo = 0;
    }

    public boolean Depositar(double valor)
    {
        if(valor > 0){
            this.setSaldo(this.saldo + valor);
            return true;
        }
        else{
            System.out.println("Valor de deposito inválido");
            return false;
        }
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
