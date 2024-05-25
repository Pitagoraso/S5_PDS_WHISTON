package PatronBridge;
public class Carta extends Documento {
    public Carta(Formato formato) {
        super(formato);
    }

    public void generar() {
        formato.aplicarFormato("Carta");
    }
}


