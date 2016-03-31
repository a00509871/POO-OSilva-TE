/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.osilva.tareaextra;
import java.text.DecimalFormat;
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
        Double estatura;
        String mensajeFinal;
        boolean numeroCorrecto;
        
        // Mensaje de diálogo donde pide le nombre. No hay problema si no se 
        // escribe nada o si escribe números y símbolos
        
        nombre = JOptionPane.showInputDialog(null, "¿Cómo te llamas?", "Nombre", -1);
        
        /**
         * Código que pedirá al usuario su peso, y que el peso que ingrese sea válido
         */
        peso = -1.0;        
        do {            
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
        
        /**
         * Código que pedirá al usuario su estatura, y que la estatura que ingrese sea un número válido
         */
        estatura = -1.0;
        do {
            
            numeroCorrecto = true;
            
            try {                
                estatura = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Cuál es tu estatura?", "Estatura", -1));
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Debes ingresar un número", "Alerta", 0);                
                numeroCorrecto = false;
            }
            
            if(numeroCorrecto && estatura<=0){                
                JOptionPane.showMessageDialog(null, "No se puede tener una altura menor o igual a 0", "Alerta", 0);
                numeroCorrecto = false;
            }
                                    
        } while(!numeroCorrecto);
    
        /**
         * Adelante se encuentra el código para mostrar un mensaje que indica al usuario su IMC.
         */
        
        DecimalFormat df = new DecimalFormat("#.00");                
        CalculadoraMC.nombre = nombre;
        CalculadoraMC.estatura = estatura;
        CalculadoraMC.peso = peso;
        
        JOptionPane.showMessageDialog(null, "IMC: " + df.format(CalculadoraMC.calcularIMC()) + "\n" + CalculadoraMC.mensajeSalud(), "IMC", -1);
        
    }

}

