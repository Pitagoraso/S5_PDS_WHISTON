package PatronComposite;
public class Cliente {
    public static void main(String[] args) {
        ComponentePaquete paquetePrincipal = new Paquete("Paquete Principal", 0.0);

        ComponentePaquete paquete1 = new Paquete("Paquete 1", 0.0);
        ComponentePaquete paquete2 = new Paquete("Paquete 2", 0.0);

        ComponentePaquete producto1 = new Producto("Producto 1", 1.5);
        ComponentePaquete producto2 = new Producto("Producto 2", 2.0);
        ComponentePaquete producto3 = new Producto("Producto 3", 3.0);

        paquete1.agregarComponente(producto1);
        paquete1.agregarComponente(producto2);

        paquete2.agregarComponente(producto3);

        paquetePrincipal.agregarComponente(paquete1);
        paquetePrincipal.agregarComponente(paquete2);

        paquetePrincipal.mostrarDetalles();
    }
}



