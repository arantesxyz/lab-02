package xyz.arantes.edu.aula1.questao2;

public class Questao2 {

    public void getTabuadas(int number){
        for (int i = 1; i<= number; i++){
            System.out.println("=======     Tabuada do " + i + "     =======");
            getTabuada(i);
            System.out.println("============================================");
        }
    }

    private void getTabuada(int number){
        for (int i = 0; i <= 10; i++){
            int result = number * i;
            System.out.println(i + " x " + number + " = " + result);
        }
    }
}
