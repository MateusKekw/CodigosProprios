public class Main {
    public static void main(String[] args) {
        Clientes clinte1 = new Clientes();
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();

        Produto p1 = new Produto("Camiseta", 29.99);
        Produto p2 = new Produto("Calça jeans", 79.99);
        Produto p3 = new Produto("Tênis", 99.99);

        Produto pp1 = new Produto("Lanterna", 40.99);
        Produto pp2 = new Produto("Escova de Dentes", 20.50);
        Produto pp3 = new Produto("Pasta Dental", 12.23);

        carrinho.adicionarItem(p1);
        carrinho.adicionarItem(p2);
        carrinho.adicionarItem(p3);

        carrinho.imprimirItens();

        double total = carrinho.calcularTotal();
        System.out.println("Total: R$" + total);

        carrinho.removerItem(p2);

        carrinho.imprimirItens();

        total = carrinho.calcularTotal();
        System.out.println("Total: R$" + total);

        System.out.println("");

        carrinho1.adicionarItem(pp1);
        carrinho1.adicionarItem(pp2);
        carrinho1.adicionarItem(pp3);

        carrinho.imprimirItens();

        total = carrinho.calcularTotal();
        System.out.println("Total: R$" + total);

        System.out.println("");

        clinte1.adicionarPedido(carrinho);
        clinte1.adicionarPedido(carrinho1);
        clinte1.imprimirPedidos();

        clinte1.removerPedido(carrinho);
        clinte1.imprimirPedidos();
    }
}
