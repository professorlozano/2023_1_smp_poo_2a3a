package model;

import javax.swing.JOptionPane;

public class Produto implements Imprimivel, Seguranca{
    private String descricao;
    private int quantidade;

    public Produto(String d, int q) {
        this.setDescricao(d);
        this.setQuantidade(q);
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String formatoString(){
        return "Descrição: " + this.descricao + nlin +
               "Quantidade: " + this.quantidade;
    }
    
    @Override
    public void formatoSystemOut(){
        System.out.println("Descrição: " + this.descricao + nlin+
                           "Quantidade: " + this.quantidade);
    }
    
    @Override
    public boolean validar(){
        if(this.quantidade < 0){
            JOptionPane.showMessageDialog(null,"Informe uma quantidade valida");
            return false;
        }
        else{
            return true;
        }
    }
}
