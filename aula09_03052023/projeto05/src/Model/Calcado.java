package Model;

public class Calcado extends Vestuario{
    private String materialsola;
    private String materialpartesuperior;
    private String materialinterno;

    public Calcado(int c, String d, double v, String n, String co, String t,
                   String ms, String mps,
                   String mi)
    {
        super(c, d, v, n, co, t);
        this.setMaterialsola(ms);
        this.setMaterialpartesuperior(mps);
        this.setMaterialinterno(mi);

    }

    public String getMaterialsola() {
        return materialsola;
    }

    public void setMaterialsola(String materialsola) {
        this.materialsola = materialsola;
    }

    public String getMaterialpartesuperior() {
        return materialpartesuperior;
    }

    public void setMaterialpartesuperior(String materialpartesuperior) {
        this.materialpartesuperior = materialpartesuperior;
    }

    public String getMaterialinterno() {
        return materialinterno;
    }

    public void setMaterialinterno(String materialinterno) {
        this.materialinterno = materialinterno;
    }

    public String print(){
        return super.print() + "\nMaterial da Sola: " + this.materialsola +
                               "\nMaterial da Parte Superior: " + this.materialpartesuperior +
                               "\nMaterial da Parte Interna: " + this.materialinterno;
    }
}
