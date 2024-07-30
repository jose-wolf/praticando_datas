package Exercicios.localdate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class exercicio1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite sua idade de nascimento");
        String nascimento = br.readLine();

        LocalDate dataDeNascimento1 = LocalDate.parse(nascimento);

        System.out.println("Você nesceu no dia: " +dtf.format(dataDeNascimento1));

        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data atual é: " + dtf.format(dataAtual));

        if(dataAtual.isAfter(dataDeNascimento1)){
            Period periodo = Period.between(dataDeNascimento1, dataAtual);
            System.out.println("Você tem " + periodo.getYears() + " anos");
        }else{
            System.out.println(dataAtual + " antes");
        }

        br.close();

    }
}

