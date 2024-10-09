// Classe para Automóvel, que herda de Veiculo
class Automovel extends Veiculo {
    // Atributos específicos para Automóvel
    private int quantidadePassageiros;
    private String tipoFreio;
    private boolean airbag;

    // Construtor da classe Automovel
    public Automovel(String modelo, int anoFabricacao, String montadora, String cor, double kilometragem,
                     int quantidadePassageiros, String tipoFreio, boolean airbag) {
        super(modelo, anoFabricacao, montadora, cor, kilometragem);
        this.quantidadePassageiros = quantidadePassageiros;
        this.tipoFreio = tipoFreio;
        this.airbag = airbag;
    }

    // Método que gera a string de inserção SQL para um automóvel
    public String toInsert() {
        return String.format("INSERT INTO automoveis (modelo, ano_fabricacao, montadora, cor, kilometragem, quantidade_passageiros, tipo_freio, airbag) VALUES ('%s', %d, '%s', '%s', %.2f, %d, '%s', %b);",
                getModelo(), getAnoFabricacao(), getMontadora(), getCor(), getKilometragem(), 
                quantidadePassageiros, tipoFreio, airbag);
    }
}