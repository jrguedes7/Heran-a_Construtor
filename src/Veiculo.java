public class Veiculo {
    private String tipo;

    public Veiculo(String tipo) {
        this.tipo = tipo;
    }

    public void exibirTipo() {
        System.out.println( "Tipo de veículo: " + tipo);
    }
}