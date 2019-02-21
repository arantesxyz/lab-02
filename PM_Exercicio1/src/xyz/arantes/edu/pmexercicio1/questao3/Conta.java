package xyz.arantes.edu.pmexercicio1.questao3;

import xyz.arantes.edu.pmexercicio1.questao2.Pessoa;

import java.util.Random;

public class Conta {

    private int id;
    private Pessoa owner;
    private double saldo;

    public Conta(Pessoa owner, double saldo){
        Random r = new Random();
        id = r.nextInt() + r.nextInt();
        this.owner = owner;
        this.saldo = saldo;
    }

    public boolean deposit(double v){
        if (v < 0){
            return false;
        }
        saldo += v;
        return true;
    }

    public boolean withdraw(double v){
        if (v > saldo){
            return false;
        }
        saldo -= v;
        return true;
    }

    public double getSaldo(){
        return saldo;
    }

    public Pessoa getOwner(){
        return owner;
    }

    public int getId(){
        return id;
    }
}
