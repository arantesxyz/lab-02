package xyz.arantes.edu.lista1.questao18;

import java.util.Scanner;

import static xyz.arantes.edu.lista1.utils.Checker.isInt;

public class Questao18 {

    public void run(){
        Scanner s = new Scanner(System.in);
        String n;

        do{
            System.out.println("Digite um número inteiro: ");
            System.out.println("Ou digite 'q' para sair. ");

            n = s.next();
            if (n.equalsIgnoreCase("q")){
                return;
            }
            if (!isInt(n)){
                System.out.println("O valor digitado não corresponde a um número inteiro.");
                continue;
            }
            System.out.println(" ");
            System.out.println("A sequencia de " + n + " digitos é: ");
            printFibonacci(Integer.parseInt(n));
            System.out.println(" ");
        }while (!n.equalsIgnoreCase("q"));

    }

    private void printFibonacci(int n){
        for (int j=1, k=1, i=0; i<n; k+=j, j=k-j, i++) {
            System.out.print(j + " ");
        }
    }
}
