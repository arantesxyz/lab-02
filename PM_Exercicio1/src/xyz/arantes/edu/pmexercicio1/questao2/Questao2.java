package xyz.arantes.edu.pmexercicio1.questao2;

public class Questao2 {

    public void run(){
        Pessoa p = new Pessoa("Gustavo", "12836253823", (byte) 21, 'm');

        if (p.eMaior()){
            System.out.println("Sobre: " + p.getNome());
            System.out.println("- É maior de idade.");
            System.out.println("- Tem " + p.getIdade() + " anos de idade.");
            System.out.println("- É do sexo " + p.getSexo() + ".");
        }
    }
}
