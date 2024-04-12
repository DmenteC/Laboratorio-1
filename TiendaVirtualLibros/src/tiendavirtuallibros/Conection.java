package tiendavirtuallibros;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conection {
    // URL de conexión a la base de datos, ajusta los parámetros según tu configuración
    private static final String URL = "jdbc:mysql://localhost:3306/tienda_libros";
    private static final String USER = "root";
    private static final String PASSWORD = "200321";
    
    // La única instancia de la clase
    private static volatile Conection instance;
    private Connection conn;

    // Constructor privado para prevenir la instanciación desde fuera
    private Conection() {
        try {
            // Registrando el JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Abriendo la conexión
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos!");
        } catch (ClassNotFoundException | SQLException e) {
            // Manejo de errores
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Este método retorna la única instancia de Conection
     * @return instancia de Conection
     */
    public static Conection getInstance() {
        if (instance == null) { // Primer chequeo
            synchronized (Conection.class) { // Bloque de sincronización
                if (instance == null) { // Segundo chequeo
                    instance = new Conection();
                }
            }
        }
        return instance;
    }

    /**
     * Este método retorna la conexión a la base de datos
     * @return objeto Connection
     */
    public Connection getConnection() {
        return conn;
    }

    // Método main para probar la conexión
    public static void main(String[] args) {
        Connection testConn = Conection.getInstance().getConnection();
        if (testConn != null) {
            try {
                testConn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}