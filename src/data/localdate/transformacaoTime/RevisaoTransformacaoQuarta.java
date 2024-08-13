package data.localdate.transformacaoTime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class RevisaoTransformacaoQuarta {
    public static void main(String[] args) {

        Instant instante = Instant.parse("2023-03-13T15:58:55.794285600Z");

        LocalDateTime dataHora = LocalDateTime.ofInstant(instante, ZoneOffset.UTC);
        System.out.println(dataHora);
    }
}
