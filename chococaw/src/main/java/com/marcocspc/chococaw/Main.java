/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcocspc.chococaw;

import UserFrontend.MainWindow;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author marcocspc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	    try { 
		    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	    } catch (ClassNotFoundException ex) {
		    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
	    } catch (InstantiationException ex) {
		    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
	    } catch (IllegalAccessException ex) {
		    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
	    } catch (UnsupportedLookAndFeelException ex) {
		    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
	    }

	    MainWindow mw = new MainWindow();
    }
    
}
