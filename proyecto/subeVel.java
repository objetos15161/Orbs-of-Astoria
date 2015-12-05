import greenfoot.*;

/**
 * subeVel, sube la velocidad de las barras si es tocado por el jugador
 * 
 * @Miguel Delgado Ayala
 * @1.0
 */
public class subeVel extends Actor
{
    private int mueveObjeto;
    private int valorX;
    
    /*
     * constructor de subevel, agrega un valor aleatorio a X
     */
    public subeVel()
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
     * mueve subeVel, cuando llega al limite de abajo se elimina
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
     * regresa el valor de X del subeVel
     */
    public int getValorX()
    {
        return(valorX);
    
    }
}
