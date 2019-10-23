/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rocola;

import Vistas.Perfil;
import java.awt.Image;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Dani
 */
public class Datos {
    
    private String nombre;
    private String apellido;
    private String sexo;
    private String correo;
    private String usuario;
    private String contrasena;
    private int telefono;

    public Datos( String nombre, String apellido, String sexo, String correo, 
            String usuario, String contrasena, int telefono) {
       
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.correo = correo;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

 

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public boolean esCorreo(String correo){
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("([A-Za-z0-9])*+[.]+([A-Za-z0-9])*@uacm.edu.mx");
        mat = pat.matcher(correo);
        if(mat.find())
            return true;
        else
            return false;
    }
    
    /*public void seleccionarFoto(){
        JFileChooser file = new JFileChooser();
        file.showOpenDialog(file);
        File archivo = file.getSelectedFile();
        Perfil per = new Perfil ();
        if(archivo != null){
            String origen = archivo.getPath();
           ImageIcon icon = new ImageIcon(origen);
           Icon icono = new ImageIcon(icon.getImage().getScaledInstance(per.jlFoto.getWidth(),per.jlFoto.getHeight(),Image.SCALE_DEFAULT));
           per.jlFoto.setText(null);
           per.jlFoto.setIcon(icon);
        }else{
            JOptionPane.showMessageDialog(null,"error abriendo la imagen");
        }
    }*/
}