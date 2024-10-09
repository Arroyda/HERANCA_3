// Classe para Motocicleta, que herda de Veiculo
class Motocicleta extends Veiculo {
    // Atributos específicos para Motocicleta
    private int cilindrada;
    private double torque;

    // Construtor da classe Motocicleta
    public Motocicleta(String modelo, int anoFabricacao, String montadora, String cor, double kilometragem,
                       int cilindrada, double torque) {
        super(modelo, anoFabricacao, montadora, cor, kilometragem);
        this.cilindrada = cilindrada;
        this.torque = torque;
    }

    // Método que gera a string de inserção SQL para uma motocicleta
    public String toInsert() {
        return String.format("INSERT INTO motocicletas (modelo, ano_fabricacao, montadora, cor, kilometragem, cilindrada, torque) VALUES ('%s', %d, '%s', '%s', %.2f, %d, %.2f);",
                getModelo(), getAnoFabricacao(), getMontadora(), getCor(), getKilometragem(), 
                cilindrada, torque);
    }
}
