
package com.ceep.gestionVentas;

import com.ceep.dominio.*;

public class GestionVentas {

  
    public static void main(String[] args) {
       
        producto prod1 = new producto ("Peras", 5.4);
        producto prod2= new producto ("Manzanas", 6.4);
        producto prod3 = new producto ("Peras", 7);
        orden pedido1 = new orden();
        pedido1.agregarProducto(prod1);
        pedido1.agregarProducto(prod2);
        pedido1.agregarProducto(prod3);
        pedido1.mostrarOrden();
    }
    
}
