import greenfoot.*;

/**
 * Hueco, al tocar se invierte el control del jugador
 * 
 * @Miguel Delgado Ayala
 * @1.0
 */
public class hueco extends Actor
{
   private int mueveObjeto;
    
   private int valorX;
    
   /*
    * constructor de hueco, agrega en X un valor aleatorio
    */
    public hueco()
    {
        valorX=277;
        valorX=valorX+Greenfoot.getRandomNumber(215);
        
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
     * mueve el hueco y cuando llega al limite de abajo lo elimina
     */
    public void mueve()
    {
       
        setLocation(valorX,mueveObjeto);
        mueveObjeto++;
      
        mueveObjeto=mueveObjeto+2;
        
     
        
        
        
        if(getY()>550)
        getWorld().removeObject(this);
        
     
        
        
    
    
    
    }
    
    /*
     * regresa el valor que tenga en X
     */
    public int getValorX()
    {
        return(valorX);
    
    }
}
