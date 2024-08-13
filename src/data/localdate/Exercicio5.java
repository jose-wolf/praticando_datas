package data.localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercicio5 {

    public static void main(String[] args) {


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = "31/07/2024";
        LocalDate dataAdquirida = LocalDate.parse(data,dtf);

        System.out.println(dataAdquirida.getDayOfWeek());
    }

}
