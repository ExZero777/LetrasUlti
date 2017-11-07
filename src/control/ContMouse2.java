package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

public class ContMouse2 implements MouseListener{
    private String tL;
    private JTextField tE;

    public ContMouse2(String let, JTextField text2) {
       this.tE = tE;
       this.tL = tL;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        tE.setText(tE.getText()+tL);
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
