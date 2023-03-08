
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        //entrada de dados
        System.out.print("Digite um nome: ");
        String nome = leia.nextLine();
        
        System.out.print("Digite um float: ");
        float numero1 = leia.nextFloat();
        
        System.out.print("Digite um double: ");
        double numero2 = leia.nextDouble();
        
        System.out.print("Digite um inteiro: ");
        int numero3 = leia.nextInt();
        
        System.out.print("Digite um byte: ");
        byte numero4 = leia.nextByte();
        
        System.out.print("Digite um long: ");
        long numero5 = leia.nextLong();
        
        System.out.print("Digite um boolean: ");
        boolean flag = leia.nextBoolean();
        
        //saída de dados
        System.out.println("O nome digitado é:......" + nome);
        System.out.println("O float digitado é:....." + numero1);
        System.out.println("O double digitado é:...." + numero2);
        System.out.println("O inteiro digitado é:..." + numero3);
        System.out.println("O byte digitado é:......" + numero4);
        System.out.println("O long digitado é:......" + numero5);
        System.out.println("O boolean digitado é:..." + flag);
    }
}
