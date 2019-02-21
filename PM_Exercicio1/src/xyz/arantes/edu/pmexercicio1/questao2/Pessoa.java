package xyz.arantes.edu.pmexercicio1.questao2;

public class Pessoa {
    private String nome, cpf;
    private byte idade;
    private char sexo;

    public Pessoa(){
        this.nome = null;
        this.idade = 0;
        this.cpf = null;
        this.sexo = 'n';
    }

    public Pessoa(String nome, String cpf, byte idade, char sexo){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public byte getIdade() {
        return idade;
    }

    public String getSexo() {
        if (sexo == 'm' || sexo == 'M'){
            return "Masculino";
        }else if (sexo == 'f' || sexo == 'F'){
            return "Feminino";
        }
        return null;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean eMaior(){
        return idade >= 18;
    }
}
