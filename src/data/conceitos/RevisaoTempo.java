import java.time.Duration;
import java.time.LocalTime;

public class RevisaoTempo {
    public static void main(String[] args) {

        LocalTime tempo1 = LocalTime.of(6,30,33);
        LocalTime tempo2 = LocalTime.of(15,15,16);

        Duration duracao = Duration.between(tempo1,tempo2);
        System.out.println(duracao);

        System.out.println("diferença de hora: " + duracao.getSeconds());

        LocalTime tempoAtividade = LocalTime.ofSecondOfDay(duracao.getSeconds());
        System.out.println(tempoAtividade);
    }
}
