import greenfoot.*;

/**
 * acColor, muestra el color seleccionado
 * 
 * @Miguel Delgado Ayala
 * @1.0
 */
public class acColor extends Actor
{
    private static GreenfootImage[] muestras = {new GreenfootImage("cActualAmarillo.png"),new GreenfootImage("cActualAzul.png"),new GreenfootImage("cActualRojo.png"),new GreenfootImage("cActualVerde.png"),new GreenfootImage("cActualMorado.png")};//carga todas las imagenes del orb en un arreglo
    
    /*
     * selecciona el color que este el personaje y lo pone como
     * seleccion actual
     */
    public void cambia(int color)
    {
      switch(color)
      {
          case 1:
               
              setImage(muestras[0]);
             
              
            
              break;
            
          case 2:
               setImage(muestras[1]);
              
            
            
              break;
              
          case 3:
              setImage(muestras[2]);
             
              
              break;
              
          case 4:
              setImage(muestras[3]);
           
              
              break;
              
          case 5:
              setImage(muestras[4]);
            
              
              break;
            
        
      }
    }
}
