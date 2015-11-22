import greenfoot.*;

/**
 * cambioColor, cambia el color del jugador automaticamnte cuando es tocado
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cambioColor extends Actor
{
    private int mueveObjeto;
   
    private int valorX;
    
    /*
     * constructor de cambioColor, agrega en X un valor aleatorio
     */
     public cambioColor()
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
     * mueve el cambioColor, si llega al limite se elimina
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
     * regresa el valor de X de cambioColor
     */
    public int getValorX()
    {
        return(valorX);
    
    }
}
