package xyz.arantes.edu.aula1.questao1;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao1 {

    private ArrayList<Person> people = new ArrayList<>();

    private String ifn = "SEM_DADOS";
    private int ifi = 0;
    private String imn = "SEM_DADOS";
    private int imi = 0;

    public void menu(){
        Scanner rd = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n\n ==== Controle de pessoas =====");
            System.out.println("\n    =========================");
            System.out.println("    |   1 - Cadastrar pessoas   |");
            System.out.println("    |   2 - Listar pessoas      |");
            System.out.println("    |   0 - Sair                |");
            System.out.println("      =========================\n \n \n ");
            System.out.println("\n    ====================================================");
            System.out.println("    |   Idade média geral: "+ idadeMedia() +"              |");
            System.out.println("    |   Idade média masculino: "+ idadeMedia("m") +" |");
            System.out.println("    |   Idade média feminino: "+ idadeMedia("f") +"  |");
            System.out.println("    |                                                      |");
            System.out.println("    |   Quantidade de entrevistados: " + qntPessoas() + "  |");
            System.out.println("    |   Quantidade de Mulheres: " + qntPessoas("f") + "|");
            System.out.println("    |   Quantidade de Homens: " + qntPessoas("m") + "|");
            System.out.println("    |                                                      |");
            System.out.println("    |   Mulher e homem mais velho:                         |");
            System.out.println("    |   "+ ifn +" com "+ ifi +" anos                       |");
            System.out.println("    |   "+ imn +" com "+ imi +" anos                       |");
            System.out.println("    |                                                      |");
            System.out.println("    |   " + abaixoDoPesoIdeal("f") + "% das mulheres tem o peso abaixo do ideal.|");
            System.out.println("      ====================================================\n");

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

    private int abaixoDoPesoIdeal(String sexo) {
        int a = 0;
        for (Person p : people){
            if (p.getSexo().equalsIgnoreCase(sexo)){
                if (p.getImc() < 20){
                    a++;
                }
            }
        }
        if (a == 0) {
            return 0;
        }
        return (a * 100) / qntPessoas();

    }

    private void exibirPessoas() {
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

    private void cadastrarPessoa() {
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

        if (sexo.equalsIgnoreCase("m")){
            if (imi < idade){
                imi = idade;
                imn = nome;
            }
        }else if (sexo.equalsIgnoreCase("f")){
            if (ifi < idade){
                ifi = idade;
                ifn = nome;
            }
        }
    }

    private int idadeMedia(){
        int a = 0, b = 0;
        for (Person p : people){
            a += p.getIdade();
            b++;
        }
        if (b == 0) {
            b = 1;
        }
        return a/b;
    }

    private int idadeMedia(String sexo){
        int a = 0, b = 0;
        for (Person p : people){
            if (p.getSexo().equalsIgnoreCase(sexo)){
                a += p.getIdade();
                b++;
            }
        }

        if (b == 0) {
            b = 1;
        }

        return a/b;
    }

    private int qntPessoas(){
        return people.size();
    }

    private int qntPessoas(String sexo){
        int a = 0;
        for (Person p : people){
            if (p.getSexo().equalsIgnoreCase(sexo)){
                a++;
            }
        }
        return a;
    }
}
