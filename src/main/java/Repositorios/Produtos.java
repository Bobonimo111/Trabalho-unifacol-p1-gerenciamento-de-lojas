package Repositorios;

import java.util.ArrayList;

import Interfaces.Icrud;
import Objetos.Produto;

public class Produtos implements Icrud<Produto> {

    private ArrayList<Produto> Armazenamento = new ArrayList<>();

    // O codigo definido é o valor na posição da array list
    @Override
    public void post(Produto produto) {
        produto.setCode(Armazenamento.size());
        this.Armazenamento.addLast(produto);
    }

    @Override
    public Produto get(int id) {
        return Armazenamento.get(id);
    }

    @Override
    public void put(Produto produto) {
        Armazenamento.set(produto.getCode(), produto);
    }

    @Override
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

}
