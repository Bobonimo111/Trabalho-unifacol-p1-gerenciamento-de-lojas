
import Objetos.Produto;
import Repositorios.Produtos;

public class tests {
    public static void main(String[] args) {

        Produtos repositorioProdutos = new Produtos();
        repositorioProdutos.post("Borracha", (float) 1.00, 1000);
        repositorioProdutos.post("Sabonete", (float) 5.00, 1200);
        repositorioProdutos.post("Escova de dentes", (float) 15.00, 15);
        // for (Produto p : repositorioProdutos.getAll()) {
        // System.out.println("=================================");
        // System.out.println(p.toString());
        // }
        // repositorioProdutos.delete(1);
        // System.out.println("PRODUTO 1 ZERADO");

        // Produto newProduto = repositorioProdutos.get(0);
        // newProduto.setNome("Lapezeira");
        // repositorioProdutos.put(newProduto);

        for (Produto p : repositorioProdutos.getAll()) {
            System.out.println("=================================");
            System.out.println(p.toString());
        }

        // System.out.println(repositorioProdutos.get(0).toString());

    }
}
