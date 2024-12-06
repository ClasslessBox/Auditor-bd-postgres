
package getset;

/**
 *
 * @author Classless
 */
public class Iniciar {
     public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        Iniciar.usuario = usuario;
    }

    public static String getClave() {
        return clave;
    }

    public static void setClave(String clave) {
        Iniciar.clave = clave;
    }
    public static String usuario;
    
    public static String clave;         
}
