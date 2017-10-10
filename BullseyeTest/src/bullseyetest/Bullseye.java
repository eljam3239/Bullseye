

package bullseyetest;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;
/**
 *
 *Generates two sets of 3 values that will serve as the rgb numbers to create two random colours, draws 8 rings of that pattern
 */
public class Bullseye extends JPanel
{
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      
      Random r = new Random();
      
      
      int a = r.nextInt(256);
      int b = r.nextInt(256);
      int c = r.nextInt(256);
      int d = r.nextInt(256);
      int e = r.nextInt(256);
      int f = r.nextInt(256);
      
      Color x = new Color(a,b,c);
      Color y = new Color (d,e,f);
      // draw the first circle
      g.setColor(x);
      g.fillOval(10, 10, 200, 200);
      
      // 2nd
      g.setColor(y);
      g.fillOval(23, 23, 175, 175);
      
      // 3rd
      g.setColor(x);
      g.fillOval(36, 36, 150, 150);
      
      // 4th
      g.setColor(y);
      g.fillOval(49, 49, 125, 125);
      //5th
      g.setColor(x);
      g.fillOval(62, 62, 100, 100);
      //6
      g.setColor(y);
      g.fillOval(75, 75, 75, 75);
      //7
      g.setColor(x);
      g.fillOval(88, 88, 50, 50);
      //8
      g.setColor(y);
      g.fillOval(101, 101, 25, 25);
   } 
} 