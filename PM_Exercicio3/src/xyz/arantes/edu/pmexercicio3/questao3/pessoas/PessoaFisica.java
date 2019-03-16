package xyz.arantes.edu.pmexercicio3.questao3.pessoas;

import xyz.arantes.edu.pmexercicio3.questao3.Endereco;

public class PessoaFisica extends Pessoa {

    private String cpf;
    private byte idade;
    private char sexo;

    public PessoaFisica(){
        super(null, null);
        this.cpf = null;
        this.idade = 0;
        this.sexo = '0';
    }

    public PessoaFisica(String nome, String cpf, byte idade, char sexo, Endereco endereco){
        super(nome, endereco);
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public byte getIdade() {
        return idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
