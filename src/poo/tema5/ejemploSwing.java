/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.tema5;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author falvizo
 */
public class ejemploSwing {
    public static void mostrar(){      //Se crea un objeto JPAnel de 300X300 de color
 
    JPanel panelRojo =new JPanel();
    panelRojo.setBackground(Color.RED);
    panelRojo.setSize(500,500);    //Se crea una ventana de 500X500
 
    JFrame ventana=new JFrame("Prueba en color rojo");
    ventana.setLocation(200,100);
    ventana.setSize(500,500);
    ventana.setVisible(true);  
//Se coloca el JPanel en el content pane 
    Container contentPane=ventana.getContentPane();
    contentPane.add(panelRojo);
    }
}
