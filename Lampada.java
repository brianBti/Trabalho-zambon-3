public class Lampada {
    private String marca;
    private int voltagem;
    private String tipo;
    private String modelo;
    private String cor;
    private double preco;
    private int garantia;
    private boolean ligada;

    public Lampada(String marca, int voltagem, String tipo, String modelo, String cor, double preco, int garantia) {
        this.marca = marca;
        this.voltagem = voltagem;
        this.tipo = tipo;
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
        this.garantia = garantia;
        this.ligada = false;
    }

    public void ligar() {
        this.ligada = true;
        System.out.println("# Lâmpada Ligada #");
    }

    public void desligar() {
        this.ligada = false;
        System.out.println("# Lâmpada Deligada #");
    }

    public void mostrarStatus() {
        System.out.println("STATUS: " + (ligada ? "Ligada" : "Deligada"));
    }

    public void mudarStatus() {
        if (ligada) {
            desligar();
        } else {
            ligar();
        }
    }

    // Getters e Setters omitidos para compactar o exemplo

    public static void main(String[] args) {
        Lampada lampada = new Lampada("Phillips", 110, "Led", "P5589L18", "Amarela", 25.00, 24);

        System.out.println(">>> INÍCIO DO SOFTWARE DA LÂMPADA <<<");
        System.out.println("COR: " + lampada.cor);
        System.out.println("MARCA: " + lampada.marca);
        System.out.println("MODELO: " + lampada.modelo);
        System.out.println("WATTS: " + lampada.voltagem);
        System.out.println("TIPO: " + lampada.tipo);
        System.out.println("GARANTIA: " + lampada.garantia + " meses");
        System.out.println("PREÇO – R$: " + lampada.preco);

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int opcao;
        
        do {
            lampada.mostrarStatus();
            System.out.print("Ligar/Desligar lâmpada? 0 – Sair / 1 – Sim: ");
            opcao = scanner.nextInt();
            
            if (opcao == 1) {
                lampada.mudarStatus();
            }
        } while (opcao != 0);
        
        System.out.println("* Você encerrou o software. *");
        scanner.close();
    }
}