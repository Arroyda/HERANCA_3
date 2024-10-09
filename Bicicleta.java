// Classe para Bicicleta
class Bicicleta {
    // Atributos específicos para Bicicleta
    private String modelo;
    private String marca;
    private String cor;
    private String material;
    private int quantidadeMarchas;
    private boolean amortecedor;

    // Construtor da classe Bicicleta
    public Bicicleta(String modelo, String marca, String cor, String material, int quantidadeMarchas, boolean amortecedor) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.material = material;
        this.quantidadeMarchas = quantidadeMarchas;
        this.amortecedor = amortecedor;
    }

    // Método que gera a string de inserção SQL para uma bicicleta
    public String toInsert() {
        return String.format("INSERT INTO bicicletas (modelo, marca, cor, material, quantidade_marchas, amortecedor) VALUES ('%s', '%s', '%s', '%s', %d, %b);",
                modelo, marca, cor, material, quantidadeMarchas, amortecedor);
    }
}
