import greenfoot.*;

/**
 * cambio amarillo, cambia el color del jugador automaticamnte cuando es tocado
 * 
 * @Miguel Delgado Ayala
 * @ */
public class cambioAmarillo extends cambioColor
{
    private int mueveObjeto;
   
    private int valorX;
    
    /*
     * constructor de cambio amarillo, agrega en X un valor aleatorio
     */
    public cambioAmarillo()
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
     * regresa el valor de X de cambioAmarillo
     */
    public int getValorX()
    {
        return(valorX);
    
    }
}
