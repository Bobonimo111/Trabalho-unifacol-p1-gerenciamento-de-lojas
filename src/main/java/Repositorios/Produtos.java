package Repositorios;

import java.util.ArrayList;

import Objetos.Produto;

public class Produtos {

    private ArrayList<Produto> Armazenamento = new ArrayList<>();

    // O codigo definido é o valor na posição da array list
    public void post(String nome, float valor, int quantidadeDisponivelEmEstoque) {
        Produto produto = new Produto(Armazenamento.size(), nome, valor, quantidadeDisponivelEmEstoque);
        this.Armazenamento.addLast(produto);
    }

    public Produto get(int id) {
        return Armazenamento.get(id);
    }

    public Produto[] getAll() {
        Produto[] p = this.Armazenamento.toArray(new Produto[0]);
        return p;
    }

    // Pra evitar problemas de compatibilidade eu zero o estoque dos itens
    public void delete(int id) {
        Produto item = this.Armazenamento.get(id);
        this.Armazenamento.get(id).removerEstoque(item.getQuantidadeDisponivelEmEstoque());
    }

    // public void delete(Produto produto) {
    // this.Armazenamento.remove(produto);
    // }

    public void put(Produto produto) {
        Armazenamento.set(produto.getCode(), produto);
    }

}
