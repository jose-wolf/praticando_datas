package data.conceitos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RevisandoLocalDateTime {

    public static void main(String[] args) {

        // pega a data e hora atual
        LocalDateTime diaEHora = LocalDateTime.now();
        System.out.println(diaEHora);

        System.out.println("---------------------------");


        //passando data e hora específica
        LocalDateTime entradaNaFacul = LocalDateTime.of(2021,7,24, 12,05,15);
        System.out.println(entradaNaFacul);

        System.out.println("---------------------------");

        // mudando a hora e o dia
        LocalDateTime proximosMes = entradaNaFacul.plusMonths(1);
        System.out.println(proximosMes);
        LocalDateTime quinzeMinutos = entradaNaFacul.plusMinutes(15);
        System.out.println(quinzeMinutos);
        LocalDateTime umaHoraAtras = entradaNaFacul.minusHours(1);
        System.out.println(umaHoraAtras);

        System.out.println("---------------------------");
        //Comparando-as
        boolean dataHoraIgual = entradaNaFacul.equals(diaEHora);
        System.out.println(dataHoraIgual);

        boolean dataHoraIgual2 = entradaNaFacul.getDayOfMonth()== diaEHora.getDayOfMonth();
        System.out.println(dataHoraIgual2);

        System.out.println("---------------------------");
        //formatando
        LocalDateTime ldt1 = LocalDateTime.of(2024,7,24, 17,0,0);
        System.out.println(ldt1);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
        String dataHoraFormatada = dtf1.format(ldt1);
        System.out.println(dataHoraFormatada);
    }

}
