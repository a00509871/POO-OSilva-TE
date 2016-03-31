/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo.osilva.tareaextra;

/**
 *
 * @author A00509871
 */
public class CalculadoraMC {

    
    //Atributos
    protected static Double peso;
    protected static Double estatura;                
    protected static String nombre;
    
    public static Double calcularIMC(){
        return peso/(estatura*estatura); 
    }
    
    public static String mensajeSalud(){
        Double aux = calcularIMC();
        String mensaje = nombre + " tu IMC indica: ";
        if (aux < 18){
            mensaje += "Peso bajo";
        } else if (aux < 25){
            mensaje += "Peso normal";
        } else if (aux < 27){
            mensaje += "Sobrepeso";
        } else if (aux < 30){
            mensaje += "Obesidad grado I";
        } else if (aux < 40){
            mensaje += "Obesidad grado II";
        } else{
            mensaje += "Obesidad grado III Extrema o Mórbida";
        }
        
        return mensaje;                
    }
    
        
}
