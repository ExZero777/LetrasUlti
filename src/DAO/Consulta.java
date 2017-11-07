package DAO;

import Vinculos.Letras;
import control.GuarTexto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class Consulta {
    /*
     private String tabla = "letras";
     public void guardar(Connection conexion, Letras letras) throws SQLException{
      try{
         PreparedStatement consulta;
         if(letras.getIdLetras()== null){
            consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + "(Id_Letras, Texto_Letras) VALUES(?, ?)");
            consulta.setInt(1, letras.getIdLetras());
            consulta.setString(2, letras.getTexto_Letras());
            
         }else{
            consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET Id_Letras = ?, Texto_Letras = ? WHERE codigo = ?");
            consulta.setInt(1, letras.getIdLetras());
            consulta.setString(2, letras.getTexto_Letras());
          
         }
         consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }
    */
    
 /*  public GuarTexto guardarTexto(Connection conexion, String textGuar) throws SQLException {
      GuarTexto letGuar = null;
     
      
      try{
         PreparedStatement consulta = conexion.prepareStatement("select Texto_Guar from Texto");
         consulta.setString(1, textGuar);
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
            // letGuar = new GuarTexto(resultado.getString("Texto_Guar"));
            letGuar.add(new GuarTexto(resultado.getString("Texto_Guar")));
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return letGuar;
   }
    
    public PersonaGenero recuperarGeneroID (Connection conexion, Integer idGenero) throws SQLException {
       PersonaGenero personaGenero = null;
      try{
         PreparedStatement consulta = conexion.prepareStatement("select id, nombre from persona_genero where id = ?");
         consulta.setInt(1, idGenero);
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
             personaGenero = new PersonaGenero(resultado.getInt("id"), resultado.getString("nombre"));
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return personaGenero;
   }
   public ArrayList<Persona> ListadoPersonas(Connection conexion) throws SQLException {
          ArrayList<Persona> listaPersonas = new ArrayList();
        try{
         PreparedStatement consulta = conexion.prepareStatement("select id, nombre, apellido, genero, dni from persona");
       
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
             listaPersonas.add(new Persona(resultado.getInt("id"), null, resultado.getString("nombre"), resultado.getString("apellido"), resultado.getInt("dni")));
            
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return listaPersonas;
   }
 
   public Persona ingresoPersona(Connection conexion, String textUsu, String textCont) throws SQLException {
        Persona ingPersona = null;
        PersonaGenero pGenero;
        try{
            PreparedStatement consulta = conexion.prepareStatement("select usuario, contrasena from persona");
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                pGenero = this.recuperarGeneroID(conexion, resultado.getInt("persona_genero_id"));
                ingPersona = new Persona(resultado.getInt("id"), pGenero, resultado.getString("nombre"), resultado.getString("apellido"), resultado.getInt("dni"));
            
         } 
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return ingPersona;
   }
*/
   
}
