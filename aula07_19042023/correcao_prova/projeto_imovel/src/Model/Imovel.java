package Model;

public class Imovel {
    private int codigo;
    private String descricao;
    private double metragem;
    private double valor;


    public Imovel(int c, String d, double m) {
        //this.codigo = codigo;
        //this.descricao = descricao;
        //this.metragem = metragem;
        this.setCodigo(c);
        this.setDescricao(d);
        this.setMetragem(m);
        this.setValor(0);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo >= 1){
            this.codigo = codigo;
        }
        else{
            System.out.println("Codigo deve ser um valor inteiro positivo");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao.length() >= 5){
            this.descricao = descricao;
        }
        else{
            System.out.println("Descrição deve ter acima de 5 caracteres.");
        }
    }

    public double getMetragem() {
        return metragem;
    }

    public void setMetragem(double metragem) {
        if(metragem > 10){
            this.metragem = metragem;
        }
        else{
            System.out.println("Metragem deve ser acima de 10 metros.");
        }

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor >= 0){
            this.valor = valor;
        }
        else{
            System.out.println("Valor não pode ser negativo.");
        }
    }

    public void calcularValor(int bairro){
        if (bairro == 1){
            this.valor = this.metragem * 5000;
        }
        else if (bairro == 2){
            this.valor = this.metragem * 6000;
        }
        else if(bairro == 3){
            this.valor = this.metragem * 7000;
        }
        else if (bairro == 4){
            this.valor = this.metragem * 8000;
        }
        else{
            this.valor = 0;
        }
    }

    public String Imprimir(){
        return "Codigo: " + this.codigo +
                "\nDescrição: " + this.descricao +
                "\nMetragem: " + this.metragem +
                "\nValor: " + this.valor;
    }
}
