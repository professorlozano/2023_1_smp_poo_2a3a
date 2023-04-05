package model;

public class Funcionario {
    private int cracha;
    private double salario;
    private String cargo;

    public Funcionario() {
        this.setCargo("assistente");
    }

    public Funcionario(int c, double s, String car) {
        //this.cracha = cracha;
        //this.salario = salario;
        //this.cargo = cargo;
        this.setCracha(c);
        this.setSalario(s);
        this.setCargo(car);

    }

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void calcularAumento(double porcentagem){
        System.out.println("Salario reajustado em porcentagem: " + (this.salario + ((this.salario * porcentagem) / 100)));
    }

    public void calcularAumento(int tempo){
        System.out.println("Salario reajustado em tempo:  "+ (this.salario + (150 * tempo)) );
    }
}
