package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

public class BorMouse implements MouseListener{
    private JTextField texto;

    public BorMouse(JTextField tB) {
       this.texto =tB;
    }
    
    @Override
    public void mouseClicked(MouseEvent me) {
        texto.setText(" ");
        
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
