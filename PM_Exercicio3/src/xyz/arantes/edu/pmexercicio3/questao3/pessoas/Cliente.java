package xyz.arantes.edu.pmexercicio3.questao3.pessoas;

public class Cliente {

    private PessoaFisica pessoaF = null;
    private PessoaJuridica pessoaJ = null;
    private double limiteDeCredito;

    public Cliente(PessoaFisica pessoa, double limiteDeCredito){
        this.pessoaF = pessoa;
        this.limiteDeCredito = limiteDeCredito;
    }

    public Cliente(PessoaJuridica pessoa, double limiteDeCredito){
        this.pessoaJ = pessoa;
        this.limiteDeCredito = limiteDeCredito;
    }

    public boolean isJuridica(){
        return pessoaJ != null;
    }

    public PessoaFisica getPessoaFisica(){
        return pessoaF;
    }

    public PessoaJuridica getPessoaJuridica(){
        return pessoaJ;
    }

    public double getLimiteDeCredito(){
        return limiteDeCredito;
    }
}
