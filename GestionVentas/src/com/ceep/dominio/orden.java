
package com.ceep.dominio;

public class orden {
   private final int idOrden;
   producto productos[];
   private static int contadorOrdenes;
   private static int contadorProductos;
   private static final int MAX_PRODUCTOS = 10;
   
   public orden(){
       productos = new producto[orden.MAX_PRODUCTOS];
      this.idOrden = ++orden.contadorOrdenes; 
   }
   
   public void agregarProducto(producto producto){
       if (orden.contadorProductos < orden.MAX_PRODUCTOS) {
           productos[orden.contadorProductos++] = producto; 
       } else {
           System.out.println("Has alcanzado el máximo de productos por orden de " + orden.MAX_PRODUCTOS);
       }
   }
   
   public double calcularTotal(){
       var res = 0.0;
       for (int i = 0; i < orden.contadorProductos; i++) {
           res += productos[i].getPrecio();
       }
       return res;
   }
   
   public void mostrarOrden(){
       System.out.println("Id de Orden: " + this.idOrden);
       for (int i = 0; i < orden.contadorProductos; i++) {
           System.out.println("Nombre producto [" + i + "] ->"+ productos[i].getNombre());
           System.out.println("Precio producto [" + i + "] ->"+ productos[i].getPrecio());
       }
       System.out.println("Total: " + this.calcularTotal());
   }
}
