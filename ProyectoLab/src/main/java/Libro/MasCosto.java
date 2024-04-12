
package Libro;


public class MasCosto implements Busqueda {

   int valor=0,posicion=0;
      
        
    @Override 
    public void arrancar() {
        
         for(int i=0;i<=4;i++){
                if(CostoLibro[i]>valor){
                    valor=CostoLibro[i];
                    posicion=i;
                }
            } 
        System.out.println("el libro mas castoso que se tiene es "+NombreLibro[posicion]+" con un valor de "+CostoLibro[posicion]);
    }

    @Override 
    public String tipo() {
        return "Mas Costoso";
    }
}
