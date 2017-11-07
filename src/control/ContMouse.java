package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

public class ContMouse implements MouseListener {
    private String tL;
    private JTextField tE;
    
    public ContMouse(String tL, JTextField tE) {
       this.tE = tE;
       this.tL = tL;
        
    }

       @Override
    public void mouseClicked(MouseEvent e) {
      tE.setText(tE.getText()+tL);
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
       
}
