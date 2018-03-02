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
public class topNav extends JPanel{
    
    public topNav(){
    setLayout(new GridBagLayout());
        setPreferredSize(new Dimension(400,100));
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 2;
        
        JButton home = new JButton("Home");
        c.gridx = 0;
        add(home,c);
        JButton facility = new JButton("Facility");
        c.gridx = 1;
        add(facility,c);
        JButton assets = new JButton("Assets");
        c.gridx = 2;
        add(assets,c);
        JButton alerts = new JButton("Alerts");
        c.gridx = 3;
        add(alerts,c);
        JButton reports = new JButton("reports");
        c.gridx = 4;
        add(reports,c);
    
}
    
}
