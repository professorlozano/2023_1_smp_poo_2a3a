package principal;

import java.util.Scanner;
import model.Funcionario;

public class UsaClasses {
    public static void main(String[] args) {
        Funcionario obj_func = new Funcionario();
        
        Scanner obj_leia = new Scanner(System.in);
        
        /*
        System.out.print("Digite o nome do funcionario: ");
        obj_func.nome = obj_leia.nextLine();
        */
        obj_func.setNome("Luiz");
        
        
        System.out.print("Digite o salario do funcionario: ");
        obj_func.setSalario(obj_leia.nextDouble());
      
        System.out.print("Digite a funcional do funcionario: ");
        obj_func.setFuncional(obj_leia.nextInt());
        
        //System.out.println(obj_func.imprimir());
        System.out.println(obj_func.toString());
        
        double salario = obj_func.getSalario();
        System.out.println(salario);
        
    }
}
