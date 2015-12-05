import greenfoot.*;

/**
 * Barra del juego
 * 
 * @Miguel Delgado Ayala
 * @1.0
 */
public  class Barra extends Actor
{
    
    private int bandBarra;
    private int contBarra;
    private int mueveBarra;
    private int numeroBarra;
    BarAmarilla Bar1;
    BarAzul Bar2;
    private int velBarra;
    
    
    
    
    /*
     *  constructor de la clase barra
     */
    public Barra()
    {
        velBarra=0;
      
    
    
    }
  
    
    /*
     * regresa el valor de la velocidad de la barra
     */
    public int getVelBarra()
    {
        
      
               
        return(velBarra);
        
        
        
    
    }
    
    /*
     * sube la velocidad de las barras
     */
    public void subeVelBarra()
    {
        
        velBarra ++;
      
    
    }
    
}
