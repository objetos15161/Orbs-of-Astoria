import greenfoot.*;
import java.awt.Color;
import java.lang.String;


/**
 * pone en pantalla algun texto
 * 
 * @Miguel Delgado Ayala
 * @1.0
 */
public class Mensaje extends Actor
{
    private GreenfootImage txt;
    /**
     * constructor de mensaje, a la cadena que llega le pone el color y tamaño
     */
   public Mensaje(String t)
    {
        
        txt=new GreenfootImage(t,22,new Color(255,255,255),null);
        setImage(txt);
    
    }
}
