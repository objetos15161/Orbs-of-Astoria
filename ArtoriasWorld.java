import greenfoot.*;
import java.lang.Object;
import java.lang.String;
import java.awt.Color;
import greenfoot.UserInfo;


/**
 * Crea los elementos del juego y controla cada evento
 * 
 * @Miguel Delgado Ayala
 * @1.0
 */
public class ArtoriasWorld extends World
{
    private Orb orbPj;
    private BarAzul Bar2;
    private BarAmarilla Bar1;
    private BarRojo Bar3;
    private BarVerde Bar4;
    private BarMorada Bar5;
    private SimpleTimer time;
    private Counter contLV,contHP,contTime,total;
    private acColor muestraColor;
    private mediaAzul Bar6;
    private mediaMora Bar7;
    private mediaRoja Bar8;
    private mediaVerde Bar9;
    private mediaAmarilla Bar10;
    private cambioAmarillo cAmari;
    private cambioAzul cAzul;
    private cambioRojo cRojo;
    private cambioVerde cVerde;
    private cambioMorado cMorado;
    private muro objMur;
    private hueco objHueco;
    private enemigo objEnemy;
    private subeVel objVel;
    private relent objLent;
    private boton bot1,bot2,bot3,bot4,bot5;
    //private UserInfo user1;
    
    
    private Barra Barr;
    private int bandBarra;
    private int contBarra;
    private int bandObjeto;
    private int contObjeto;
    private int varDific;
    public int nivelActual;
    private int velExtra;
    private int tiempoActual;
    private int opcion;
    private int record;
    private String rec1,rec2,rec3;
    
    GreenfootSound sound = new GreenfootSound("musiquita.mp3");
    GreenfootSound sound2 = new GreenfootSound("menu.mp3");
    //private static GreenfootImage[] letra = {new GreenfootImage("let1.png"),new GreenfootImage("let2.png"),new GreenfootImage("let3.png")};
    //private GreenfootImage show;
    //private GreenfootImage le1 = new GreenfootImage("let1.png");
    //private SmoothMover SmoMov;

    /**
     * contructor para la clase ArtoriasWorld
     * 
     */
    public ArtoriasWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        opcion=0;
        rec1 = Integer.toString(90);
        rec2 = Integer.toString(60);
        rec3 = Integer.toString(10);
        
