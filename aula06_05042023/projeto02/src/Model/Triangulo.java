package Model;

public class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea(){
        double area;
        area  = (this.base * this.altura)/2;
        return area;
    }

    public void imprimirDados(){
        System.out.println("Base: " + this.base +
                "\nAltura: " + this.altura +
                "\nArea: " + this.calcularArea());
    }
}
