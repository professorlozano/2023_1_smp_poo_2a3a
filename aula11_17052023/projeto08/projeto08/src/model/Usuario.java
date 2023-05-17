package model;

import javax.swing.JOptionPane;

public class Usuario extends Pessoa implements Imprimivel, Seguranca {
    private String nomeUsuario;
    private String senha;

    public Usuario(String nc, int i, String nu, String s) {
        super(nc, i);
        this.setNomeUsuario(nu);
        this.setSenha(s);
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String formatoString() {
        return "Nome Completo: " + this.nomeCompleto + nlin +
               "Idade: " + this.idade + nlin + 
               "Usuario: " + this.nomeUsuario + nlin +
               "Senha: " + this.senha;
    }

    @Override
    public void formatoSystemOut() {
        System.out.println("Nome Completo: " + this.nomeCompleto + nlin +
               "Idade: " + this.idade + nlin + 
               "Usuario: " + this.nomeUsuario + nlin +
               "Senha: " + this.senha);
    }

    @Override
    public boolean validar() {
        if(this.senha.equals("") || this.nomeUsuario.equals("")){
            JOptionPane.showMessageDialog(null,"Informe usuario e senha");
            return false;
        }
        else{
            return true;
        }
    }
    
    
}
