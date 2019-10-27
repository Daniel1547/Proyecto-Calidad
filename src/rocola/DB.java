/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rocola;

import Vistas.Registro;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Dani
 */
public class DB {
    
       
    Conexion cx;
 
 public DB (){
     cx=new Conexion();
 }
    
    public boolean crear(Datos user){
        Registro res = new Registro();
     if(cx==null){
         cx.conectar();
     }//******************************
     try {
         String sql="INSERT INTO USUARIO('" + 0 + "', Nombre, Apellido, Sexo, Usuario,Contrasena, Correo, Numero)VALUES(?,?,?,?,?,?,?,?);";
         PreparedStatement ps= cx.conectar().prepareStatement(sql);
            ps.setInt(1, user.getId());
            ps.setString(2, user.getNombre());
            ps.setString(3, user.getApellido());
            ps.setString(4, user.getSexo());
            ps.setString(5, user.getCorreo());
            ps.setString(6, user.getUsuario());
            ps.setString(7, user.getContrasena());
            ps.setInt(8, user.getTelefono());
           
         ps.execute();
         ps.close();
         ps=null;
         cx.desconectar();
         System.out.println("Usuario ingresado");
        
         return true;
         
     } catch (SQLException ex) {
         System.out.println("No se logro insertar usuario");
         cx.desconectar();
         return false;
     }
    }
}
