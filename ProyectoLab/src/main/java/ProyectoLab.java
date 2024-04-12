
import java.util.Scanner;
import Libro.Busqueda;
import static Libro.Busqueda.CostoLibro;



import Libro.Libros;


public class ProyectoLab {


    public static void main(String[] args) {
        int a=1;
        
       
                
            
            
        while(a!=3){
        System.out.println("ingrese 1 para busqueda por Mas costoso");
        System.out.println("ingrese 2 para busqueda por Menos costoso");
        System.out.println("ingrese 3 para finalizar el programa");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        switch(a){
            case 1 -> {
                Busqueda t1 = Libros.construir("MasCosto");
                    t1.arrancar();
                    
	    
                System.out.println(t1.tipo());
            }
            case 2 -> {
                Busqueda t1 = Libros.construir("MenosCosto");
	    
                    t1.arrancar();
	    
                System.out.println(t1.tipo());
            }
            case 3 -> {
                System.out.println("Gracias por usar el programa");
            }
            default -> {
                System.out.println("ingrese un valor correcto");
            }
        }
            
        }
    }
}
