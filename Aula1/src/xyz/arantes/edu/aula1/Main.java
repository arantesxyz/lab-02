package xyz.arantes.edu.aula1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Person> people = new ArrayList<>();
    private static int igeral = 0;
    private static int imgeral = 0;
    private static int ifgeral = 0;
    private static int qnti = 0;
    private static int qntif = 0;
    private static int qntim = 0;
    private static String ifn = "No data";
    private static int ifi = 0;
    private static String imn = "No data";
    private static int imi = 0;

    public static void main(String[] args){
        menu();
    }

    private static void menu(){
        Scanner rd = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("\n\n ==== Controle de pessoas =====");
            System.out.println("\n  =========================");
            System.out.println("    |   1 - Cadastrar pessoas   |");
            System.out.println("    |   2 - Listar pessoas      |");
            System.out.println("    |   0 - Sair                |");
            System.out.println("    =========================\n");
            System.out.println("\n  =========================");
            System.out.println("    |   Idade média geral: "+ igeral +"          |");
            System.out.println("    |   Idade média masculino: "+ imgeral +"     |");
            System.out.println("    |   Idade média feminino: "+ ifgeral +"      |");
            System.out.println("    |                                            |");
            System.out.println("    |   Quantidade de entrevistados: " + qnti + "|");
            System.out.println("    |   Quantidade de Mulheres: " + qntif + "    |");
            System.out.println("    |   Quantidade de Homens: " + qntim + "      |");
            System.out.println("    |                                            |");
            System.out.println("    |   Mulher e homem mais velho:               |");
            System.out.println("    |   "+ ifn +" com "+ ifi +" anos             |");
            System.out.println("    |   "+ imn +" com "+ imi +" anos             |");
            System.out.println("    =========================\n");

            opcao = rd.nextInt();
            switch (opcao){
                case 1:
                    cadastrarPessoa();
                    break;
                case 2:
                    exibirPessoas();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }while (opcao != 0);
    }

    private static void exibirPessoas() {
        for (Person p : people){
            System.out.println("=======================");
            System.out.println("Nome: " + p.getNome());
            System.out.println("Idade: " + p.getIdade());
            System.out.println("Altura: " + p.getAltura());
            System.out.println("Peso: " + p.getPeso());
            System.out.println("Sexo: " + p.getSexo());
            System.out.println("IMC: " + p.getImc());
            System.out.println("=======================");
        }
    }

    private static void cadastrarPessoa() {
        Scanner rd = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = rd.next();

        System.out.println("Digite a sua idade: ");
        int idade = rd.nextInt();

        System.out.println("Digite a sua altura: ");
        double altura = rd.nextDouble();

        System.out.println("Digite o seu peso: ");
        double peso = rd.nextDouble();

        System.out.println("Digite o seu sexo (M / F)");
        String sexo = rd.next();

        Person pessoa = new Person(nome, idade, altura, peso, sexo);
        people.add(pessoa);
        qnti++;

        if (sexo.equalsIgnoreCase("m")){
            if (imi < idade){
                imi = idade;
                imn = nome;
            }
            qntim++;
        }else if (sexo.equalsIgnoreCase("f")){
            if (ifi < idade){
                ifi = idade;
                ifn = nome;
            }
            qntif++;
        }
    }

    private static void updateMenu(){
        for (Person p : people){

        }
    }
}
