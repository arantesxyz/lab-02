package xyz.arantes.edu.conversaodebase;

import java.util.*;

public class Binario {

    private static Scanner in = new Scanner (System.in);

    // TODO recriar uma clase main
    // Este metodo foi apenas colocado nesta classe para resumir o programa em um unico arquivo.
    public static void main(String[] args){
        new Binario().run();
    }

    public void run() {
        int op   = 0;
        int aux = 0;
        String rec  = "";
        do {
            System.out.println("");
            System.out.println("Conversor de bases (Binário): ");
            System.out.println("");
            System.out.println("0 - Sair.");
            System.out.println("1 - Metodo iterativo.");
            System.out.println("2 - Metodo recursivo.");
            System.out.println("");
            op = in.nextInt();

            switch (op){
                case 0:
                    break;
                case 1:
                    aux = getEntrada("Entre o decimal desejado:");
                    getBinario(aux);
                    break;
                case 2:
                    aux = getEntrada("Entre o decimal desejado:");
                    rec = binRec(aux);
                    rec = inverter(rec);
                    System.out.println("\nDecimal: " +aux+ " - Binario: " +rec+"\n");
                    break;
                default:
                    System.out.println ("Opção inválida");
                    break;
            }
        } while (op != 0);
    }

    private int getEntrada(String msg){
        System.out.println("\n " + msg + " \n");
        return in.nextInt();
    }

    private void getBinario(int decimal){
        int dec = 0, d = 0, count = 0;
        int resto = 0;
        String binario = "", bin = "";

        dec = decimal;
        d   = decimal;

        do {
            decimal = decimal/2;
            count++;
        } while (decimal > 0);

        while ( count > 0 ) {
            resto = d % 2;
            binario += resto;
            d = d / 2;
            count--;
        }
        bin = inverter(binario);
        System.out.println("Decimal: " +dec+ " - Binario: " +bin);
    }
    private String binRec(int decimal){
        String resp = "";
        int resto = 0;
        if ( decimal > 0 ) {
            resto = decimal%2;
            resp += resto + binRec (decimal/2);
        }
        return resp;
    }

    private String inverter(String v){
        String b = "";
        for ( int i = v.length()-1; i >= 0; i-- ){
            b += v.charAt(i);
        }
        return b;
    }
}
