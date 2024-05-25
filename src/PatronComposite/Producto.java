package PatronComposite;
public class Producto extends ComponentePaquete {
    public Producto(String nombre, double peso) {
        super(nombre, peso);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Producto: " + getNombre() + ", Peso: " + getPeso() + " kg");
    }
}

