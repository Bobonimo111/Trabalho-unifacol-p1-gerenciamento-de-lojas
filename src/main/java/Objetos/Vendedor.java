package Objetos;

import Tipos.Turno;

public class Vendedor extends Pessoa {
    private int ctps;
    private double salario;
    private Turno turno;

    Vendedor(String nome, String data, String endereco, String telefone, String cpf, int ctps, double salario,
            Turno turno) {
        super(nome, data, endereco, telefone, cpf);
        this.ctps = ctps;
        this.salario = salario;
        this.turno = turno;
    }

    public int getCtps() {
        return ctps;
    }

    public void setCtps(int ctps) {
        this.ctps = ctps;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
