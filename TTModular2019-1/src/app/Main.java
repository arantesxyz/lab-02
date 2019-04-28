package app;

import app.objects.ContaCorrente;
import app.objects.ContaPoupanca;
import app.paymentmethods.DebitarContaCorrente;
import app.paymentmethods.DebitarPoupanca;

public class Main {

    public static void main(String[] args){
        System.out.println("Executando teste de conta corrente");
        testeCC();
        System.out.println("===========================");
        System.out.println("Executando teste de conta poupança");
        testeCP();
    }

    private static void testeCP() {
        ContaPoupanca cp = new ContaPoupanca("Gustavo", 6203);

        System.out.println("O saldo atual da conta poupança é: R$" + cp.getSaldo());

        System.out.println("Fazendo o saldo render 5%");
        cp.render((short) 5);
        System.out.println("O saldo atual da conta poupança é: R$" + cp.getSaldo());

        System.out.println("Debitando R$100 da conta...");
        DebitarPoupanca debitarCP = new DebitarPoupanca(cp);
        debitarCP.debitar(100);
        System.out.println("R$100 debitados!");

        System.out.println("O saldo atual da conta poupança é: R$" + cp.getSaldo());
    }

    private static void testeCC() {
        ContaCorrente cc = new ContaCorrente("Gustavo", 120392);

        System.out.println("O saldo atual da conta corrente é: R$" + cc.getSaldo());

        System.out.println("Debitando R$100 da conta...");
        DebitarContaCorrente debitarCC = new DebitarContaCorrente(cc);
        debitarCC.debitar(100);
        System.out.println("R$100 debitados!");

        System.out.println("O saldo atual da conta corrente é: R$" + cc.getSaldo());
    }

}
