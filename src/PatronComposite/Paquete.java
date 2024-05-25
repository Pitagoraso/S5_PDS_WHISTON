package PatronComposite;
import java.util.ArrayList;
import java.util.List;

public class Paquete extends ComponentePaquete {
    private List<ComponentePaquete> componentes = new ArrayList<>();

    public Paquete(String nombre, double peso) {
        super(nombre, peso);
    }

    @Override
    public void agregarComponente(ComponentePaquete componente) {
        componentes.add(componente);
    }

    @Override
    public void eliminarComponente(ComponentePaquete componente) {
        componentes.remove(componente);
    }

    @Override
    public ComponentePaquete obtenerHijo(int posicion) {
        return componentes.get(posicion);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Paquete: " + getNombre() + ", Peso: " + getPeso() + " kg");
        for (ComponentePaquete componente : componentes) {
            componente.mostrarDetalles();
        }
    }
}


