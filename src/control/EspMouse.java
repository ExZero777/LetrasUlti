package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;


public class EspMouse implements MouseListener{
    private JTextField texto;
    private String tex;
    
    public EspMouse(JTextField tEs) {
       this.texto = tEs;
    }
    
    @Override
    public void mouseClicked(MouseEvent me) {
    texto.setText(texto.getText()+"_");
    }

    @Override
    public void mousePressed(MouseEvent me) {
      
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
    
    
    
}
