public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String tipo, int numPortas) {
        super(tipo);
        this.numPortas = numPortas;
    }

    public void exibirDetalhes() {
        super.exibirTipo(); 
        System.out.println( "Número de portas: " + numPortas);
    }
}