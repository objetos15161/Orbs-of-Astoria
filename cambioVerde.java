import greenfoot.*;

/**
 * cambio verde, cambia el color del jugador automaticamnte cuando es tocado
 * 
 * @Miguel Delgado Ayala
 * @1.0
 */
public class cambioVerde extends cambioColor
{
   private int mueveObjeto;
   
   private int valorX;
    
   /*
    * constructor de cambioVerde, agrega en X un valor aleatorio
    */
    public cambioVerde()
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
     * regresa el valor en X de cambioVerde
     */
    public int getValorX()
    {
        return(valorX);
    
    }
}
