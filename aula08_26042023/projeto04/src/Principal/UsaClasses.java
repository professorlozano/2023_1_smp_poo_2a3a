package Principal;

import Model.Eletronico;
import Model.Produto;
import Model.Roupa;
import Model.Vestuario;

public class UsaClasses {
    public static void main(String[] args) {
        //Produto p1 = new Produto(1,"Tenis", 1000);
        //System.out.println(p1.print());
        //Eletronico e1 = new Eletronico(1,"DVD",300,110);
        //System.out.println(e1.print());
        //Vestuario v1 = new Vestuario(1,"Calça",100, "Capri","Azul", "M");
        //System.out.println(v1.print());
        Roupa r1 = new Roupa(1,"Calça",100,"Capri","Azul","M","Sarja");
        System.out.println(r1.print());
    }
}
