package PatronBridge;
public class Informe extends Documento {
    public Informe(Formato formato) {
        super(formato);
    }

    @Override
    public void generar() {
        formato.aplicarFormato("Informe");
    }
}
