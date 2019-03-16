package xyz.arantes.edu.pmexercicio3.questao2;

class Carro {

    private int velocidade;
    private double preco;
    private String cor;

    Carro(int velocidade, double preco, String cor){
        this.velocidade = velocidade;
        this.preco = preco;
        this.cor = cor;
    }

    double getPrecoVenda(){
        return preco;
    }

    int getVelocidade(){
        return velocidade;
    }

    String getCor(){
        return cor;
    }
}
