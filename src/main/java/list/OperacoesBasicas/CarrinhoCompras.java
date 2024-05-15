package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> itensCarrinhoCompra;

    public CarrinhoCompras() {
        this.itensCarrinhoCompra = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itensCarrinhoCompra.add(new Item(nome, preco, quantidade));
    }

    public void removerItens(String nome) {
            List<Item> itensParaRemover = new ArrayList<>();
            for (Item item : itensCarrinhoCompra) {
                if(item.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(item);
                }
            }
            itensCarrinhoCompra.removeAll(itensParaRemover);
    }
    public void calcularValorTotal() {
        double total = 0;
        for (Item item : itensCarrinhoCompra) {
            total += item.getPreco();
        }
        System.out.println("Total do carrinho: " + total);
    }

    public void exibirItens(){
        for (Item item : itensCarrinhoCompra) {
            System.out.println(item.toString());
        }
    }

}