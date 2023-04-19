package Principal;

import Model.Imovel;

import java.util.Scanner;

public class UsaClasses {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o código: ");
        int codigo = leia.nextInt();
        System.out.println("Digite a descrição: ");
        String descricao = leia.next();
        System.out.println("Digite a metragem: ");
        double metragem = leia.nextDouble();

        Imovel obj1 = new Imovel(codigo, descricao, metragem);
        obj1.calcularValor(1);
        System.out.println(obj1.Imprimir());

    }
}
