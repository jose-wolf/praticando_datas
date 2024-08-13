import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RevisandoLocalTime {
    public static void main(String[] args) {

        // Pegando a hora de agora
        LocalTime tempoAtual = LocalTime.now();

        System.out.println(tempoAtual);

        System.out.println("-------------------");
        // definindo uma hora específica
        LocalTime tempoEspecificado = LocalTime.of(15,20,15);
        System.out.println(tempoEspecificado);
        LocalTime fimExpediente = LocalTime.of(17,50);
        System.out.println(fimExpediente);

        System.out.println("-------------------");
        LocalTime tempoEspecificado2 = LocalTime.parse("13:15:48");
        System.out.println(tempoEspecificado2);

        System.out.println("-------------------");

        //pegando um tempo determinado
        int hora = tempoEspecificado2.getHour();
        System.out.println(hora);
        int minuto = tempoEspecificado2.getMinute();
        System.out.println(minuto);
        int segundos = tempoEspecificado2.getSecond();
        System.out.println(segundos);

        System.out.println("-------------------");
        //Modificando o tempo
        LocalTime daquiUmaHora = tempoEspecificado2.plusHours(1);
        System.out.println(daquiUmaHora);
        LocalTime minutosAntes = tempoEspecificado2.minusMinutes(10);
        System.out.println(minutosAntes);

        //Comparando o tempo
        System.out.println("-----------------------------");
        if(tempoAtual.isAfter(fimExpediente)){
            System.out.println("Expediente já passou");
        }else{
            System.out.println("Ainda esta no expediente");
        }

        //Hora formatada
        System.out.println("-----------------------------");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH-mm-ss");
        String horaFormata = tempoAtual.format(dtf1);
        System.out.println(horaFormata);
    }
}
