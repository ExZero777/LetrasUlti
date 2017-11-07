package visual;

import java.awt.Component;
import java.awt.Container;
import javax.swing.GroupLayout; 
import javax.swing.GroupLayout.ParallelGroup; 
import javax.swing.GroupLayout.SequentialGroup; 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JPanel;

public class Pantalla extends JFrame {
    Container panel = new Container();
    GroupLayout layout = new GroupLayout(panel);
    JButton c1 = new JButton("hola");
    JButton c2 = new JButton("je");
    JButton c3 = new JButton("ro");
    JButton c4 = new JButton("pa");
   
public Pantalla(){
   
  panel.setLayout(layout); 
  //this.setLayout(layout);
   
 
    layout.setAutoCreateGaps(true);
    layout.setAutoCreateContainerGaps(true);

layout.setHorizontalGroup(
    layout.createSequentialGroup()
      .addComponent(c1)
      .addComponent(c2)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
           .addComponent(c3)
           .addComponent(c4))
);
layout.setVerticalGroup(
   layout.createSequentialGroup()
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
           .addComponent(c1)
           .addComponent(c2)
           .addComponent(c3))
      .addComponent(c4)
); 
   
   
}

}
