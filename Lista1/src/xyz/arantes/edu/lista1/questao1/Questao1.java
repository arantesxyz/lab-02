package xyz.arantes.edu.lista1.questao1;

import java.util.Scanner;

public class Questao1 {

    public void run(int qnt){
        String sBase;
        for (int i = 1; i < qnt; i++) {
            Scanner rd = new Scanner(System.in);
            System.out.println("Digite o valor da base: ");
            sBase = rd.next();

            if (Double.parseDouble(sBase) < 0){
                break;
            }

            System.out.println("Digite o valor da altura: ");
            String sAltura = rd.next();

            Retangulo ret = new Retangulo(Double.parseDouble(sBase), Double.parseDouble(sAltura));

            System.out.println("O retângulo tem uma área de " + ret.getArea() + ".");
            System.out.println("O retângulo tem um perimetro de " + ret.getPerimetro() + ".");

        }
    }
}
