import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class RevisandoInstant {
    public static void main(String[] args) throws InterruptedException {

        Instant agora = Instant.now();
        System.out.println(agora);

        Thread.sleep(2000);

        Instant depois = Instant.now();
        System.out.println(depois);

        Thread.sleep(5000);
        System.out.println("------------------------");

        Instant insta = Instant.parse("1984-08-13T10:15:30.345Z");

        System.out.println("Instant " + insta);

        System.out.println("15 segundos antes: " + insta.minusSeconds(15));
        System.out.println("3 segundos depois: " + insta.plusSeconds(3));

        System.out.println("diminuindo 45000 mili: " + insta.minusMillis(45000));
        System.out.println("aumentando 5000 mili: " + insta.plusMillis(5000));

        System.out.println("45 minutos antes: " + insta.minus(45, ChronoUnit.MINUTES));
        System.out.println("10 dias adicionados: " + insta.plus(10, ChronoUnit.DAYS));

    }
}
