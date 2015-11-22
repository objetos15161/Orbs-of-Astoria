import greenfoot.*;

/**
 * Barra verde
 * 
 * @Miguel Delgado Ayala
 * @1.0
 */
public class BarVerde extends Barra
{
    private int mueveBarra;
    private int extraVelBarra;
    
    /*
     * constructor de la clase barra verde
     */
    public BarVerde()
    {
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
        setLocation(381,mueveBarra);
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
}
