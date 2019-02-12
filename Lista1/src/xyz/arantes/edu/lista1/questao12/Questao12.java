package xyz.arantes.edu.lista1.questao12;

public class Questao12 {

    public void run(){
        getTabuadas(10);
    }

    private void getTabuadas(int number){
        for (int i = 1; i<= number; i++){
            System.out.println("=======     Tabuada do " + i + "     =======");
            getTabuada(i);
            System.out.println(" ");
        }
    }

    private void getTabuada(int number){
        for (int i = 0; i <= 10; i++){
            int result = number * i;
            System.out.println(i + " x " + number + " = " + result);
        }
    }
}
