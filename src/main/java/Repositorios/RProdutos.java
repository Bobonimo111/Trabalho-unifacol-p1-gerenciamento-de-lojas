package Repositorios;

import java.util.ArrayList;
import java.util.List;

import Interfaces.Icrud;
import Objetos.Produto;

public class RProdutos implements Icrud<Produto> {

    private List<Produto> repositorio;

    public RProdutos() {
        this.repositorio = new ArrayList<Produto>();
    }

    public Produto make(String nome, float valor, int quantidadeDisponivelEmEstoque) {
        int codigo = repositorio.size();
        return new Produto(codigo, nome, valor, quantidadeDisponivelEmEstoque);
    }

    @Override
    public void create(Produto produto) {
        repositorio.add(produto);
    }

    @Override
    public Produto[] getAll() {
        return repositorio.toArray(new Produto[0]);
    }

    @Override
    public Produto get(int codigo) {
        for (Produto p : repositorio) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        // Quando o negocio da errado, retorna isso pra função funcionar
        return new Produto(codigo, null, 0, 0);
    }

    @Override
    public boolean put(Produto produto) {
        for (Produto p : repositorio) {
            if (p.getCodigo() == produto.getCodigo()) {
                int localParaEditar = repositorio.indexOf(p);
                repositorio.set(localParaEditar, produto);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(int codigo) {
        for (Produto p : repositorio) {
            if (p.getCodigo() == codigo) {
                repositorio.remove(p);
                return true;
            }
        }
        return false;
    }

}
