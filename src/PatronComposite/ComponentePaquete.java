package PatronComposite;
public abstract class ComponentePaquete {
    protected String nombre;
    protected double peso;

    public ComponentePaquete(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public abstract void mostrarDetalles();

    public void agregarComponente(ComponentePaquete componente) {
        throw new UnsupportedOperationException();
    }

    public void eliminarComponente(ComponentePaquete componente) {
        throw new UnsupportedOperationException();
    }

    public ComponentePaquete obtenerHijo(int posicion) {
        throw new UnsupportedOperationException();
    }
}
