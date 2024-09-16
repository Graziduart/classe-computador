public class Main {
    public static void main(String[] args) {
        // Criando um computador usando o construtor sem parâmetros
        Computador computador1 = new Computador();

        // Criando um computador usando o construtor com 4 parâmetros
        Computador computador2 = new Computador("Dell", "Intel Core i7", 16, 512);

        // Criando um computador usando o construtor com todos os parâmetros
        Computador computador3 = new Computador("Apple", "M1", 16, 256, "Integrada", "macOS", false, 15000.00);

        // Exibindo as configurações dos computadores
        System.out.println("Configurações do Computador 1:");
        computador1.exibirConfiguracao();

        System.out.println("\nConfigurações do Computador 2:");
        computador2.exibirConfiguracao();

        System.out.println("\nConfigurações do Computador 3:");
        computador3.exibirConfiguracao();

        // Ligando o computador 3
        computador3.ligar();

        // Instalando um programa no computador 3
        computador3.instalarPrograma("Microsoft Office");

        // Atualizando o sistema operacional do computador 3
        computador3.atualizarSistemaOperacional("macOS Monterey");

        // Aumentando a memória RAM do computador 2
        computador2.aumentarMemoriaRAM(8);

        // Trocando a placa de vídeo do computador 1
        computador1.trocarPlacaDeVideo("NVIDIA GeForce GTX 1660");
    }
}