package app.objects;

public class ContaCorrente{
    private String dono;
    private double saldo;

    public ContaCorrente(String dono, double saldo) {
        this.dono = dono;
        this.saldo = saldo;
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
