package xyz.arantes.edu.aula1;

import xyz.arantes.edu.aula1.questao1.Questao1;
import xyz.arantes.edu.aula1.questao2.Questao2;
import xyz.arantes.edu.aula1.questao3.Questao3;

public class Main {

    public static void main(String[] args){
        new Questao1().menu();
        new Questao2().getTabuadas(10);
        new Questao3().menu();
    }
}
