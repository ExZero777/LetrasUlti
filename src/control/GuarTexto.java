package control;

import DAO.Coneccion;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class GuarTexto implements MouseListener {
    private JTextField texto;
    //private String guarTexto;
   Connection conect;
   PreparedStatement s;
   String user = "root";
   String password = "";
   String url = "jdbc:mysql://localhost:3306/base_texto";
   String driver= "com.mysql.jdbc.Driver";
    
   
    public GuarTexto(JTextField texto) {
       // guarTexto = texto.toString();
        this.texto = texto;
        
    }

 
    @Override
    public void mouseClicked(MouseEvent evt) {
         Coneccion conn = new Coneccion("localhost", "root", "", "base_texto");
     System.out.println("Guardadisimo Papa");
            try {
            Class.forName(driver);
            System.out.println("Guardadisimo Papa");
            conect=DriverManager.getConnection(url,user,password);
            System.out.println("Guardadisimo Papa2");
            s=conect.prepareStatement("insert into texto (texto) values (?)");
            System.out.println("Guardadisimo Papa3");
            s.setString(1, texto.getText());
            s.executeUpdate();
            System.out.println(" Recontra Guardadisimo Papa");
            JOptionPane.showMessageDialog(null, "texto guardado exitosamente");
        } 
        catch(ClassNotFoundException e){
              JOptionPane.showMessageDialog(null, e);
        } 
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } 
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