        menu();
        //creanivel();
        //creanivel();
        //SmoMov = new SmoothMover();
        //addObject(,390,548);
        
        
        
    }
    
    /*
     * elimina los objetos que esten mostrandose en pantalla
     */
    public void eliminaObjetos()
    {
        int num,i=0;
        num = getObjects(null).size();
        Actor eli;
        while(i<num)
        {
            eli= (Actor) getObjects(null).get(0);
            removeObject(eli);
            i++;
        }
    }
    
    /*
     * crea el menu, botones, texto y fondo
     */
    public void menu()
    {
        setBackground("1.png");
        
        addObject(new Mensaje("JUGAR"),650,140);
        addObject(new Mensaje("AYUDA"),605,263);
        addObject(new Mensaje("CREDITOS"),558,389);
        addObject(new Mensaje("RECORDS"),475,520);
        
        
        
        
        bot1 = new boton();
        addObject(bot1,658,142);
        
        bot2 = new boton();
        addObject(bot2,606,267);
        
        bot4 = new boton();
        addObject(bot4,480,523);
        
        bot3 = new boton();
        addObject(bot3,561,394);
        
        
        
        
    
    }
    
    /*
     * muestra records
     */
    public void records()
    {
        addObject(new Mensaje("PAYER1"),181,121);
        addObject(new Mensaje("PLAYER2"),181,173);
        addObject(new Mensaje("PLAYER3"),181,230);
        
        addObject(new Mensaje(rec1),557,121);
        addObject(new Mensaje(rec2),557,173);
        addObject(new Mensaje(rec3),557,230);
        
        
    
    }
    
    /*
     * crea los contadores, mensajes, personaje y tiempos del juego
     */
    public void creanivel()
    {
        time = new SimpleTimer();
        time.mark();
        Barr = new Barra();
        sound2.stop();
        bandBarra=0;
        varDific=450;
        nivelActual=1;
        velExtra=0;
        
        
        //Bar2 = new BarAzul();
        //addObject(Bar2,400,2);
        
        
        
        orbPj = new Orb();
        addObject(orbPj,390,463);
        
        addObject(new Mensaje("Nivel"),623,93);
        addObject(new Mensaje("Vida"),623,151);
        addObject(new Mensaje("Tiempo"),623,31);
        addObject(new Mensaje("Color seleccionado"),687,439);
        
        contLV = new Counter();
        addObject(contLV,686,92);
        contLV.setValue(1);
        
        contHP = new Counter();
        addObject(contHP,686,150);
        contHP.setValue(orbPj.getHP());
        
        contTime = new Counter();
        addObject(contTime,686,30);
        
        muestraColor = new acColor();
        addObject(muestraColor,691,497);
        
        sound.playLoop();
    
    }
    
    /*
     * lee el boton que se selecciona en el menu
     */
    public void leeboton()
    {
        if(!sound2.isPlaying()){
            sound2.playLoop();
        }
        if(Greenfoot.mouseClicked(bot1))
        {
         opcion=1;
         eliminaObjetos();
         setBackground("fondo2.png");
         creanivel();
        }
        
        if(Greenfoot.mouseClicked(bot2))
        {
            opcion=2;
            eliminaObjetos();
            setBackground("ayuda.png");
            addObject(new Mensaje("ATRAS"),710,27);
            bot5 = new boton();
            addObject(bot5,716,31);
            
            
        }
        
        if(Greenfoot.mouseClicked(bot3))
        {
            opcion=2;
            eliminaObjetos();
            setBackground("creditos.png");
            addObject(new Mensaje("ATRAS"),710,27);
            bot5 = new boton();
            addObject(bot5,716,31);
            
            
        }
        
        if(Greenfoot.mouseClicked(bot4))
        {
            opcion=2;
            eliminaObjetos();
            setBackground("record.png");
            addObject(new Mensaje("ATRAS"),710,27);
            bot5 = new boton();
            addObject(bot5,716,31);
            records();
            
            //addObject(new Mensaje(user1.getUserName()),151,124);
            
            
            
            
            
            
            
        }
    }
    
    /*
     * espera que se precione un boton, controla el juego; las barras objetos, dificultado y
     * el game over
     */
    public void act()
    {
        if(opcion==0)
        {
            leeboton();
            
        
        
        }
        
        
        
        if(opcion==1)
        {
        tiempo();
        agregaBarra();
        agregaObjetos();
       
        cambioDific();
        muestraColor.cambia(orbPj.getColAct());
        
         if(orbPj.getGameOver()==1)
         {
           opcion=2;
           sound.stop();
           record=tiempoActual;
           eliminaObjetos();
           setBackground("gameover.png");
           addObject(new Mensaje("ATRAS"),710,27);
           bot5 = new boton();
           addObject(bot5,716,31);
           
           addObject(new Mensaje("PUNTUACION"),400,458);
           total = new Counter();
           addObject(total,401,502);
           total.setValue(record);
           
           actualizaRecord();
           
           
           
           
         }
        
        //System.out.println(orbPj.getGameOver());
       }
       
       if(opcion==2)
       {
           if(Greenfoot.mouseClicked(bot5))
           {
               eliminaObjetos();
               opcion=0;
               sound2.playLoop();
               menu();
               
           }
           
       }
        
       if(opcion==3)
       {
               
           if(Greenfoot.mouseClicked(bot5))
           {
               
               
               opcion=2;
               //menu();
               
           }
           
       }
       
    
    
    }
    
    /*
     * Actualiza los records actuales cuando termina la jugada 
     */
    public void actualizaRecord()
    {
        int temp = 0;
            
            if(record > Integer.parseInt(rec1))
            {
                rec1 = Integer.toString(record);
            
            }else if(record > Integer.parseInt(rec2))
              {
                rec2 = Integer.toString(record);
              }else if(record > Integer.parseInt(rec3))
                {
                    rec3 = Integer.toString(record);
                }
        
        
    }
    
    /*
     * agrega una barra cada cierto tiempo (nivel de dificultad)
     */
    public void agregaBarra()
    {
       if(bandBarra==1)
       {
        switch(Greenfoot.getRandomNumber(15))
        {
            case 1:
                {
                    //if(bandBarra==1)
                    //{
                        
                        Bar1 = new BarAmarilla();
                        addObject(Bar1,381,2);
                        bandBarra=0;
                        contBarra=0;
        
        
                    //}
                
                
                }
                break;
                
            case 2:
                {
                    //if(bandBarra==1)
                    //{
                        
                        Bar2 = new BarAzul();
                        addObject(Bar2,381,2);
                        bandBarra=0;
                        contBarra=0;
        
        
                    //}
                
                }
                break;
                
            case 3: //rjo
                {
                        Bar3 = new BarRojo();
                        addObject(Bar3,381,2);
                        bandBarra=0;
                        contBarra=0;
                
                
                
                }
                break;
                
            case 4: //verde
                {
                        Bar4 = new BarVerde();
                        addObject(Bar4,381,2);
                        bandBarra=0;
                        contBarra=0;
                
                
                }
                break;
                
            case 5: //moorado
                {
                        Bar5 = new BarMorada();
                        addObject(Bar5,381,2);
                        bandBarra=0;
                        contBarra=0;
                
                
                }
                break;
                
            case 6: //media Azul
                {
                        Bar6 = new mediaAzul();
                        addObject(Bar6,Bar6.getValorX(),2);
                        bandBarra=0;
                        contBarra=0;
                
                
                }
                break;
                
            case 7: //media morada
                {
                        Bar7 = new mediaMora();
                        addObject(Bar7,Bar7.getValorX(),2);
                        bandBarra=0;
                        contBarra=0;  
                
                }
                break;
                
            case 8: //media roja
                {
                        Bar8 = new mediaRoja();
                        addObject(Bar8,Bar8.getValorX(),2);
                        bandBarra=0;
                        contBarra=0;   
                
                }
                break;
                
            case 9: //media verde
                {
                        Bar9 = new mediaVerde();
                        addObject(Bar9,Bar9.getValorX(),2);
                        bandBarra=0;
                        contBarra=0;   
                
                }
                break;
               
            case 10: //media amarilla
                {
                        Bar10 = new mediaAmarilla();
                        addObject(Bar10,Bar10.getValorX(),2);
                        bandBarra=0;
                        contBarra=0;   
                
                }
                break;
        
        
        
        }
       }
        
       //contBarra++;
        
        //System.out.println(nivelActual);
        if(bandBarra==0)
        {
            if(contBarra>cambioDific())
            {
                bandBarra=1;
                contBarra=0;
                
                
            
            }
            else
            {
            contBarra++;
            }
        
        }
        
        
        
        
        
        /*if(this.getY()==500)
        {
          mund=getWorld();
          mund.removeObject(this.Bar);
        
        }*/
    
    
    }
    
    /*
     * agrega al mundo los objetos de cambio de color, muro, hueco,sube vel, enemigo, relen de
     * de forma aleatoria cuando se llega al nivel 3
     */
    public void agregaObjetos()
    {
       if(nivelActual>=3)
       { 
        if(bandObjeto==1)
        {
         switch(Greenfoot.getRandomNumber(11))
         {
            case 1: //cambio Amarillo
                {
                    //if(bandBarra==1)
                    //{
                        
                        cAmari = new cambioAmarillo();
                        addObject(cAmari,cAmari.getValorX(),2);
                        bandObjeto=0;
                        contObjeto=0;
        
        
                    //}
                
                
                }
                break;
                
            case 2: //cambio Azul
                {
                    //if(bandBarra==1)
                    //{
                        cAzul = new cambioAzul();
                        addObject(cAzul,cAzul.getValorX(),2);
                        bandObjeto=0;
                        contObjeto=0;
                        
        
        
                    //}
                
                }
                break;
                
            case 3: //cambio rjo
                {
                        cRojo = new cambioRojo();
                        addObject(cRojo,cRojo.getValorX(),2);
                        bandObjeto=0;
                        contObjeto=0;
                
                
                
                }
                break;
                
            case 4: //cambio verde
                {
                        cVerde = new cambioVerde();
                        addObject(cVerde,cVerde.getValorX(),2);
                        bandObjeto=0;
                        contObjeto=0;
                
                
                }
                break;
                
            case 5: //cambio moorado
                {
                        cMorado = new cambioMorado();
                        addObject(cMorado,cMorado.getValorX(),2);
                        bandObjeto=0;
                        contObjeto=0;
                
                
                }
                break;
                
            case 6:  //muro
                {
                        objMur = new muro();
                        addObject(objMur,objMur.getValorX(),2);
                        bandObjeto=0;
                        contObjeto=0;
                
                }
                break;
                
            case 7:  //hueco
                {
                        objHueco = new hueco();
                        addObject(objHueco,objHueco.getValorX(),2);
                        bandObjeto=0;
                        contObjeto=0;
                
                }
                break;
                
            case 8: //enemigo
                {
                        objEnemy = new enemigo();
                        addObject(objEnemy,objEnemy.getValorX(),2);
                        bandObjeto=0;
                        contObjeto=0;
                
                }
                break;
                
            case 9: //sube velocidad
                { 
                        objVel = new subeVel();
                        addObject(objVel,objVel.getValorX(),2);
                        bandObjeto=0;
                        contObjeto=0;
                
                }
                break;
               
            case 10:  //alenta orb
                {
                        objLent = new relent();
                        addObject(objLent,objLent.getValorX(),2);
                        bandObjeto=0;
                        contObjeto=0;
                
                }
                break;
        
        
        
         }
       }
        
       //contBarra++;
        
        //System.out.println(nivelActual);
        if(bandObjeto==0)
        {
            if(contObjeto>800)
            {
                bandObjeto=1;
                contObjeto=0;
                
                
            
            }
            else
            {
            contObjeto++;
            }
        
        }
      }
    
    }
    
    /*
     * cambia la dificultad cada cierto tiempo (maximo nivel = 5)
     */
    public int cambioDific()
    {
        //System.out.println(time.millisElapsed());
        
        if(time.millisElapsed()>=30000 && nivelActual==1)
        {
            varDific=250;
            contLV.setValue(2);
            nivelActual=2;
            velExtra=1;
        }else if(time.millisElapsed()>=50000 && nivelActual==2)
            {
                varDific=100;
                contLV.setValue(3);
                nivelActual=3;
                velExtra=2;
            }else if(time.millisElapsed()>=100000 && nivelActual==3)
            {
                varDific=70;
                contLV.setValue(4);
                nivelActual=4;
                //velExtra=2;
            }else if(time.millisElapsed()>=150000 && nivelActual==4)
            {
                varDific=50;
                contLV.setValue(5);
                nivelActual=5;
                if(velExtra<3)
                velExtra=3;
            }
        return(varDific);
    
    }
    
    /*
     * regresa el nivel que esta activo
     */
    public int getNivelActual()
    {
        return(nivelActual);
    
    }
    
    /*
     *regresa la velocidad extra por la dificultado 
     */
    public int getExtraVel()
    {
        
        return(velExtra);
        
    }
    
    /*
     * agrega velocidad a las barras cuando es llamada
     */
    public void upVel()
    {
        velExtra++;
    }
    
    /*
     * cuenta el tiempo se juego en segundos
     */
    public void tiempo()
    {
        tiempoActual=time.millisElapsed()/1000;
        contTime.setValue(tiempoActual);
    }
    
    
}
