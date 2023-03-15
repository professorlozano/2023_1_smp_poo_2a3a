package model;

public class Funcionario {
    private String nome;
    private double salario;
    private int funcional;
   
    
    public void setSalario(double argSalario){
        if(argSalario > 0){
            this.salario = argSalario;
        }
        else{
            System.out.println("Salario deve ser valor positivo");
        }
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    
    @Override
    public String toString(){
        return "Nome: " + this.nome +
               "\nSalario: " + this.salario +
               "\nFuncional: "+this.funcional;
    }
    
    public String imprimir(){
        return "Nome: " + this.nome +
               "\nSalario: " + this.salario +
               "\nFuncional: "+this.funcional;
    }

    public int getFuncional() {
        return funcional;
    }

    public void setFuncional(int funcional) {
        this.funcional = funcional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
