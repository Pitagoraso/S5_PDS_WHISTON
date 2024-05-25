package PatronBridge;
public class ClienteDocumento {
    public static void main(String[] args) {
        Formato formatoPDF = new FormatoPDF();
        Formato formatoWord = new FormatoWord();

        Documento informePDF = new Informe(formatoPDF);
        informePDF.generar();

        Documento cartaWord = new Carta(formatoWord);
        cartaWord.generar();
    }
}
