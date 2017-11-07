package visual;

import javax.swing.GroupLayout; 
import javax.swing.GroupLayout.ParallelGroup; 
import javax.swing.GroupLayout.SequentialGroup; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class PantallaHola extends JFrame {
    GroupLayout pantalla ;
    JButton boton ;
    JTextField texto;
    
    public PantallaHola(){
        this.setSize(700, 700);
        this.setLayout(pantalla);
        AC();
        AH();
        this.setVisible(true);
        
       
    }
    
    private void AC() {
        boton= new JButton("hola");
        pantalla = new GroupLayout(getContentPane()); 
        texto = new JTextField("aca!!");
        
        getContentPane().setLayout(pantalla); 
        pantalla.setHorizontalGroup(AH()); 
        pantalla.setVerticalGroup(AV()); 
      
      
    }
    
    public ParallelGroup AH(){
        
        ParallelGroup pG= pantalla.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING); 
        SequentialGroup sG= pantalla.createSequentialGroup();
        
        sG.addContainerGap(); 
        sG.addComponent(texto,50,100,200);
        sG.addComponent(boton,100 /*javax.swing.GroupLayout.DEFAULT_SIZE*/, 100, /*Short.MAX_VALUE*/100); 
        sG.addContainerGap(); 

        pG.addGroup(sG); 

        return pG; 
    } 
    
    public ParallelGroup AV(){
    
        ParallelGroup pG= pantalla.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING); 
        SequentialGroup sG= pantalla.createSequentialGroup(); 
        
        sG.addContainerGap(); 
        sG.addComponent(texto,50,100,100);
        sG.addComponent(boton,100 /*javax.swing.GroupLayout.DEFAULT_SIZE*/, 100, /*Short.MAX_VALUE*/100); 
        sG.addContainerGap(); 
        
        pG.addGroup(sG); 
        
        return pG; 
    }

  
}
