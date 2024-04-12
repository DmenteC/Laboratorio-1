
package Libro;

public class MenosCosto implements Busqueda {
     int valor=0,posicion=0;
    @Override 
    public void arrancar() {
        valor=CostoLibro[0];
         for(int i=0;i<=4;i++){
                if(CostoLibro[i]<valor){
                    valor=CostoLibro[i];
                    posicion=i;
                }
            } 
         System.out.println("el libro menos costoso que se tiene es "+NombreLibro[posicion]+" con un valor de "+CostoLibro[posicion]);
    }
    
    
    @Override 
    public String tipo() {
        return "Menos Costoso";
    }
}
