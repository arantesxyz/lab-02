package xyz.arantes.edu.lista1.questao1;

public class Retangulo {
    private double base;
    private double altura;

    Retangulo(double base, double altura){
        this.altura = altura;
        this.base = base;
    }

    public double getArea() {
        return base * altura;
    }

    public double getPerimetro() {
        return 2 * (altura + base);
    }
}
