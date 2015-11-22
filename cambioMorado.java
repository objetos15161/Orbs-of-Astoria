import greenfoot.*;

/**
 * cambio morado, cambia el color del jugador automaticamnte cuando es tocado
 * 
 * @Miguel Delgado Ayala
 * @1.0
 */
public class cambioMorado extends cambioColor
{
    private int mueveObjeto;
    
    private int valorX;
    
    /*
     * constructor de cambioMorado, agrega en X un valor aleatorio
     */
    public cambioMorado()
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
     * mueve a cambioMorado, lo elimina cuando llega al limite de abajo
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
     * regresa el valor en X de cambioMorado
     */
    public int getValorX()
    {
        return(valorX);
    
    }
}
