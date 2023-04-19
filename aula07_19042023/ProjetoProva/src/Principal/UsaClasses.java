package Principal;

import Model.Imovel;
import java.util.Scanner;

public class UsaClasses {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o codigo: ");
        int codigo = leia.nextInt();
        
        System.out.println("Digite a descrição: ");
        String descricao = leia.next();
        
        System.out.println("Digite a metragem: ");
        double metragem = leia.nextDouble();
        
        Imovel obj1 = new Imovel(codigo,descricao,metragem);
        
        obj1.calcularValor(2);
        
        //System.out.println(obj1.imprimir());
        
        String temporaria;
        temporaria =  obj1.imprimir();
        System.out.println(temporaria);
        
        
    }
}
