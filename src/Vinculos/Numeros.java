package Vinculos;

import control.ContMouse2;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Numeros extends JButton {
    private JTextField text2;
    private String let2;
   
    private ContMouse2 cMo;
    
     public Numeros(String valueOf, JTextField texto) {
       super(valueOf);
       this.text2 = texto;
       this.let2 = valueOf;
       
       ContMouse2 cMous2 = new ContMouse2(let2,text2);    
       this.addMouseListener(cMous2);
     }
}
