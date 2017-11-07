package Vinculos;

import control.ContMouse;
import control.ContMouse3;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Simbolos extends JButton {
    private JTextField text3;
    private String let;
   
    private ContMouse cMo;
    
     public Simbolos(String valueOf, JTextField texto) {
       super(valueOf);
       this.text3 = texto;
       this.let = valueOf;
       
       ContMouse3 cMous3 = new ContMouse3(let,text3);    
       this.addMouseListener(cMous3);
    }
}
