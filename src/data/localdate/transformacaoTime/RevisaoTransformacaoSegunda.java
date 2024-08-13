package data.localdate.transformacaoTime;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class RevisaoTransformacaoSegunda {

    public static void main(String[] args) {

        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);

        LocalTime hora = dataHora.toLocalTime();
        System.out.println(hora);

    }

}
