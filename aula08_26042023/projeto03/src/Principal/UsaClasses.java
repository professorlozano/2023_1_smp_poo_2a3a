package Principal;

import Model.Cliente;
import Model.Fornecedor;

public class UsaClasses {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente("Luiz", "11999999899", 1000000);
        obj1.print();
        //double juros = obj1.calcularJuros(12);
        //System.out.println(juros);
        System.out.println(obj1.calcularJuros(12));

        //Fornecedor f1 = new Fornecedor("Apple", "55555555", 50000);
        //f1.print();
        //f1.calcularImposto(15);
    }
}
