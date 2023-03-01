public class UsaClasses {
    public static void main(String[] args) {
        Pessoa obj_p1 = new Pessoa();
        obj_p1.nome = "Luiz";
        obj_p1.idade = 39;
        
        Pessoa obj_p2 = new Pessoa();
        obj_p2.nome = "Carolina";
        obj_p2.idade = 18;
        
        obj_p1.imprimir();
        obj_p2.imprimir();
        
        /*
        System.out.println("Nome: " + obj_p1.nome);
        System.out.println("Idade: " +obj_p1.idade);
        
        System.out.println("Nome: " + obj_p2.nome);
        System.out.println("Idade: " +obj_p2.idade);
        */
    }
}
