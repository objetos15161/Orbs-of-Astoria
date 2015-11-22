import greenfoot.*;
import java.lang.Object;
import java.lang.String;

/**
 * Orb, personaje que controla el jugador
 * 
 * @Miguel Delgado Ayala
 * @1.0
 */
public class Orb extends Actor
{
    private String movi;
    private int BandMov;
    private int actMov;
    private int colorActual;
    private int HP;
    private int gameOver;
    private int tipoControl;
    private int contControl;
    private int contLento;
    private int actLento;
    private int moviA;
    private int moviB;
    private int bloqueo;
    
    private static GreenfootImage[] orbs = {new GreenfootImage("orbamarillo.png"),new GreenfootImage("orbazul.png"),new GreenfootImage("orbrojo.png"),new GreenfootImage("orbverde.png"),new GreenfootImage("orbmorado.png")};//carga todas las imagenes del orb en un arreglo
    
    
    /*
     * constructor de orb, agrega todos los stats
     */
    public Orb()
    {
       
       actMov=2;
       colorActual=2;
       HP=1;
       gameOver=0;
       tipoControl=0;
       contControl=0;
       contLento=0;
       actLento=0;
       moviA=5;
       moviB=-5;
       bloqueo=0;
      
    
    
    
    }
   
    
    /**
     * llama al metodo checaDaño, mover y leeColor
     */
    public void act() 
    {
       
       
        checaDaño();
        mover();
        leeColor();
        
        
    }
    
    /*
     * mueve el orb con el teclado
     */
    
    public void mover()
    {
        String movi = Greenfoot.getKey();
        
        
         if(tipoControl==0)
         {
          if(movi=="left")
          {
            if(getX()>255)
            {
              
              actMov=1;
            }
             
          }else
            if(movi=="right")
            {
             if(getX()<510)
             {
              setRotation(0);
           
              
              actMov=0;
             }
            }
        }else
            {
                if(movi=="left")
                 {
                     
                     if(getX()<510)
                        {
                            setRotation(0);
           
                           
                            actMov=0;
                        }
             
                    }else
                    if(movi=="right")
                    {
                        if(getX()>255)
                        {
                         
                         actMov=1;
                        }
                    }
            
            
            
            }
            
            if(tipoControl==1)
            {
                if(contControl==250)
                tipoControl=0;
                else
                contControl++;
            
            }
        
        
        if(actLento==1)
        {
            if(contLento==250)
            {
                actLento=0;
                moviA=5;
                moviB=-5;
            }else
            contLento++;
            
        
        }
            
        
        if(actMov==1)
         {
            if(getX()>255)   
              move(moviB);
        
         }else
           if(actMov==0)
            {
              if(getX()<510)
              {
               move(moviA);
              }
            }
        
            
            
        
    
        
         
    
        }
    
        
    /*
     * lee de la tecla para seleccionar el color 
     */
    public void leeColor()
    {
     
      if(bloqueo==0)
      {
      if(Greenfoot.isKeyDown("a"))
      {
           colorActual=1; //Amarillo
           
        
      }
      
      if(Greenfoot.isKeyDown("s"))
      {
          colorActual=2; //Azul
          
        
      }
      
      if(Greenfoot.isKeyDown("d"))
      {
          colorActual=3; //rojo
         
      }
      
      if(Greenfoot.isKeyDown("f"))
      {
          colorActual=4; //verde
          
        
      }
      
      if(Greenfoot.isKeyDown("g"))
      {
          colorActual=5; //morado
          
        
      }
      
      cambiaColor(); //checa el color que se selecciono
     }
     bloqueo=0;
    
    }
    
    
   
    
    
    /*
     * cambia la img del color que selecciono anteriormente
     */
    public void cambiaColor()
    {
        
      switch(colorActual)
      {
          case 1:
               
              setImage(orbs[0]);
             
              
            
              break;
            
          case 2:
               setImage(orbs[1]);
             
            
            
              break;
              
          case 3:
              setImage(orbs[2]);
            
              
              break;
              
          case 4:
              setImage(orbs[3]);
            
              
              break;
              
          case 5:
              setImage(orbs[4]);
          
              
              break;
            
        
      }
    
    }
    
    /*
     * regresa el color actual del personaje
     */
    public int getColAct()
    {
        return(colorActual);
    }
    
