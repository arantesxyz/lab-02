package xyz.arantes.edu.aula1.questao1;

public class Person {

    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private String sexo;

    Person(String nome, int idade, double altura, double peso, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public double getImc(){
        return peso / (altura * altura);
    }
}
