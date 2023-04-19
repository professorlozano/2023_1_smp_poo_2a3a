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
        
        if (codigo > 0){
            this.codigo = codigo;
        }
        else{
            System.out.println("Apenas codigos positivos");
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
            System.out.println("Descrição deve ter acima de 5 caracteres");
        }
    }

    public double getMetragem() {
        return metragem;
    }

    public void setMetragem(double metragem) {
        if (metragem > 10){
            this.metragem = metragem;
        }
        else{
            System.out.println("Metragem deve ter acima de 10 metros");
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor >= 0){
            this.valor = valor;
        }
        else{
            System.out.println("Valor não pode ser negativo");
        }
    }
    
    public void calcularValor(int bairro){
        /*
         bairro 1 = valor do metro quadrado 5 mil;
         bairro 2 = valor do metro quadrado 6 mil;
         Bairro 3 = valor do metro quadrado 7 mil;
         Bairro 4 = valor do metro quadrado 8 mil;
         Qualquer outro bairro o valor do imóvel deve ficar em 0.
        */
        //metragem x valor do metro quadrado)
        
        if (bairro == 1){
            this.valor = this.metragem * 5000;
        }
        else if (bairro == 2){
            this.valor = this.metragem * 6000;
        }
        else if (bairro == 3){
            this.valor = this.metragem * 7000;
        }
        else if (bairro == 4){
            this.valor = this.metragem * 8000;
        }
        else{
            this.valor = 0;
        }
    }
    
    public String imprimir(){
        return "Codigo: " + this.codigo +
                "\nDescrição: " + this.descricao +
                "\nMetragem: " + this.metragem +
                "\nValor: " + this.valor;
    }

}
