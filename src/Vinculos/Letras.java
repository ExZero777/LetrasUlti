package Vinculos;


import control.ContMouse;
import javax.swing.JButton;
import javax.swing.JTextField;


public class Letras extends JButton {
    
   private JTextField text;
   private String let;
   private String textGuar ;
   
    public Letras(String string) {
        textGuar=text.toString();
            
    }
  
   
   
   private ContMouse cMo;
    

   
   
    public Letras(String valueOf, JTextField texto) {
       super(valueOf);
       this.text = texto;
       this.let = valueOf;
       
       ContMouse cMous = new ContMouse(let,text);    
       this.addMouseListener(cMous);
       
       
       
    }

   
   
    
}
