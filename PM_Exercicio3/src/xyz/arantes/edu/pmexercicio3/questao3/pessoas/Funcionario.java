package xyz.arantes.edu.pmexercicio3.questao3.pessoas;

public class Funcionario {

    private PessoaFisica pessoa;
    private double salario;
    private String cargo;

    public Funcionario(PessoaFisica pessoa, String cargo, double salario){
        this.pessoa = pessoa;
        this.cargo = cargo;
        this.salario = salario;
    }

    public PessoaFisica getPessoa() {
        return pessoa;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
