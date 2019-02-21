package xyz.arantes.edu.pmexercicio1.questao3;

import xyz.arantes.edu.pmexercicio1.questao2.Pessoa;

public class Questao3 {

    public void run(){
        Pessoa pessoa = new Pessoa("Gustavo", "26382649123", (byte)23, 'm');
        Conta conta = criarConta(pessoa);

        System.out.println("A pessoa: " + pessoa.getNome() + " tem R$" + conta.getSaldo() + " na conta.");

        conta.deposit(52);
        System.out.println("A pessoa: " + pessoa.getNome() + " tem R$" + conta.getSaldo() + " na conta.");
    }

    private Conta criarConta(Pessoa pessoa){
        return new Conta(pessoa, 0);
    }
}
