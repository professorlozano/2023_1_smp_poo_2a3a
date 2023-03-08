
import java.util.Scanner;


public class Conversoes {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        //entrada de dados
        System.out.print("Digite o primeiro número: ");
        int numero1 = Integer.parseInt(leia.nextLine());
        
        System.out.print("Digite o segundo número: ");
        int numero2 = Integer.parseInt(leia.nextLine());
        
        //processamento
        int soma = numero1 + numero2;
        
        
        //saída
        System.out.println("A soma dos dois números resulta em: "+soma);
        

    }
}
