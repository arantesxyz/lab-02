package xyz.arantes.edu.lista1.questao11;

import java.util.Scanner;

import static xyz.arantes.edu.lista1.utils.Checker.isInt;

public class Questao11 {

    public void run() {
        Scanner s = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Digite um número inteiro: ");
            System.out.println("Ou digite 'q' para sair. ");

            answer = s.next();
            if (answer.equalsIgnoreCase("q")) {
                return;
            }
            if (!isInt(answer)) {
                System.out.println("O valor digitado não corresponde a um número inteiro.");
                continue;
            }
            System.out.println(" ");
            getTabuada(Integer.parseInt(answer));
            System.out.println(" ");
        } while (!answer.equalsIgnoreCase("q"));

    }
    private void getTabuada(int number){
        for (int i = 0; i <= 10; i++){
            int result = number * i;
            System.out.println(i + " x " + number + " = " + result);
        }
    }
}
