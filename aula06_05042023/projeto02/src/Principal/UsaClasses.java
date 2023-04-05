package Principal;

import Model.Triangulo;

import java.util.Scanner;

public class UsaClasses {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        /*
        Triangulo obj1 = new Triangulo();
        System.out.println("Digite o valor da base: ");
        obj1.setBase(leia.nextDouble());
        System.out.println("Digite o valor da altura");
        obj1.setAltura(leia.nextDouble());
        obj1.imprimirDados();
         */


        System.out.println("Digite o valor da base: ");
        double base = leia.nextDouble();
        System.out.println("Digite o valor da altura");
        double altura = leia.nextDouble();
        Triangulo obj2 = new Triangulo(base, altura);
        obj2.imprimirDados();

    }
}
