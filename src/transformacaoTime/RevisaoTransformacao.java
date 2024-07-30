package transformacaoTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RevisaoTransformacao {

    public static void main(String[] args) throws InterruptedException {

        //LocalDataTime para LocalDate
        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);

        Thread.sleep(3000);

        LocalDate data = dataHora.toLocalDate();
        System.out.println(data);

    }

}
