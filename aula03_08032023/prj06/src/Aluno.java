public class Aluno {
    String nome;
    String rgm;
    int idade;
    double nota1;
    double nota2;
    
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

}
