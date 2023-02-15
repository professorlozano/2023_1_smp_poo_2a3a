public class Principal {
    public static void main(String[] args) {
        Pessoa obj_pessoa = new Pessoa();
        obj_pessoa.nome = "João";
        obj_pessoa.salario = 2000;
        
        Pessoa obj_pessoa2 = new Pessoa();
        obj_pessoa2.nome = "Luiz";
        obj_pessoa2.salario = 500;
        
        obj_pessoa.imprimir();
        obj_pessoa2.imprimir();
        //System.out.println("O "+ obj_pessoa.nome + " recebe "+ obj_pessoa.salario);
        //System.out.println("O "+ obj_pessoa2.nome + " recebe "+ obj_pessoa2.salario);

    }
}
