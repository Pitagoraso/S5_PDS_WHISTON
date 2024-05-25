package PatronBridge;
public abstract class Documento {
    protected Formato formato;

    public Documento(Formato formato) {
        this.formato = formato;
    }

    public abstract void generar();
}
