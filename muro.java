import greenfoot.*;

/**
 * muro, si toca al jugador es game over
 * 
 * @Miguel Delgado Ayala
 * @1.0
 */
public class muro extends Actor
{
    private int mueveObjeto;
    
    private int valorX;
    
    /*
     * constructor de la clase muro, agrega en X un valor aleatorio
     */
    public muro()
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
     * mueve al muro, si llega al limite de abajo se elimina 
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
