package CompositeAtt;

public class Main {
    public static void main(String[] args) {
        Produto mouse = new Item("Mouse", 10.0);
        Produto teclado = new Item("Teclado", 20.0);
        Produto monitor = new Item("Monitor", 150.0);
        Produto impressora = new Item("Impressora", 100.0);
        Produto cpu = new Item("CPU", 300.0);
        Produto fonte = new Item("Fonte", 50.0);
        Produto processador = new Item("Processador", 150.0);
        Produto memoriaRAM = new Item("Memória RAM", 80.0);
        Produto hd = new Item("HD", 70.0);
        Produto ssd = new Item("SSD", 100.0);

        Loja loja = new Loja("Loja de Produtos de Informática");
        loja.adicionarProduto(mouse);
        loja.adicionarProduto(teclado);
        loja.adicionarProduto(monitor);
        loja.adicionarProduto(ssd);
        loja.adicionarProduto(memoriaRAM);

        loja.exibirInformacoes();
        
        double precoTotal = loja.getPreco();
        System.out.println("Preço total do pedido: $" + precoTotal);
    }
}

