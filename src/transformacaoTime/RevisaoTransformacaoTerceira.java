package transformacaoTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class RevisaoTransformacaoTerceira {
    public static void main(String[] args) {
        //LocalDate to LocalDateTime
        LocalDate  data = LocalDate.of(2024,5,15);
        System.out.println(data);

        LocalDateTime dataHora = data.atTime(16,31,27);
        System.out.println(dataHora);

        dataHora = data.atTime(LocalTime.of(16,31,21));
        System.out.println(dataHora);

        dataHora = data.atTime(LocalTime.of(16,31));
        System.out.println(dataHora);

        dataHora = data.atStartOfDay();
        System.out.println(dataHora);

    }
}
