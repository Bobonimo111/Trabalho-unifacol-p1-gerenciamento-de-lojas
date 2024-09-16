package Repositorios;

import java.util.ArrayList;
import java.util.List;

import Interfaces.Icrud;
import Objetos.Loja;
import Tipos.Tipo;

public class RLojas implements Icrud<Loja> {

    private List<Loja> repositorio;

    public RLojas() {
        this.repositorio = new ArrayList<Loja>();
    }

    public Loja make(String endereco, String nome_fantasia, String telefone, Tipo tipo, String cpnj) {
        int codigo = repositorio.size();
        return new Loja(endereco, codigo, nome_fantasia, telefone, tipo, cpnj);
    }

    @Override
    public void create(Loja loja) {
        repositorio.add(loja);
    }

    @Override
    public Loja[] getAll() {
        return repositorio.toArray(new Loja[0]);
    }

    @Override
    public Loja get(int codigo) {
        for (Loja l : repositorio) {
            if (l.getCodigo() == codigo) {
                return l;
            }
        }
        // Quando o negocio da errado, retorna isso pra função funcionar
        return new Loja(null, codigo, null, null, null, null);
    }

    @Override
    public boolean put(Loja loja) {
        for (Loja l : repositorio) {
            if (l.getCodigo() == loja.getCodigo()) {
                int localParaEditar = repositorio.indexOf(l);
                repositorio.set(localParaEditar, loja);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(int codigo) {
        for (Loja l : repositorio) {
            if (l.getCodigo() == codigo) {
                repositorio.remove(l);
                return true;
            }
        }
        return false;
    }

}
