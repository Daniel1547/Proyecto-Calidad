 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rocola;

import Vistas.Registro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dani
 */
public class Conexion {
    
    
       Connection cx;
    String bD= "registro";
    String url = "jdbc:mysql://localhost:3306/"+bD;
    String user = "root";
    String pass = "12345";
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cx=(Connection)DriverManager.getConnection(url,user,pass);
            System.out.println("Conexion exitosa");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Conexion fallida");
        }
        return cx;
    }
    public void desconectar(){
        try {
            cx.close();
            System.out.println("Se desconecto");
        } catch (SQLException ex) {
            System.out.println("No logro desconectarse");
        }
    }
            
     
 
    
    
}
