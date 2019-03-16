package xyz.arantes.edu.pmexercicio3.questao2;

public class AgenciaDeVeiculos {

    public static void main(String[] args){
        System.out.println(new Carro(1, 10, "Verde").getPrecoVenda());
        System.out.println(new Caminhao(2, 20, "Vermelho", 1420).getPrecoVenda());
        System.out.println(new Fiat(2, 15, "Amarelo", 5).getPrecoVenda());
        System.out.println(new Sedan(4, 50, "Azul", 7).getPrecoVenda());
    }
}
