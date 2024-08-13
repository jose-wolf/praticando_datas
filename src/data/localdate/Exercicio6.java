package data.localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Exercicio6 {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dataTexto1 = "31/08/2024";
        String dataTexto2 = "02/09/2024";
        LocalDate dataVencvimento = LocalDate.parse(dataTexto1,dtf);
        LocalDate dataEmissao = LocalDate.parse(dataTexto2,dtf);

        System.out.println("Data de vencimento: " + dtf.format(dataVencvimento));
        System.out.println("Data de emissão: " + dtf.format(dataEmissao));
        long diasParaVencimento = ChronoUnit.DAYS.between(dataEmissao, dataVencvimento);

        if (dataVencvimento.isAfter(dataEmissao)){
            System.out.println("Faltam " + diasParaVencimento + " dias para o prazo");
        }else{
            System.out.println("Produto ainda esta no prazo: " + diasParaVencimento);
        }
    }
    
}
