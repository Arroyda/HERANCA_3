// Classe para Skate
class Skate {
    // Atributos específicos para Skate
    private String modelo;
    private String marca;
    private String cor;
    private String tipoRodas;

    // Construtor da classe Skate
    public Skate(String modelo, String marca, String cor, String tipoRodas) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.tipoRodas = tipoRodas;
    }

    // Método que gera a string de inserção SQL para um skate
    public String toInsert() {
        return String.format("INSERT INTO skates (modelo, marca, cor, tipo_rodas) VALUES ('%s', '%s', '%s', '%s');",
                modelo, marca, cor, tipoRodas);
    }
}