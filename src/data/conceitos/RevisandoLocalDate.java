package data.conceitos;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class RevisandoLocalDate {
    public static void main(String[] args) {

        // Obtendo a data atual
        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data atual: " + dataAtual);

        System.out.println("-----------------------");
        // determinando data por digitos
        LocalDate dataEspecifica1 = LocalDate.of(2024,06,24);
        System.out.println("Data específica1: " + dataEspecifica1);

        int anoPassado = dataAtual.getYear() -1;
        LocalDate natalAnoPassado = LocalDate.of(anoPassado, Month.DECEMBER,11);
        System.out.println("Data específica12: " + natalAnoPassado);
        System.out.println("-----------------------");

        System.out.println("---------------------");
        //Pegando um valor específico
        int ano = dataAtual.getYear();
        System.out.println(ano);
        int mes = dataAtual.getMonthValue();
        System.out.println(mes);
        int dia = dataAtual.getDayOfMonth();
        System.out.println(dia);

        System.out.println("-----------------");
        //Manipulando a data
        LocalDate amanha = dataAtual.plusDays(1);
        System.out.println("Amanha será: " + amanha);
        LocalDate ontem = dataAtual.minusDays(1);
        System.out.println("ontem foi: " + ontem);
        LocalDate semanaPassada = dataAtual.minusWeeks(1);
        System.out.println("ontem foi: " + semanaPassada);

        // Comparando as datas
        if (dataAtual.isBefore(natalAnoPassado)) {
            System.out.println("O Natal do ano passado ainda não chegou (viagem no tempo?).");
        } else {
            System.out.println("O Natal do ano passado já passou.");
        }

        System.out.println("-------------------------------------------------");
        // Formatando as datas
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFarmatada = dataAtual.format(dtf1);
        System.out.println("data formatada: " + dataFarmatada);
    }
}