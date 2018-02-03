import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Relogio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Relogio extends Actor
{
    private int pontuacao = 0;
    
    
    public Relogio(){
    
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
        GreenfootImage placar = new GreenfootImage("Tempo "+converteNumero(valor),24, Color.WHITE, new Color(0,0,0,0),Color.BLACK);
        setImage(placar);
        
    }    
    
    private String converteNumero(int valor){
        
        return String.format("%02d",valor);   
    }    
}
