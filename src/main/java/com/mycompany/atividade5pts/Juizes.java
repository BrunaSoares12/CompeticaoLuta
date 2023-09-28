package com.mycompany.atividade5pts;

/**
 *
 * @author bruni
 */
public class Juizes {
    String nome, endereco, email, cpf, celular;

    public Juizes(String nom, String end, String emal, String c, String cel) {
        this.nome = nom;
        this.endereco = end;
        this.email = emal;
        this.cpf = c;
        this.celular = cel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public void status(){
            
            System.out.println("Seu nome e: "+this.getNome());
            System.out.println("Seu endereco: "+this.getEndereco());
            System.out.println("Seu email: "+this.getEmail());
            System.out.println("Seu CPF: "+this.getCpf());
            System.out.println("Seu celular: "+this.getCelular());
    }
}
