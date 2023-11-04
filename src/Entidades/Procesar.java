package Entidades;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author SetLopez1999
 */
public class Procesar {
    //usaremos la clase opera
    float num1 = 0;
    float num2 = 0;
    String mensaje = "";
    //Inicializamos el modelo
    DefaultListModel modelo = new DefaultListModel();
    
    Opera op = new Opera();
    //Constructor
    public Procesar() {
        //Inicializamos modelo
        
        modelo.add(0," ");
        modelo.add(1," ");
        modelo.add(2," ");
        modelo.add(3," ");
    }

    public void ValidarNumero1(JTextField caja,JLabel nota){
        VaciarNota(nota);
        //Obtenemos el numero
        num1 = op.getNumero(caja, nota);
        //caja.setText(num1+"");
    }
    public void ValidarNumero2(JTextField caja,JLabel nota){
        VaciarNota(nota);
        //Obtenemos el numero
        num2 = op.getNumero(caja, nota);
        //caja.setText(num2+"");
    }
    public void VaciarNota(JLabel nota){
        nota.setText("");
    }
    
    public void PonerResultado(JList lista_historial,JTextField resultado,float num){
        //Remplazamos los valores anteriores
        modelo.set(0, modelo.get(1));
        modelo.set(1, modelo.get(2));
        modelo.set(2, modelo.get(3));
        modelo.set(3, resultado.getText());
        resultado.setText(num+"");
        
        lista_historial.setModel(this.modelo);
    }
    
    public void OperacionSuma(JList lista_historial,JTextField resultado){
        //Obtenemos la operacion
        float num = op.suma(num1, num2);
        //ponemos num en el resultado
        PonerResultado(lista_historial,resultado,num);
        
    }
    public void OperacionResta(JList lista_historial,JTextField resultado){
        //Obtenemos la operacion
        float num = op.resta(num1, num2);
        //resultado.setText(num+"");
        PonerResultado(lista_historial,resultado,num);
        
    }
    public void OperacionMulti(JList lista_historial,JTextField resultado){
        //Obtenemos la operacion
        float num = op.por(num1, num2);
        //resultado.setText(num+"");
        PonerResultado(lista_historial,resultado,num);
      
    }
    public void OperacionDiv(JList lista_historial,JTextField resultado,JLabel nota){
        //Obtenemos la operacion
        float num = op.divComprobar(num1, num2,nota);
        //resultado.setText(num+"");
        PonerResultado(lista_historial,resultado,num);
        
    }
}
