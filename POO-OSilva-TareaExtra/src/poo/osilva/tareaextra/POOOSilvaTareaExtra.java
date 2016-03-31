/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.osilva.tareaextra;

import javax.swing.*;

/**
 *
 * @author A00509871
 */
public class POOOSilvaTareaExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String nombre;
        Double peso;         
        boolean numeroCorrecto;

        nombre = JOptionPane.showInputDialog(null, "¿Cómo te llamas?", "Nombre", -1);        
        
        do {
            peso = -1.0;
            numeroCorrecto = true;
            
            try {                
                peso = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Cuál es tu peso?", "Peso", -1));
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Debes ingresar un número", "Alerta", 0);                
                numeroCorrecto = false;
            }
            
            if(numeroCorrecto && peso<=0){                
                JOptionPane.showMessageDialog(null, "No se puede tener un peso menor o igual a 0", "Alerta", 0);
                numeroCorrecto = false;
            }
                                    
        } while(!numeroCorrecto);        
        
        
    
    }

}

