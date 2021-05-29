package de.gyko.gameofcolors.app;

import java.awt.Color;

/**
 * Diese Klasse stellt das Spielfeld/ Battlefield dar.
 * 
 * @author sophia
 *
 */
public class Battlefield {

	/**
	 * Diese Methode setzt auf die Koordinate die Farbe.
	 * @param x
	 * @param y
	 * @param color
	 */
   public void setColorAt(int x, int y, Color color){	
	}
   
   /**
    * Diese Methode liefert die Farbe zur�ck, die das 
    * Spielfeld auf der Koordinate (x/y) hat.
    * @param x
    * @param y
    * @return
    */
   public Color getColorAt(int x, int y) {
   }
   
   
   /**
    * Die H�he des Battlefields in der Einheit Anzahl K�stchen.
    */
   private int height = 0;
   
   /**
    * @return the height
    */
   public int getHeight() {
	   return height;
   }
   
   /**
    * @param height the height to set
    */
   public void setHeight(int height ) {
	   this.height = height;
   }
   
   /**
    * Die Weite des Battlefields in der Einheit Anzahl K�stchen.
    */
   private int width = 0;
   
   /**
    * @return the width
    */
   public int getWidth() {
	   return width;
   }
   
   /**
    * @param width the width to set
    */
   public void setWidth (int width ) {
	   this.width = width;
   }
   
   
}
