package menu;

import Boton.textos;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import sql.conexionsql;
import menu.Perfil;
import static sql.conexionsql.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Classless
 */

public class insertar {
    static conexionsql Conexion = conexionsql.getInstancia();
 
    Statement st;
    ResultSet rs;
    textos txt=new textos();
    
    public void insertartext(String texto) {
        try {
            
             Connection conectado = Conexion.ConectarBD();
             st=conectado.createStatement();
            String sql = "insert into textos(texto) "
                    + "values('"+texto+"');";
          
            st.execute(sql);
            st.close();
            conectado.close();
            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "El usuario no tiene acceso a este boton" );
            System.out.print(e.toString());
        }
    }
public void SelectText (){
          DefaultTableModel modelo = new DefaultTableModel();
        
    
    try {
        Connection conectado = Conexion.ConectarBD();
             st=conectado.createStatement();
        rs= st.executeQuery("Select id_tex,texto,veliz from textos natural join palabras");
          
             }

    
    
    
    catch(Exception e){
  System.err.println("ERROR AL MOSTRAR"+e.getMessage());        
    }
}
    
    }
    


