package lambdaEStrem.Stream.exercicio2.application;

import lambdaEStrem.Stream.exercicio2.model.services.GerenciadorCSV;
import lambdaEStrem.Stream.exercicio2.model.entties.Employee;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Progrram {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        String nomeArquivo = "C:\\Teste\\produtos2versao.csv";

        GerenciadorCSV gerenciadorCSV = new GerenciadorCSV(nomeArquivo);

        List<Employee> employeeList = gerenciadorCSV.lerArquivoCSV(nomeArquivo);

        double salarioLimite = 2000.00;

        List<String> emailsList = employeeList.stream()
                .filter(emp -> emp.getSalary() > salarioLimite)
                .map(Employee::getEmail)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Emails dos funcionários com salário superior a " + salarioLimite + ":");
        emailsList.forEach(System.out::println);

        double somaDeSalario = employeeList.stream()
                .filter(e -> e.getName().startsWith("M"))
                .mapToDouble(Employee::getSalary)
                .sum();


        System.out.println("Soma dos salários dos funcionários cujo nome começa com 'M': " + somaDeSalario);

    }

}
