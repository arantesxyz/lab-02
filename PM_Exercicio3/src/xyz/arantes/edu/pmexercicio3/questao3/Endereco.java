package xyz.arantes.edu.pmexercicio3.questao3;

public class Endereco {

    private String rua, cidade, estado, cep, telefone;
    private int numero;

    public Endereco(String rua, int numero, String cidade, String estado, String cep, String telefone){
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getNumero() {
        return numero;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getRua() {
        return rua;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
