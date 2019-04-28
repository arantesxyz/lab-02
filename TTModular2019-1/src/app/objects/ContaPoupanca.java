package app.objects;

import app.utils.Math;

public class ContaPoupanca {

    private String dono;
    private double saldo;

    public ContaPoupanca(String dono, double saldo) {
        this.dono = dono;
        this.saldo = saldo;
    }

    public void render(short porcentagem){
        saldo += Math.getPorcentagem(saldo, porcentagem);
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
