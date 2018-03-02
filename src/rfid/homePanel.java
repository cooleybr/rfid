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
public class homePanel extends JPanel {
    
    public homePanel(){
        setLayout(new BorderLayout(10,10));
        
        JPanel navigation = new JPanel();
        navigation = new topNav();
        add(navigation,BorderLayout.NORTH);
        
        Applet map = new Applet();
        map = new mapPanel();
        
        add(map,BorderLayout.CENTER);
        
        
    }
    
    
}
