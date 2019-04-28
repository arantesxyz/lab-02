package app.paymentmethods;

import app.objects.ContaPoupanca;

public class DebitarPoupanca extends Debito {

    private ContaPoupanca conta;

    public DebitarPoupanca(ContaPoupanca conta) {
        this.conta = conta;
    }

    @Override
    public void debitar(double valor) {
        double saldo = conta.getSaldo();
        if (valor <= saldo){
            conta.setSaldo(saldo - valor);
        }
    }
}
