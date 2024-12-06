
package sql;

import getset.Iniciar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import menu.Login;
import menu.Perfil;


/**
 *
 * @author Classless
 */
public class Crudsql {
    conexionsql conexion = new conexionsql();
    Iniciar ingresar =  new Iniciar();
    String[]datos=new String[3];
    Statement st;
    ResultSet rs;
   
     public void ingreso(String Usuario, String Clave){
         
      /*Connection con= conexion.ConectarBD(ingresar.usuario,ingresar.clave);
            st = con.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){Connection con= conexion.ConectarBD(ingresar.usuario,ingresar.clave);
            st = con.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){   
         */
      
        String sql="Select * from pg_user where usename='"+Usuario+"'";
        try {
            Connection con= conexion.ConectarBD(ingresar.usuario,ingresar.clave);
            st = con.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){
                String superusuario =
                        rs.getString("usesuper");
                if
                /*
                      Perfil abrir = new Perfil();
                    abrir.setVisible(true);
                    abrir.setLocationRelativeTo(null);
                }else{   
                 
                    Perfil abrir = new Perfil();
                    abrir.setVisible(true);
                    abrir.setLocationRelativeTo(null);
                   
                 }
            }    
                        
                  */      
                        (superusuario.equalsIgnoreCase("t"))
                {                 
                    Perfil abrir = new Perfil();
                    abrir.setVisible(true);
                    abrir.setLocationRelativeTo(null);
                }else{   
                 
                    Perfil abrir = new Perfil();
                    abrir.setVisible(true);
                    abrir.setLocationRelativeTo(null);
                   
                 }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"EL USUARIO NO EXISTE \n EN LA BASE DE DATOS");
        }  
    }
     
     
    }
      
      
      
      
      
    

