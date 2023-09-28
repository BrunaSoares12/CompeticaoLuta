package com.mycompany.atividade5pts;

/**
 *
 * @author bruni
 */
public class Jogadores {
    private String nome, apelido, fraqueza;
private int habilidadedeluta, habilidadededefesa, habilidadedecura, vida;
double mediahabilidades;

    public Jogadores(String nom, String apel, String fraq, int lut, int def, int cura, int vid) {
        this.nome=nom;
        this.apelido=apel;
        this.fraqueza=fraq;
        this.habilidadedeluta=lut;
        this.habilidadededefesa=def;
        this.habilidadedecura=cura;     
        this.vida=vid;
        this.mediahabilidades=(lut+def+cura+vid)/4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getFraqueza() {
        return fraqueza;
    }

    public void setFraqueza(String fraqueza) {
        this.fraqueza = fraqueza;
    }

    public int getHabilidadedeluta() {
        return habilidadedeluta;
    }

    public void setHabilidadedeluta(int habilidadedeluta) {
        this.habilidadedeluta = habilidadedeluta;
    }

    public int getHabilidadededefesa() {
        return habilidadededefesa;
    }

    public void setHabilidadededefesa(int habilidadededefesa) {
        this.habilidadededefesa = habilidadededefesa;
    }

    public int getHabilidadedecura() {
        return habilidadedecura;
    }

    public void setHabilidadedecura(int habilidadedecura) {
        this.habilidadedecura = habilidadedecura;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public double getMediahabilidades(){
        return mediahabilidades;
    }
    
    public void status(){
            
            System.out.println("Nome do jogador: "+this.getNome());
            System.out.println("Apelido do jogador: "+this.getApelido());
            System.out.println("A fraqueza do jogador é:"+this.getFraqueza());
            System.out.println("O valor de luta do jogador é:"+this.getHabilidadedeluta());
            System.out.println("O valor de defesa do jogador é: "+this.getHabilidadededefesa());
            System.out.println("O valor de cura do jogador é: "+this.getHabilidadedecura());
            System.out.println("o valor da vida é de:"+this.getVida());
            
 }
}