// Classe para Caminhão, que herda de Veiculo
class Caminhao extends Veiculo {
    // Atributos específicos para Caminhão
    private int quantidadeEixos;
    private double pesoBruto;

    // Construtor da classe Caminhao
    public Caminhao(String modelo, int anoFabricacao, String montadora, String cor, double kilometragem,
                    int quantidadeEixos, double pesoBruto) {
        super(modelo, anoFabricacao, montadora, cor, kilometragem);
        this.quantidadeEixos = quantidadeEixos;
        this.pesoBruto = pesoBruto;
    }

    // Método que gera a string de inserção SQL para um caminhão
    public String toInsert() {
        return String.format("INSERT INTO caminhoes (modelo, ano_fabricacao, montadora, cor, kilometragem, quantidade_eixos, peso_bruto) VALUES ('%s', %d, '%s', '%s', %.2f, %d, %.2f);",
                getModelo(), getAnoFabricacao(), getMontadora(), getCor(), getKilometragem(), 
                quantidadeEixos, pesoBruto);
    }
}
