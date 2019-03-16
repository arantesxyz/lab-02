package xyz.arantes.edu.pmexercicio3.questao3;

import xyz.arantes.edu.pmexercicio3.questao3.pessoas.Cliente;
import xyz.arantes.edu.pmexercicio3.questao3.pessoas.Funcionario;
import xyz.arantes.edu.pmexercicio3.questao3.pessoas.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;

public class Empresa extends PessoaJuridica {
    private List<Cliente> clientes;
    private List<Funcionario> funcionarios;
    private Funcionario presidente;

    public Empresa(String nome, String nomeFantasia, String cnpj, String telefone, Endereco endereco){
        super(nome, nomeFantasia, cnpj, endereco);
        this.clientes = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.presidente = null;
    }

    public Funcionario getPresidente() {
        return presidente;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void setPresidente(Funcionario presidente) {
        this.presidente = presidente;
    }
}
