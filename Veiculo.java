// Classe base para Veículo
class Veiculo {
    // Atributos comuns a todos os veículos
    private String modelo;
    private int anoFabricacao;
    private String montadora;
    private String cor;
    private double kilometragem;

    // Construtor da classe Veiculo
    public Veiculo(String modelo, int anoFabricacao, String montadora, String cor, double kilometragem) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.montadora = montadora;
        this.cor = cor;
        this.kilometragem = kilometragem;
    }

    // Getters para acessar os atributos
    public String getModelo() { return modelo; }
    public int getAnoFabricacao() { return anoFabricacao; }
    public String getMontadora() { return montadora; }
    public String getCor() { return cor; }
    public double getKilometragem() { return kilometragem; }

    // Método que gera a string de inserção SQL para um veículo
    public String toInsert() {
        return String.format("INSERT INTO veiculos (modelo, ano_fabricacao, montadora, cor, kilometragem) VALUES ('%s', %d, '%s', '%s', %.2f);",
                modelo, anoFabricacao, montadora, cor, kilometragem);
    }
}