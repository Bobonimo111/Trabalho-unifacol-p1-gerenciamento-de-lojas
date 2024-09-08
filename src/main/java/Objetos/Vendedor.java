package Objetos;

import Tipos.Turno;

public class Vendedor extends Pessoa{
    private int ctps;
    private double salario;
    private Turno turno;
    Vendedor(String nome, String data, String endereco, String telefone,String cpf,int ctps, double salario,Turno turno){
        super(nome,data,endereco,telefone,cpf);
        this.ctps = ctps;
        this.salario = salario;
        this.turno = turno;

    }
}
