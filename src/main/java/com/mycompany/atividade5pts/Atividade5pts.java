package com.mycompany.atividade5pts;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author bruni
 */
public class Atividade5pts {

  

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        
        int resp1, resp2;
        
                
        Scanner ler= new Scanner(System.in);
        
        System.out.println("Bem vindos a todos. O campeoanto começará as 14 horas com os seguintes partipantes e personagens:");
        System.out.println(" ");
        
        //comp1
        System.out.println("Sobre o competidor 1");
        Competidores comp1 = new Competidores ("Caetano","Av Dom Pedro2", "caetanocesar35@gmail.com","Caet","45865923871","3165587459");
        comp1.status();
        
        System.out.println("");
        
        //comp2
        System.out.println("Sobre o competidor 2: ");
        Competidores comp2 = new Competidores ("Bruna","Av Dom Pedro1", "BruneteOliveira@gmail.com","Brunete","35715698461","31940028922");
        comp2.status();         
        
        System.out.println("");
        
        //jogador do comp1
        System.out.println("Sobre o Jogador do competidor 1:");
        Jogadores jog1 = new Jogadores("Vayne","Vay","Lobos",25,90,20,1000);
        jog1.status();
        
        System.out.println(" ");
        
        //jogador do comp2
        System.out.println("Sobre o jogador do competidor2:");
        Jogadores jog2 = new Jogadores("Jinx","Ji","Vi",17,80,25,1000);
        jog2.status();
        
        System.out.println(" ");
        
        //juíz
        System.out.println("Sobre o juíz: ");
        Juizes juiz = new Juizes ("Bruno","av cristiano machado300", "BruninhoMaximo@gmail.com","15068935845","3198874625"+"\n");
        juiz.status();
        
        
        
        //sistema de cartões e expulsão
        System.out.println("Quantos cartões o competidor 1 levou?");
        resp1=ler.nextInt();
        
        if (resp1>=2){
            System.out.println("o competidor 1 esta expulso, o campeão é o competidor 2");
        }else{
            System.out.println("O competidor permanece no campeonato");
        }
        
        System.out.println("E o competidor 2? Quantos cartões ele levou?");
        resp2=ler.nextInt();
        
        if (resp2>=2){
            System.out.println("O competidor 2 esta expulso, o campeão é o competidor 1 ");
        }else{
            System.out.println("O competidor permanece no campeonato");
        }
        
        
        //Sistema de vitória e média de pontos
        if ((jog1.getMediahabilidades()>jog2.getMediahabilidades() & resp1<2) || (resp2>1) ) {
            System.out.println("O vencedor é o jogador 1, tendo a média de habilidade de: "+jog1.getMediahabilidades()+" pontos");
        } 
        else if ((jog2.getMediahabilidades()>jog1.getMediahabilidades() & resp2<=2)|| (resp1>1)){
            System.out.println("O vencedor é o jogador 2, tendo a média de habilidades de: "+jog2.getMediahabilidades()+" pontos");
        }

    }
}
    

