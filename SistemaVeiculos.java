// Classe principal para teste
public class SistemaVeiculos {
    public static void main(String[] args) {
        // Criação de objetos para testar as classes
        Automovel carro = new Automovel("Fusca", 1980, "Volkswagen", "Azul", 50000, 5, "Hidráulico", true);
        Motocicleta moto = new Motocicleta("CB 500", 2020, "Honda", "Preto", 15000, 500, 47.5);
        Caminhao caminhao = new Caminhao("Mercedes Benz", 2018, "Mercedes", "Branco", 200000, 4, 12000);
        Bicicleta bicicleta = new Bicicleta("Caloi", "Caloi", "Vermelha", "Aço", 18, true);
        Skate skate = new Skate("Element", "Element", "Verde", "PU");

        // Impressão dos comandos SQL de inserção
        System.out.println(carro.toInsert());
        System.out.println(moto.toInsert());
        System.out.println(caminhao.toInsert());
        System.out.println(bicicleta.toInsert());
        System.out.println(skate.toInsert());
    }
}