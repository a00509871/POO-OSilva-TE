/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.tema5;
import java.awt.*;

/**
 *
 * @author falvizo
 */
public class ventana1 extends Frame  {
    //Atributos: 3 botones.
    private Button b1, b2, b3;
    
    //Constructor
    public ventana1 (){
        super("Esta es una ventana de prueba");
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        b1 = new Button("Soy el botón 1");
        add (b1);
        
        b2 = new Button ("Soy el botón 2");
        add (b2);
        
        b3 = new Button ("Soy el botón 3");
        add (b3);
        
        setSize(500,400);
        setVisible(true);
    
    }
}
