package Exercicios.localdate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercicio7 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String  dataTexto1 = br.readLine();
        String  dataTexto2 = br.readLine();

        LocalDate data1 = LocalDate.parse(dataTexto1,dtf);
        LocalDate data2 = LocalDate.parse(dataTexto2,dtf);

        int anoData1 = data1.getYear();
        int anoData2 = data2.getYear();
        int mesData1 = data1.getMonthValue();
        int mesData2 = data2.getMonthValue();
        if ((anoData1 == anoData2) && (mesData1 == mesData2)){
            System.out.println("As datas estão no mesmo mês e ano: " + dtf.format(data1));
        }else{
            System.out.println("Mês e ano são diferentes!");
        }

    }
}
