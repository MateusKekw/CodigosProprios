import java.util.ArrayList;
import java.util.List;

public class Clientes {

    private List<CarrinhoDeCompras> Pedido;

    public Clientes() {
        this.Pedido = new ArrayList<>();
    }

    public void adicionarPedido(CarrinhoDeCompras carrinho) {
        Pedido.add(carrinho);
    }

    public void removerPedido(CarrinhoDeCompras carrinho) {
        Pedido.remove(carrinho);
    }

    public void imprimirPedidos() {
        int i = 1;
        double total = 0;
        System.out.println("Pedidos Feitos:" + Pedido.size());
        for (CarrinhoDeCompras carrinho : Pedido) {
            System.out.println("Pedido " + i + ":");
            carrinho.imprimirItens();
            total = carrinho.calcularTotal();
            System.out.println("R$" + total);
            System.out.println();
            i++;
        }
    }
}