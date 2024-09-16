public class Computador {
    // Atributos
    private String marca;
    private String processador;
    private int memoriaRAM; // em GB
    private int armazenamento; // em GB
    private String placaDeVideo;
    private String sistemaOperacional;
    private boolean ligado;
    private double preco;

    // Construtor 1 - Sem parâmetros
    public Computador() {
        this.marca = "Desconhecida";
        this.processador = "Indefinido";
        this.memoriaRAM = 4;
        this.armazenamento = 128;
        this.placaDeVideo = "Integrada";
        this.sistemaOperacional = "Sem sistema";
        this.ligado = false;
        this.preco = 0.0;
    }

    // Construtor 2 - Com 4 parâmetros
    public Computador(String marca, String processador, int memoriaRAM, int armazenamento) {
        this.marca = marca;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.placaDeVideo = "Integrada";
        this.sistemaOperacional = "Sem sistema";
        this.ligado = false;
        this.preco = 0.0;
    }

    // Construtor 3 - Com todos os parâmetros
    public Computador(String marca, String processador, int memoriaRAM, int armazenamento, String placaDeVideo, String sistemaOperacional, boolean ligado, double preco) {
        this.marca = marca;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.placaDeVideo = placaDeVideo;
        this.sistemaOperacional = sistemaOperacional;
        this.ligado = ligado;
        this.preco = preco;
    }

    // Métodos

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O computador foi ligado.");
        } else {
            System.out.println("O computador já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O computador foi desligado.");
        } else {
            System.out.println("O computador já está desligado.");
        }
    }

    public void instalarPrograma(String programa) {
        if (ligado) {
            System.out.println("O programa " + programa + " foi instalado.");
        } else {
            System.out.println("Ligue o computador primeiro para instalar programas.");
        }
    }

    public void exibirConfiguracao() {
        System.out.println("Marca: " + marca);
        System.out.println("Processador: " + processador);
        System.out.println("Memória RAM: " + memoriaRAM + "GB");
        System.out.println("Armazenamento: " + armazenamento + "GB");
        System.out.println("Placa de Vídeo: " + placaDeVideo);
        System.out.println("Sistema Operacional: " + sistemaOperacional);
        System.out.println("Preço: R$" + preco);
    }

    public void atualizarSistemaOperacional(String novoSistema) {
        sistemaOperacional = novoSistema;
        System.out.println("Sistema Operacional atualizado para: " + novoSistema);
    }

    public void aumentarMemoriaRAM(int novaMemoria) {
        memoriaRAM += novaMemoria;
        System.out.println("Memória RAM aumentada para: " + memoriaRAM + "GB");
    }

    public void trocarPlacaDeVideo(String novaPlaca) {
        placaDeVideo = novaPlaca;
        System.out.println("Placa de vídeo trocada para: " + novaPlaca);
    }
}
