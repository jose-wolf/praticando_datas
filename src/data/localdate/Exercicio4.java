package data.localdate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Exercicio4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String nascimento = br.readLine();

        LocalDate dataNascimento = LocalDate.parse(nascimento,dtf);
        LocalDate dataAtual = LocalDate.now();

        LocalDate proximoAniversario = dataNascimento.withYear(dataAtual.getYear());
        if(proximoAniversario.isBefore(dataAtual) || proximoAniversario.isEqual(dataAtual)){
            proximoAniversario = proximoAniversario.plusYears(1);
        }

        long diasAteAniversario = ChronoUnit.DAYS.between(dataAtual, proximoAniversario);

        System.out.println(diasAteAniversario);

        br.close();
    }

}
