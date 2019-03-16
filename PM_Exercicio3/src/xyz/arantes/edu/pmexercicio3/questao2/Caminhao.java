package xyz.arantes.edu.pmexercicio3.questao2;

public class Caminhao extends Carro {

    private int carga;

    public Caminhao(int velocidade, double preco, String cor, int carga){
        super(velocidade, preco, cor);
        this.carga = carga;
    }

    @Override
    public double getPrecoVenda() {
        if (carga > 2000){
            return super.getPrecoVenda() - ( super.getPrecoVenda()*(10.0f/100.0f) );
        }
        return super.getPrecoVenda() - ( super.getPrecoVenda()*(20.0f/100.0f) );
    }

    public int getCarga() {
        return carga;
    }


}
