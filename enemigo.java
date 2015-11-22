import greenfoot.*;

/**
 * Enemigo el juego termina si lo tocas
 * 
 * @Miguel Delgado Ayala
 * @1.0
 */
public class enemigo extends Actor
{
   private int mueveObjeto;
   private int valorX;
   private int eneDir;
    
   /*
    * constructor de enemigo, agrega en X un valor aleatorio
    */
   public enemigo()
    {
        valorX=277;
        valorX=valorX+Greenfoot.getRandomNumber(215);
        eneDir=Greenfoot.getRandomNumber(2);
        
        mueveObjeto=0;
    }
    
    /**
     * llama al metodo mueve
     */
    public void act() 
    {
        
        mueve();
    }
    
    /*
     * mueve al enemigo hacia abajo y chocando con las esquinas, lo elimina cuando llega al limite de abajo
     */
    public void mueve()
    {
       
        if(valorX==223)
        {
          eneDir=1;
          
        }
          
        
        if(valorX==554)
        {
          eneDir=0;
         
        }
        
        if(eneDir==1)
        setLocation(valorX++,mueveObjeto);
        
        if(eneDir==0)
        setLocation(valorX--,mueveObjeto);
        
        
        mueveObjeto++;
        
        mueveObjeto=mueveObjeto+1;
        
        
        
        
        
        
        
        if(getX()>555)
        getWorld().removeObject(this);
        if(getY()>550)
        getWorld().removeObject(this);
          
        
    
    
    
    }
    
    /*
     * regresa el valor en X que tenga el enemigo
     */
    public int getValorX()
    {
        return(valorX);
    
    }
}
