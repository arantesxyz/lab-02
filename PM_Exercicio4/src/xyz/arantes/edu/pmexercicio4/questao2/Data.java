package xyz.arantes.edu.pmexercicio4.questao2;

import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class Data {

    // TODO Substituir por um ENUM.
    private HashMap<Integer, String> diasDaSemana = new HashMap<>();
    private HashMap<Integer, String> mesNomes = new HashMap<>();

    private int ano, mes, dia;

    private void setup(){
        diasDaSemana.put(2, "Domingo");
        diasDaSemana.put(3, "Segunda");
        diasDaSemana.put(4, "Terça");
        diasDaSemana.put(5, "Quarta");
        diasDaSemana.put(6, "Quinta");
        diasDaSemana.put(7, "Sexta");
        diasDaSemana.put(1, "Sábado");

        mesNomes.put(1, "Janeiro");
        mesNomes.put(2, "Fevereiro");
        mesNomes.put(3, "Março");
        mesNomes.put(4, "Abril");
        mesNomes.put(5, "Maio");
        mesNomes.put(6, "Junho");
        mesNomes.put(7, "Julho");
        mesNomes.put(8, "Agosto");
        mesNomes.put(9, "Setembro");
        mesNomes.put(10, "Outubro");
        mesNomes.put(11, "Novembro");
        mesNomes.put(12, "Dezembro");
    }

    public Data(){
        this.ano = LocalDateTime.now().getYear();
        this.mes = LocalDateTime.now().getMonthValue();
        this.dia = LocalDateTime.now().getDayOfMonth();
        setup();
    }

    public Data(int ano, int mes, int dia){
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        setup();
    }

    public int getDia() {
        return dia;
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public void adicionaDias(int quantidade){
        dia += quantidade;
    }

    public void proximoDia(){
        if (dia + 1 > diasNoMes()){
            dia = 1;
            proxMes();
        }else{
            dia++;
        }
    }

    private void proxMes(){
        if (mes == 12){
            mes = 1;
            proxAno();
        }else{
            mes++;
        }
    }

    private void proxAno(){
        ano++;
    }

    public int diasNoMes(){
        return YearMonth.of(ano, mes).lengthOfMonth();
    }

    public String diaDaSemana(){
        Calendar c = Calendar.getInstance();
        Date a = new Date(ano, mes, dia);
        c.setTime(a);

        return diasDaSemana.get(c.get(Calendar.DAY_OF_WEEK));
    }

    public boolean eBissexto(){
        if (ano % 4 != 0) {
            return false;
        } else if (ano % 400 == 0) {
            return true;
        } else if (ano % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString(){
        return diaDaSemana() + ", " + getDia() + " de " + mesNomes.get(getMes()) + " de " + getAno();
    }

    @Override
    public boolean equals(Object obj){
        return obj instanceof Data && obj == this;
    }
}
