import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private static final int largura = 850;
    private static final int altura  =  567;
    private static final int superior = 26;
    private static final int inferior = 640;
    private static final int limitX = 838;
    private static final int limitXIF = 19;
    private static  int  animais = 0;
    
    
    urso urso = new urso();
    tart tart = new tart();
    int cont = 0;
    int ciclo  = 0;
    heroi heroi = new heroi();
    //obs obs = new obs();
    private Placar pontuacao;
    private Relogio contador;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(largura , altura, 1); 

        pontuacao = new Placar();
        contador = new Relogio();
        addObject(pontuacao, 104, 17);
        addObject(contador, 82, 45);
        initCena();
        bichoCena();
        heroi.setImage(new GreenfootImage("heroi/1.fw.png"));
        prepare();
        Greenfoot.playSound("Rockfaceaudio.wav");
        animais =0;
        ciclo = 0;
        cont= 0;
    }

    public void act(){
         
        cont++;
        if(cont >= 42){
            cont = 0;
            ciclo++;
            contador.addPontos(1);
            
            if(VeiricaGame() == true){
                Greenfoot.setWorld(new Vitoria());
            }
       
            if(ciclo== 40){
                if(VeiricaGame() == true){
                    // venceu
                   
                    Greenfoot.setWorld(new Vitoria());
                    
                }else{
                    // gameOver
                    
                    Greenfoot.setWorld(new GameOver());
              
                }
            }
        }
        
    }

    public boolean VeiricaGame(){
        
        if(animais == 8){
            return true;
        }else{
             return false;
        }
    }
    
    public Placar pontuacao(){
        return pontuacao;
    }

    public void acrescentaPontos(int valor){
        pontuacao.addPontos(valor);
    }

    
    public static void setAnimal(int animal){
        animais += animal;
    }
    
    public static int getLimitInferior(){
        return inferior;
    }

    public static int getLimitSuperior(){
        return superior;
    }

    public static int getLImitX(){
        return limitX;
    }

    public static int getLImitXIF(){
        return limitXIF;
    }

    public void initCena(){
        addObject(heroi, 260, 117);
        addObject(new obs(), 19, 80);
        addObject(new obs(), 55, 80);
        addObject(new obs(), 92, 80);
        addObject(new obs(), 128, 80);
        addObject(new obs(), 165, 80);
        addObject(new obs(), 202, 80);
        addObject(new obs(), 128, 117);
        addObject(new obs(), 128, 154);
        addObject(new obs(), 128, 189);
        addObject(new obs(), 91, 189);
        addObject(new obs(), 164, 189);
        addObject(new obs(), 201, 189);
        addObject(new obs(), 19, 298);
        addObject(new obs(), 56, 298);
        addObject(new obs(), 92, 298);
        addObject(new obs(), 92, 335);
        addObject(new obs(), 201, 226);
        addObject(new obs(), 237, 226);
        addObject(new obs(), 273, 226);
        addObject(new obs(), 310, 226);
        addObject(new obs(), 346, 226);
        addObject(new obs(), 383, 226);
        addObject(new obs(), 310, 263);
        addObject(new obs(), 310, 299);
        addObject(new obs(), 310, 335);
        addObject(new obs(), 273, 335);
        addObject(new obs(), 237, 335);
        addObject(new obs(), 201, 335);
        addObject(new obs(), 347, 335);
        addObject(new obs(), 383, 335);
        addObject(new obs(), 420, 335);
        addObject(new obs(), 420, 226);
        addObject(new obs(), 310, 19);
        addObject(new obs(), 310, 55);
        addObject(new obs(), 310, 92);
        addObject(new obs(), 420, 189);
        addObject(new obs(), 420, 152);
        addObject(new obs(), 420, 115);
        addObject(new obs(), 420, 79);
        addObject(new obs(), 457, 79);
        addObject(new obs(), 494, 79);
        addObject(new obs(), 531, 79);
        addObject(new obs(), 568, 79);
        addObject(new obs(), 568, 116);
        addObject(new obs(), 568, 152);
        addObject(new obs(), 568, 189);
        addObject(new obs(), 531, 189);
        addObject(new obs(), 568, 226);
        addObject(new obs(), 568, 263);
        addObject(new obs(), 568, 300);
        addObject(new obs(), 568, 335);
        addObject(new obs(), 605, 335);
        addObject(new obs(), 642, 335);
        addObject(new obs(), 679, 335);
        addObject(new obs(), 716, 335);
        addObject(new obs(), 753, 335);
        addObject(new obs(), 753, 226);
        addObject(new obs(), 716, 226);
        addObject(new obs(), 679, 226);
        addObject(new obs(), 716, 189);
        addObject(new obs(), 716, 152);
        addObject(new obs(), 716, 116);
        addObject(new obs(), 716, 79);
        addObject(new obs(), 679, 79);
        addObject(new obs(), 753, 79);
        addObject(new obs(), 679, 42);
        addObject(new obs(), 679, 5);
        addObject(new obs(), 753, 373);
        addObject(new obs(), 753, 410);
        addObject(new obs(), 753, 448);
        addObject(new obs(), 642, 487);
        //addObject(new obs(), 642, 525);
        //addObject(new obs(), 642, 563);
        addObject(new obs(), 754, 634);
        addObject(new obs(), 754, 596);
        addObject(new obs(), 754, 558);

        
        addObject(new ObsTres(), 395, 500);
        addObject(new ObsTres(), 716, 449);
        addObject(new ObsTres(), 603, 449);
        addObject(new ObsTres(), 395, 462);
        addObject(new ObsTres(), 282, 500);
        addObject(new ObsTres(), 282, 462);
        addObject(new ObsTres(), 168, 500);
        addObject(new ObsTres(), 168, 462);
        addObject(new ObsTres(), 168, 640);
        addObject(new ObsTres(), 282, 640);
        //addObject(new ObsTres(), 395, 640);
        //addObject(new ObsTres(), 509, 487);
    }

    public void bichoCena(){
        addObject(new urso(), 741, 21);
        addObject(new urso(), 500, 139);
        addObject(new urso(), 691, 393);
        addObject(new urso(), 51, 477);
        addObject(new urso(), 244, 289);
        addObject(new tart(), 811, 621);
        addObject(new tart(), 50, 138);
        addObject(new tart(), 380, 282);

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
