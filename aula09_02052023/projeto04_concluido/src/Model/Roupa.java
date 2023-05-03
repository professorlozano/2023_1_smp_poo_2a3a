package Model;

public class Roupa extends Vestuario{
    private String tecido;

    public Roupa(int c, String d, double v, String n, String co, String t, String te) {
        super(c, d, v, n, co, t);
        this.setTecido(te);
    }

    public String getTecido() {
        return tecido;
    }

    public void setTecido(String tecido) {
        this.tecido = tecido;
    }

    public String print(){
        return super.print() + "\nTecido: " + this.tecido;
    }
}
