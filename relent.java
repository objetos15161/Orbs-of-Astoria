import greenfoot.*;

/**
 * Relent, si el jugador lo toca, este se vuelve mas lento por
 * un corto tiempo
 * 
 * @Miguel Delgado Ayala 
 * @1.0
 */
public class relent extends Actor
{
    private int mueveObjeto;
    
    private int valorX;
    
    /*
     * constructor de relent, agrega en X un valor aleatorio
     */
    public relent()
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
     * mueve al relent, cuando llega al limite de abajo se elimina
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
     * regresa el valor en X del relent
     */
    public int getValorX()
    {
        return(valorX);
    
    }
}
