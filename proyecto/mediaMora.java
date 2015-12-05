import greenfoot.*;

/**
 * Media barra morada
 * 
 * @Miguel Delgado Ayala
 * @1.0
 */
public class mediaMora extends BarMorada
{
    private int mueveBarra;
    private int extraVelBarra;
    private int valorX;
    
    /*
     *constructor de la media barra morada, agrega aleatoriamente el valor X 
     */
    public mediaMora()
    {
        valorX=277;
        valorX=valorX+Greenfoot.getRandomNumber(215);
        
        mueveBarra=0;
    }
    
    /**
     * llama al metodo mueve
     */
    public void act() 
    {
       
        mueve();
    }  
    
    /*
     * mueve la barra con la velocidad por el nivel que este actualmente
     * si toca al pj se pone transparente la barra
     * y si llega al limite la elimina
     */
     public void mueve()
    {
      
        ArtoriasWorld w = (ArtoriasWorld) getWorld();
        setLocation(valorX,mueveBarra);
        mueveBarra++;
        extraVelBarra=getVelBarra()+w.getExtraVel();
        mueveBarra=mueveBarra+extraVelBarra;
        
      
        
       if(isTouching(Orb.class))
        {
            GreenfootImage barToc = getImage();
            barToc.setTransparency(50);
            setImage(barToc);
        }
        
        if(getY()>550)
        getWorld().removeObject(this);
        
      
        
        
    
    
    
    }
    
    /*
     * regresa el valor que tenga en X la barra
     */
    public int getValorX()
    {
        return(valorX);
    
    }
}