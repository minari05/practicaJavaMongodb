/**
 *
 * @author ximer
 */
package javamongo501;

public class JavaMongo501 {

    public static void main(String[] args) {

        Connection conexion = new Connection();
        
        conexion.Mostrar();
        
//        conexion.insertar("Nadar");
            System.out.println("Otro");
        conexion.Mostrar();
        
        System.out.println("Otro más");
//        conexion.Actualizar("nadar", "Viajar");
      conexion.Eliminar("Viajar");
      
        conexion.Mostrar();
   }

}
