package xyz.arantes.edu.lista1.questao17;

import java.math.BigInteger;
import java.util.Scanner;

import static xyz.arantes.edu.lista1.utils.Checker.isInt;

/*
 * Problemas encontrados:
 * - Numeros grandes fazem o programa ficar lokão.
 *
 * TODO
 * Corrigir o mesmo
 */
public class Questao17 {

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
            System.out.println("O fatorial de " + n + " é: " + getFatorial(Integer.parseInt(n)));
            System.out.println(" ");
        }while (!n.equalsIgnoreCase("q"));
    }

    private int getFatorial(int n){
        for (int i = n-1; i > 0; i--){
            n = n*i;
        }
        return n;
    }

}
