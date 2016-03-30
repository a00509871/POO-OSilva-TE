/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.tema5;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author falvizo
 */
public class ejemploSwingEvento {


    public static void mostrar() {
        JFrame frame = new JFrame("HolaMundoSwing");
        final JLabel label = new JLabel("Hola Mundo");
        frame.getContentPane().add(label);
        frame.addWindowListener(new java.awt.event.WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        }
        );
        frame.pack();
        frame.setVisible(true);
    }
}
