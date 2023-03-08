
import java.util.Scanner;

public class UsaClasses {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        Aluno obj_aluno = new Aluno();
        
        System.out.print("Digite o nome do aluno: ");
        obj_aluno.nome = leia.next();
        
        System.out.print("Digite a idade do aluno: ");
        obj_aluno.idade = leia.nextInt();
        
        System.out.print("Digite o rgm do aluno: ");
        obj_aluno.rgm = leia.next();
        
        System.out.print("Digite a nota 1 do aluno: ");
        obj_aluno.nota1 = leia.nextDouble();
        
        System.out.print("Digite a nota 2 do aluno: ");
        obj_aluno.nota2 = leia.nextDouble();
        
        double media = obj_aluno.calcularMedia(obj_aluno.nota1, obj_aluno.nota2);
        boolean status = obj_aluno.verificarAprovacao(media);
        
        System.out.println("A média do aluno é: "+ media);
        System.out.println("O aluno esta " + ((status)? "Aprovado" : "Reprovado"));
        
        
    }
}
