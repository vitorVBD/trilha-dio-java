import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemsParaRemover = new ArrayList<>();
        for(Item i : itemList) {
            if(i.getNome().equalsIgnoreCase(nome)) {
                itemsParaRemover.add(i);
            }
        }
        itemList.removeAll(itemsParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for(Item i : itemList) {
            double valorItem = i.getPreco() * i.getQuantidade();
            valorTotal += valorItem;
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(this.itemList);
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras { Itens = " + itemList + " }";
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Teclado", 150.00, 1);
        carrinhoDeCompras.adicionarItem("mouse", 85.50, 1);
        carrinhoDeCompras.adicionarItem("monitor", 550.90, 1);

        carrinhoDeCompras.exibirItens();

        System.out.println(carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("monitor");

        System.out.println(carrinhoDeCompras.calcularValorTotal());
    }
}
