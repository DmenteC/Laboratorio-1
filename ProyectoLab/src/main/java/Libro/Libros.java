
package Libro;

public class Libros {
        
    public static Busqueda construir(String tipo){
        switch(tipo){
            case "MenosCosto" -> {
                
                return new MenosCosto();
            }
            case "MasCosto" -> {
                return new MasCosto();
            }
            default -> {
                System.out.println("No se encuentra dicha busqueda.");
                return null;
            }
        }
    }
}