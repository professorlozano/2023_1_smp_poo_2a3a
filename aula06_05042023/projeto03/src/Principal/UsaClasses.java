package Principal;

import Model.Torneio;

import java.util.Scanner;

public class UsaClasses {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = leia.next();
        System.out.println("Digite a idade: ");
        int idade = leia.nextInt();
        Torneio obj1 = new Torneio(nome, idade);
        obj1.imprimirDados();
    }
}
