
import javax.swing.JOptionPane;

public class Conversoes2 {
    public static void main(String[] args) {
        
        
        //entrada de dados
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        
        //processamento
        int soma = numero1 + numero2;
        
        //saída
        JOptionPane.showMessageDialog(null, "A soma dos dois valores resulta em: "+ soma);
    }
}
