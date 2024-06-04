
public class Bicicleta extends Veiculo {
    private int numMarchas;

    public Bicicleta(String tipo, int numMarchas) {
        super(tipo);
        this.numMarchas = numMarchas;
    }

    public void exibirDetalhes() {
        super.exibirTipo(); 
        System.out.println( "Número de marchas: " + numMarchas);
    }
}