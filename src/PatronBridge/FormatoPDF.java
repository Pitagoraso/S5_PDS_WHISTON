package PatronBridge;
public class FormatoPDF implements Formato {
    @Override
    public void aplicarFormato(String tipoDocumento) {
        System.out.println("Generando " + tipoDocumento + " en formato PDF.");
    }
}

