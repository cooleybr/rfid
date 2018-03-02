/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfid;
import java.awt.*;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author Mountainside 19
 */
public class RFID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame frame = new JFrame("RFID Asset Tracking");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600,400));
        frame.setLocationByPlatform(true);
        JTabbedPane tp = new JTabbedPane();
        
        tp.addTab("Locations",new homePanel());
        
        frame.getContentPane().add(tp);
        frame.pack();
        frame.setVisible(true);
        
    }
    
}
