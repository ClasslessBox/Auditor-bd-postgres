package sql;
import static getset.Iniciar.clave;
import static getset.Iniciar.usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.sql.rowset.CachedRowSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Classless
 */
public class conexionsql {
private static conexionsql instancia;
       
    private static Connection conexion;
        
    Connection conectar = null; 
    public static final String URL = "jdbc:postgresql://localhost:5432/Usuarios";   
    
    
   public Connection ConectarBD(String usuario, String clave){
        try{
            Class.forName("org.postgresql.Driver");
            conectar = (Connection)DriverManager.getConnection(URL,usuario,clave);      
        }catch(Exception e){            
         //JOptionPane.showMessageDialog(null, "EL usuario no tiene este permiso", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            
            
            
        }
        return conectar;
    }
    public void DesconectarBD(){
       try {
           conexion.close();
       } catch (Exception e) {
           
         //  JOptionPane.showMessageDialog(null, "El Usuario no tiene este permiso", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
       }
        
    }
    public static conexionsql getInstancia() {
    if(instancia==null){
        instancia= new conexionsql();
    }
        return instancia;
    }

    public Connection ConectarBD() {
        try{
            Class.forName("org.postgresql.Driver");
            conectar = (Connection)DriverManager.getConnection(URL,usuario,clave);      
        }catch(Exception e){            
           System.err.println("ERROR 1111111"+e.getMessage());
        }
        return conectar;
        
    
    }

}
   
