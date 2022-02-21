/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanzaayuda;

import java.awt.event.KeyEvent;
import java.io.File;
import java.net.URL;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author chris
 */
public class LanzaAyuda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("FrameDemo");
        
        JMenuBar menuBar;
        JMenu menu;
        JMenuItem menuItem;

        menuBar = new JMenuBar();

        menu = new JMenu("Ayuda");
        menuBar.add(menu);

        menuItem = new JMenuItem("Contenido de ayuda");
        menu.add(menuItem);
        
        HelpSet hs = obtenFicAyuda();
        HelpBroker hb = hs.createHelpBroker();
        
        hb.enableHelpOnButton(menuItem, "introduccion", hs);
        
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
        hb.enableHelpKey(menuItem, "introduccion", hs);

        menuItem = new JMenuItem("About");
        menu.add(menuItem);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setJMenuBar(menuBar);
        
        frame.setSize(300, 200);
        
        frame.setVisible(true);
        
       
        
    }
    
    public static HelpSet obtenFicAyuda(){
        try {
            ClassLoader cl = LanzaAyuda.class.getClassLoader();
            File file = new
            File(LanzaAyuda.class.getResource("../help/helpset.hs").getFile());
            URL url = file.toURI().toURL();
            // crea un objeto Helpset
            HelpSet hs = new HelpSet(null,url);
            return hs;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Fichero HelpSet no encontrado");
            return null;
        }
   }
    
}
