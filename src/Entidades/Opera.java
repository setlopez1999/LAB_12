/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import jdk.nashorn.internal.runtime.regexp.joni.exception.JOniException;

/**
 *
 * @author ESTUDIANTE
 */
public class Opera {
    float a;
    float b;

    public Opera() {
    }
    public Opera(float a, float b ) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }
    
    public float suma ( float a, float b){
        return a+b;
    }
    public float resta ( float a, float b){
        return a-b;
    }
    public float div ( float a, float b){
       
        return a/b;
    }
    public float por ( float a, float b){
        return a*b;
    }
    
    public float divComprobar(float a, float b,JLabel nota){
        String mensaje= "";
        if(a == 0 && b == 0){
            mensaje = "No se puede dividir ceros";
            JOptionPane.showMessageDialog(
                    null, 
                    mensaje, 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }
        else if(b == 0){
            mensaje ="No se puede dividir entre 0";
            JOptionPane.showMessageDialog(
                    null, 
                    mensaje, 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }else{
            float resultado = div(a, b);
            return resultado;
        }
        nota.setText(mensaje);
        return 0;
    }
     
    public float getNumero(JTextField  caja,JLabel nota){
        nota.setText("");
        String num = caja.getText();
        
        try{
            return Float.parseFloat(num);
            
        }catch(NumberFormatException ex){
            nota.setText("Numero Invalido");
            JOptionPane.showMessageDialog(
                    null, 
                    "Numero Invalido", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }
        return 0;
        
    }
}
