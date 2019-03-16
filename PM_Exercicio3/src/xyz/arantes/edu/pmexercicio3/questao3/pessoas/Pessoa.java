package xyz.arantes.edu.pmexercicio3.questao3.pessoas;

import xyz.arantes.edu.pmexercicio3.questao3.Endereco;

public class Pessoa {
    private String nome;
    private Endereco endereco;

    public Pessoa(){
        this.nome = null;
        this.endereco = null;
    }

    public Pessoa(String nome, Endereco endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
