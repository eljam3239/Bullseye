/*
 *Eli James
 *Oct 9
 * Draws a bullseye with 2 alteranting random colours 
 */

package bullseyetest;
import javax.swing.JFrame;
/**
 *
 * Creates a small square frame
 */
public class BullseyeTest
{
   public static void main(String[] args)
   {
      Bullseye panel = new Bullseye();      
      JFrame application = new JFrame();
      
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      application.add(panel);
      application.setSize(230, 250);      
      application.setVisible(true);
   }
} // end class BullseyeTest
