package Exercicios.localdate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class exercicio2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Digite a primeira data: " );
        String texto1 = br.readLine();

        System.out.print("Digite a segunda data: " );
        String texto2 = br.readLine();

        LocalDate data1 = LocalDate.parse(texto1);
        LocalDate data2 = LocalDate.parse(texto2);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        if (data1.isBefore(data2)) {
            System.out.println(dtf.format(data1) + " é antes de " + dtf.format(data2));
        } else if (data1.isAfter(data2)) {
            System.out.println(dtf.format(data1) + " é depois de " + dtf.format(data2));
        } else {
            System.out.println(dtf.format(data1) + " é igual a " + dtf.format(data2));
        }

        br.close();
    }
}
