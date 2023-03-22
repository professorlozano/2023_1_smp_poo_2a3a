package Model;

public class Aluno {
    private String nome;
    private String rgm;
    private int idade;
    private double nota1;
    private double nota2;

    public Aluno(String nome, String rgm, int idade, double nota1, double nota2) {
        //this.nome = nome;
        //this.rgm = rgm;
        //this.idade = idade;
        //this.nota1 = nota1;
        //this.nota2 = nota2;
        this.setNome(nome);
        this.setRgm(rgm);
        this.setIdade(idade);
        this.setNota1(nota1);
        this.setNota2(nota2);
    }

    public Aluno(String nome, String rgm, int idade) {
        //this.nome = nome;
        //this.rgm = rgm;
        //this.idade = idade;
        this.setNome(nome);
        this.setRgm(rgm);
        this.setIdade(idade);
    }
    
    
    
    
    
    public double calcularMedia(double pN1, double pN2){
        double media;
        media = (pN1 + pN2)/2;
        return media;
    }
    
    public boolean verificarAprovacao(double pMedia){
        if (pMedia >=6){
            return true;
        }
        else{
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() >= 3){
            this.nome = nome;
        }
        else{
            System.out.println("Nome possuí menos de 3 caracteres");
        }
        
    }

    public String getRgm() {
        return rgm;
    }

    public void setRgm(String rgm) {
        if (rgm.length() == 6){
            this.rgm = rgm;
        }
        else{
            System.out.println("RGM deve possuir 6 caracteres");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 17){
            this.idade = idade;
        }
        else{
            System.out.println("Aluno é menor de idade");
        }
        
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if(nota1 >= 0 && nota1 <=10){
            this.nota1 = nota1;
        }
        else{
            System.out.println("Nota esta fora da faixa de valores.");
        }      
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if(nota2 >= 0 && nota2 <=10){
            this.nota2 = nota2;
        }
        else{
            System.out.println("Nota esta fora da faixa de valores.");
        }   
    }
    
    public String toString(){
        String ret;
        ret = "Nome: "+ this.nome +
            "\nRGM: " + this.rgm +
            "\nIdade: "+ this.idade +
            "\nNota 1: "+ this.nota1 + 
            "\nNota 2: " + this.nota2;
        return ret;
    }

}
