package xyz.arantes.edu.pmexercicio3.questao3.pessoas;

public class Cliente {

    private Pessoa pessoa;
    private double limiteDeCredito;

    public Cliente(Pessoa pessoa, double limiteDeCredito){
        this.pessoa = pessoa;
        this.limiteDeCredito = limiteDeCredito;
    }

    public Pessoa getPessoa(){
        return pessoa;
    }

    public double getLimiteDeCredito(){
        return limiteDeCredito;
    }
}
