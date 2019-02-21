package xyz.arantes.edu.pmexercicio1.questao1;

import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class Data {

    // TODO Substituir por um ENUM.
    private HashMap<Integer, String> diasDaSemana = new HashMap<>();

    private int ano, mes, dia;

    private void setup(){
        diasDaSemana.put(2, "Domingo");
        diasDaSemana.put(3, "Segunda");
        diasDaSemana.put(4, "Terça");
        diasDaSemana.put(5, "Quarta");
        diasDaSemana.put(6, "Quinta");
        diasDaSemana.put(7, "Sexta");
        diasDaSemana.put(1, "Sábado");
    }

    public Data(){
        this.ano = LocalDateTime.now().getYear();
        this.mes = LocalDateTime.now().getMonthValue();
        this.dia = LocalDateTime.now().getDayOfMonth();
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
}
