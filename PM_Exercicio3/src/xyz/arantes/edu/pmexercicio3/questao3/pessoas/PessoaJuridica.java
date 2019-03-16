package xyz.arantes.edu.pmexercicio3.questao3.pessoas;

import xyz.arantes.edu.pmexercicio3.questao3.Endereco;

public class PessoaJuridica extends Pessoa {

    private String nomeFantasia, cnpj;

    public PessoaJuridica(){
        super(null, null);
        this.nomeFantasia = null;
        this.cnpj = null;
    }

    public PessoaJuridica(String nome, String nomeFantasia, String cnpj, Endereco endereco){
        super(nome, endereco);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
}