    /*
     * compara el color que esta el Orb con el de la barra,muro,relent, hueco,cambio de color y el sube vel proxima cuando se estan tocando
     */
    public void checaDaño()
    {
        /////////////////////////////////////
        ///////////////////////////////////// BARRAS Y CAMBIOS DE COLOR
        if(isTouching(BarAmarilla.class)&&colorActual!=1)
        {
            gameOver=1;
           
        }
        if(isTouching(mediaAmarilla.class)&&colorActual!=1)
        {
            gameOver=1;
           
        }
         if(isTouching(BarAmarilla.class)&&colorActual==1)
        {
            bloqueo=1;
          
        }
        if(isTouching(mediaAmarilla.class)&&colorActual==1)
        {
            bloqueo=1;
          
        }
        if(isTouching(cambioAmarillo.class))
        {
            colorActual=1;
            removeTouching(cambioAmarillo.class);
        }
        
        
        if(isTouching(BarAzul.class)&&colorActual!=2)
        {
            gameOver=1;
            
        }
        if(isTouching(mediaAzul.class)&&colorActual!=2)
        {
            gameOver=1;
            
        }
        if(isTouching(BarAzul.class)&&colorActual==2)
        {
            bloqueo=1;
           
        }
        if(isTouching(mediaAzul.class)&&colorActual==2)
        {
            bloqueo=1;
          
        }
        if(isTouching(cambioAzul.class))
        {
            colorActual=2;
            removeTouching(cambioAzul.class);
        }
        
        
        if(isTouching(BarRojo.class)&&colorActual!=3)
        {
            gameOver=1;
           
        }
        if(isTouching(mediaRoja.class)&&colorActual!=3)
        {
            gameOver=1;
            
            
        }
        if(isTouching(BarRojo.class)&&colorActual==3)
        {
            bloqueo=1;
           
        }
        if(isTouching(mediaRoja.class)&&colorActual==3)
        {
            bloqueo=1;
            
            
        }
        if(isTouching(cambioRojo.class))
        {
            colorActual=3;
            removeTouching(cambioRojo.class);
        }
        
        
        if(isTouching(BarVerde.class)&&colorActual!=4)
        {
            gameOver=1;
           
        }
        if(isTouching(mediaVerde.class)&&colorActual!=4)
        {
            gameOver=1;
            
        }
        if(isTouching(BarVerde.class)&&colorActual==4)
        {
            bloqueo=1;
            
        }
        if(isTouching(mediaVerde.class)&&colorActual==4)
        {
            bloqueo=1;
            
        }
        if(isTouching(cambioVerde.class))
        {
            colorActual=4;
            removeTouching(cambioVerde.class);
        }
        
        
        if(isTouching(BarMorada.class)&&colorActual!=5)
        {
            gameOver=1;
            
        }
        if(isTouching(mediaMora.class)&&colorActual!=5)
        {
            gameOver=1;
            
        }
        if(isTouching(BarMorada.class)&&colorActual==5)
        {
           bloqueo=1;
            
        }
        if(isTouching(mediaMora.class)&&colorActual==5)
        {
            bloqueo=1;
           
        }
        if(isTouching(cambioMorado.class))
        {
            colorActual=5;
            removeTouching(cambioMorado.class);
            
        }
        ///////////////////////////////////////////
        ///////////////////////////////////////////MURO
        if(isTouching(muro.class))
        {
            
            gameOver=1;
            
        }
        ///////////////////////////////////////////
        ///////////////////////////////////////////HUECO
        if(isTouching(hueco.class))
        {
            
            tipoControl=1;
            contControl=0;
            removeTouching(hueco.class);
            
        }
        //////////////////////////////////////////
        //////////////////////////////////////////Enemigo
        if(isTouching(enemigo.class))
        {
            
            gameOver=1;
            
        }
        /////////////////////////////////////////
        /////////////////////////////////////////sube vel
        if(isTouching(subeVel.class))
        {
            
            ArtoriasWorld w = (ArtoriasWorld) getWorld();
            w.upVel();
            removeTouching(subeVel.class);
            
        }
        /////////////////////////////////////////
        ///////////////////////////////////////// Lento
        if(isTouching(relent.class))
        {
            
            contLento=0;
            actLento=1;
            moviA=1;
            moviB=-1;
            removeTouching(relent.class);
            
        }
        
    
    }
    
    /*
     * regresa las vidas del jugador (1 vida)
     */
    public int getHP()
    {
        return(HP);
    
    }
    
    /*
     * regresa el valor de 1 si pierde el jugador
     */
    public int getGameOver()
    {
        return(gameOver);
    
    }
}
