import greenfoot.*;

/**
 * cambio rojo, cambia el color del jugador automaticamnte cuando es tocado
 * 
 * @Miguel Delgado Ayala
 * @1.0
 */
public class cambioRojo extends cambioColor
{
    private int mueveObjeto;
   
    private int valorX;
    
    /*
     * constructor de cambioRojo, agrega en X un valor aleatorio
     */
    public cambioRojo()
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
     * mueve al cambioRojo, lo elimina cuando llega al limite de abajo
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
     * regresa el valor de X de cambio Rojo
     */
    public int getValorX()
    {
        return(valorX);
    
    }
}
