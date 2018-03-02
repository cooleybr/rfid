/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfid;
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author Mountainside 19
 */
public class mapPanel extends Applet{
    
   public void paint(Graphics g){
       setPreferredSize(new Dimension(600,400));
      
     int xpoints[] = {100, 175, 175, 225, 225, 175, 175, 160, 160, 100};
     int ypoints[] = {125, 125, 100, 100, 200, 200, 170, 170, 180, 180};
     int npoints = 10;
     g.drawPolygon(xpoints, ypoints, npoints);
   
   }
}
