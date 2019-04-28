package app.paymentmethods;

import app.objects.ContaCorrente;

public class DebitarContaCorrente extends Debito {

    private ContaCorrente conta;

    public DebitarContaCorrente(ContaCorrente conta) {
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
