package xyz.arantes.edu.pmexercicio3.questao2;

public class Fiat extends Carro {

    private int descontoDeFabrica;

    public Fiat(int velocidade, double preco, String cor, int descontoDeFabrica){
        super(velocidade, preco, cor);
        this.descontoDeFabrica = descontoDeFabrica;
    }

    @Override
    double getPrecoVenda() {
        return super.getPrecoVenda() - descontoDeFabrica;
    }
}
