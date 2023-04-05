package Principal;

import Model.Vendedor;

import java.util.Scanner;

public class UsaClasses {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = leia.next();
        System.out.println("Digite o salario: ");
        double salario = leia.nextDouble();
        System.out.println("Digite as vendas: ");
        double vendas = leia.nextDouble();
        System.out.println("Digite as faltas: ");
        int falta = leia.nextInt();

        Vendedor obj1 = new Vendedor(vendas, salario, nome, falta);
        obj1.imprimirDados();


    }
}
