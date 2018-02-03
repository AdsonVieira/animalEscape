import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import  greenfoot.Color;

public class Placar extends Actor
{
   private int pontuacao = 0;
    
    
    public Placar(){
    
        atualizaImagem(pontuacao);
    }
    public void addPontos(int valor){
        
        pontuacao += valor;
    
    }

    public void act(){
        atualizaImagem(pontuacao);
    
    }
    
    private void atualizaImagem(int valor) 
    {
        GreenfootImage placar = new GreenfootImage("Pontos "+converteNumero(valor),24, Color.WHITE, new Color(0,0,0,0),Color.BLACK);
        setImage(placar);
        
    }    
    
    private String converteNumero(int valor){
        
        return String.format("%05d",valor);
        
           
}


}

