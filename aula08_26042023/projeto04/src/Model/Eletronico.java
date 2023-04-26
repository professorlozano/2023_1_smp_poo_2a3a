package Model;

public class Eletronico extends Produto {
    private int voltagem;

    public int getVoltagem() {
        return voltagem;
    }

    public Eletronico(int c, String d, double v, int vo) {
        super(c, d, v);
        this.setVoltagem(vo);
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public String print(){
        /*
        String ret = super.print();
        ret = ret + "\nVoltagem: " + this.voltagem;
        return ret;
         */
        return super.print() + "\nVoltagem: " + this.voltagem;
    }
}
