package Principal;


import Model.Aluno;
import java.util.Scanner;

public class UsaClasses {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        Aluno obj_aluno = new Aluno();
        
        System.out.println("Digite o nome do aluno: ");
        obj_aluno.setNome(leia.next());
        
        System.out.println("Digite o rgm do aluno: ");
        obj_aluno.setRgm(leia.next());
        
        System.out.println("Digite a idade do aluno: ");
        obj_aluno.setIdade(leia.nextInt());
        
        System.out.println("Digite a nota 1 do aluno: ");
        obj_aluno.setNota1(leia.nextDouble());
        
        System.out.println("Digite a nota 2 do aluno: ");
        obj_aluno.setNota2(leia.nextDouble());
        
        System.out.println(obj_aluno.toString());
        
        double media = obj_aluno.calcularMedia(obj_aluno.getNota1(), obj_aluno.getNota2());
        boolean status = obj_aluno.verificarAprovacao(media);
        
        System.out.println("A média do aluno é: "+ media);
        System.out.println("O aluno esta " + ((status)? "Aprovado" : "Reprovado"));
        
        
    }
}
