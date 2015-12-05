import greenfoot.*;

/**
 * cambio azul, cambia el color del jugador automaticamnte cuando es tocado
 * 
 * @Miguel Delgado Ayala
 * @1.0
 */
public class cambioAzul extends cambioColor
{
    private int mueveObjeto;
   
    private int valorX;
    
    /*
     * constructor de cambio azul, agrega en X un valor aleatorio
     */
    public cambioAzul()
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
       
        super.mueve();
    }
    
      
    /*
     * regresa el valor de X de cambio azul
     */
    public int getValorX()
    {
        return(valorX);
    
    }
}
