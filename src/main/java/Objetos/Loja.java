package Objetos;

import Tipos.Tipo;

public class Loja {
    private String endereco;
    private int codigo;
    private String nome_fantasia;
    private String telefone;
    private Tipo tipo;
    private String cnpj;

    public Loja(String endereco, int codigo, String nome_fantasia, String telefone, Tipo tipo, String cnpj) {
        this.endereco = endereco;
        this.codigo = codigo;
        this.nome_fantasia = nome_fantasia;
        this.telefone = telefone;
        this.tipo = tipo;
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Loja [endereco=" + endereco + ", codigo=" + codigo + ", nome_fantasia=" + nome_fantasia + ", telefone="
                + telefone + ", tipo=" + tipo + ", cnpj=" + cnpj + "]";
    }

}
