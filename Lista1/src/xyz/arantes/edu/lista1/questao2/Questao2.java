package xyz.arantes.edu.lista1.questao2;

import java.util.Scanner;

public class Questao2 {

    private double sumArea;
    public void run(){
        String sBase;
        do {
            Scanner rd = new Scanner(System.in);
            System.out.println("Digite o valor da base: ");
            sBase = rd.next();

            if (Double.parseDouble(sBase) < 0){
                break;
            }

            System.out.println("Digite o valor da altura: ");
            String sAltura = rd.next();

            Retangulo ret = new Retangulo(Double.parseDouble(sBase), Double.parseDouble(sAltura));

            sumArea += ret.getArea();

            System.out.println("O retângulo tem uma área de " + ret.getArea() + ".");
            System.out.println("O retângulo tem um perimetro de " + ret.getPerimetro() + ".");

        }while (Double.parseDouble(sBase) >= 0);
        System.out.println("O somatório das áreas é: " + sumArea);
    }
}
