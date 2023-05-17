public class UsaClasses {
    public static void main(String[] args) {
        Livro obj_livro = new Livro("Java I","10/05/23","Cruzeiro");
        obj_livro.imprimir();
        
        System.out.println("\n\n****************************************\n\n");
        
        Revista obj_revista = new Revista("Bairro","10/05/23","São Miguel", "São Paulo");
        obj_revista.imprimir();
    }
}
