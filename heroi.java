import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class heroi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class heroi extends Actor
{
    /**
     * Act - do whatever the heroi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int moveImg = 0;
    
    public void act() 
    {
        // Add your action code here.
        movimentar();
        pegaUrso();
        pegatart();
        
    }    
    
    private void trocaCena(){
        
        
    }
    private void movimentar(){
        
        
        
        
        if(Greenfoot.isKeyDown("right")){
            
            setLocation(getX()+5, getY());
            setImage(new GreenfootImage("heroi/right-1.fw.png"));
            Actor obj = getOneIntersectingObject(obs.class);
        	Actor objTres = getOneIntersectingObject(ObsTres.class);
            if(obj != null || objTres != null ){
                setLocation(getX()-5, getY());
            }
            
           
            if(getX() >= MyWorld.getLImitX()){
                 setLocation(getX()-5, getY());
            }
        }
        
        if(Greenfoot.isKeyDown("left")){
            
            setLocation(getX()-5, getY());
            
            setImage(new GreenfootImage("heroi/left-1.fw.png"));
            Actor obj = getOneIntersectingObject(obs.class);
            Actor objTres = getOneIntersectingObject(ObsTres.class);
        
            if(obj != null || objTres != null ){
                setLocation(getX()+5, getY());
            }
            
            if(getX() <= MyWorld.getLImitXIF()){
                 setLocation(getX()+5, getY());
            }
        }
        
        if(Greenfoot.isKeyDown("down")){
          
            setLocation(getX(), getY() + 5);
            setImage(new GreenfootImage("heroi/2.fw.png"));
            Actor obj = getOneIntersectingObject(obs.class);
            Actor objTres = getOneIntersectingObject(ObsTres.class);
            
            if(obj != null || objTres != null ){
            
                setLocation(getX(), getY()-5);
            }
            
            if(getY() >= MyWorld.getLimitInferior()){
                 setLocation(getX(), getY()-5);
            }
        }
        
        if(Greenfoot.isKeyDown("up")){
           
            setLocation(getX(), getY() - 5);
            setImage(new GreenfootImage("heroi/down-1.fw.png"));
           Actor obj = getOneIntersectingObject(obs.class);
           Actor objTres = getOneIntersectingObject(ObsTres.class);
        
            if(obj != null || objTres != null ){
            
                setLocation(getX(), getY()+5);
            }
            
            if(getY() <= MyWorld.getLimitSuperior()){
                 setLocation(getX(), getY()+5);
            }
        }
    }
    private void pegaUrso(){
        Actor obj = getOneIntersectingObject(urso.class);
        
        if(obj != null){

            MyWorld mundo =(MyWorld) getWorld();
            mundo.acrescentaPontos(1000);
            mundo.removeObject(obj);
            mundo.setAnimal(1);
            Greenfoot.playSound("Waterdrop.wav");
        }
    }
    private void pegatart(){
        Actor obj = getOneIntersectingObject(tart.class);
        
        if(obj != null){
            
            MyWorld mundo =(MyWorld) getWorld();
            mundo.acrescentaPontos(1500);
            mundo.removeObject(obj);
            mundo.setAnimal(1);
            Greenfoot.playSound("Waterdrop.wav");
        }
    }
    
    private void barreira(){
        Actor obj = getOneIntersectingObject(obs.class);
        
        if(obj != null){

           move(-5);
        }
        
        
    }
    
}
