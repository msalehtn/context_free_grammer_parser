/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cfg;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

/**
 *
 * @author SalehTN
 */
public class CFG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         UIManager.LookAndFeelInfo plaf[] = UIManager.getInstalledLookAndFeels();
    for (int i = 0, n = plaf.length; i < n; i++) {
      System.out.println("Name: " + plaf[i].getName());
      System.out.println("  Class name: " + plaf[i].getClassName());
    }
       SwingUtilities.invokeLater(new Runnable() {
    public void run() {
     	MainFrame x = new MainFrame();
				MainFrame.setDefaultLookAndFeelDecorated(true);

				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
				} catch (ClassNotFoundException | InstantiationException
						| IllegalAccessException
						| UnsupportedLookAndFeelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				SwingUtilities.updateComponentTreeUI(x);
				 x.setLocationByPlatform(true);
       x.setDefaultLookAndFeelDecorated(true);
			                        x.setVisible(true);
	
			}
		});
		

    }
 
    }
    

