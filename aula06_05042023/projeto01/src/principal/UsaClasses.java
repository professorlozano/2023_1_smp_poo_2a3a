package principal;

import model.Funcionario;

import java.util.Scanner;

public class UsaClasses {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        /*
        Funcionario func1 = new Funcionario();


        System.out.println("Digite o crachá do funcionario: ");
        func1.setCracha(leia.nextInt());

        System.out.println("Digite o salario do funcionario: ");
        func1.setSalario(leia.nextDouble());

        func1.calcularAumento(10);
        func1.calcularAumento(10.5);
         */

        System.out.println("Digite o crachá do funcionario: ");
        int cracha = leia.nextInt();

        System.out.println("Digite o salario do funcionario: ");
        double salario = leia.nextDouble();

        System.out.println("Digite o cargo do funcionario: ");
        String cargo = leia.next();

        Funcionario func2 = new Funcionario(cracha, salario, cargo);

        func2.calcularAumento(10);
        func2.calcularAumento(10.5);

    }
}
