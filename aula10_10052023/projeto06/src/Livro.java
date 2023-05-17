public class Livro extends Publicacao{
    private String editora;

    public Livro(String t, String d, String e) {
        super(t, d);
        this.setEditora(e);
    }
    
    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public void imprimir() 
    {
        System.out.println("Titulo: " + this.getTitulo() +
                         "\nData Publicação: "+this.getDataPublicacao()+
                         "\nEditora: " + this.editora);
    }
    
    
}
