import java.time.LocalDate;
import java.time.Period;

public class RevisaoPeriod {
    public static void main(String[] args) {

        LocalDate data1 = LocalDate.now();
        System.out.println(data1);

        LocalDate data2 = LocalDate.of(2024,2,15);

        Period periodo = Period.between(data2,data1);
        System.out.println(periodo);

        System.out.println("A diferença de dias é: " + periodo.getDays());
        System.out.println("A diferença de meses é: " + periodo.getMonths());
    }
}
