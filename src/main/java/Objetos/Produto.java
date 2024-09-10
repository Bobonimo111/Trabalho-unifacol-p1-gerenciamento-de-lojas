package Objetos;

public class Produto {
    private int code;
    private String nome;
    private float valor;
    private int QuantidadeDisponivelEmEstoque;

    public Produto(int code, String nome, float valor, int quantidadeDisponivelEmEstoque) {
        this.code = code;
        this.nome = nome;
        this.valor = valor;
        this.QuantidadeDisponivelEmEstoque = quantidadeDisponivelEmEstoque;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantidadeDisponivelEmEstoque() {
        return QuantidadeDisponivelEmEstoque;
    }

    public void adicionarEstoque(int valor) {
        this.QuantidadeDisponivelEmEstoque += valor;
    }

    public void removerEstoque(int valor) {
        this.QuantidadeDisponivelEmEstoque -= valor;
    }

    @Override
    public String toString() {
        return "Nome : " + this.nome +
                "\nValor : " + this.valor +
                "\nDisponivel em estoque : " + this.QuantidadeDisponivelEmEstoque +
                "\nCode : " + this.code + "";
    }
}
