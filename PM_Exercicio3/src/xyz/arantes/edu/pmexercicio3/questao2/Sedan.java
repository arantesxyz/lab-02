package xyz.arantes.edu.pmexercicio3.questao2;

public class Sedan extends Carro{

    private int comprimento;

    public Sedan(int velocidade, double preco, String cor, int comprimento) {
        super(velocidade, preco, cor);
        this.comprimento = comprimento;
    }

    @Override
    public double getPrecoVenda(){
        if (comprimento > 6){
            return super.getPrecoVenda() - ( super.getPrecoVenda()*(5.0f/100.0f) );
        }
        return super.getPrecoVenda() - ( super.getPrecoVenda()*(10.0f/100.0f) );
    }
}
