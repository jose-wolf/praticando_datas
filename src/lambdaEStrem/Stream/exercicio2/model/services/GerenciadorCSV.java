package lambdaEStrem.Stream.exercicio2.model.services;

import lambdaEStrem.Stream.exercicio2.model.entties.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorCSV {

    private static final String SEPERADOR_CSV = ",";
    private String nomeArquivo;

    public GerenciadorCSV(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public List<Employee> lerArquivoCSV(String nomeArquivo){
        List<Employee> employeeList = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))){
            String linha = br.readLine();

            while (linha != null) {
                String[] composCSV = linha.split(SEPERADOR_CSV);
                employeeList.add(new Employee(composCSV[0],composCSV[1], Double.parseDouble(composCSV[2])));
                linha = br.readLine();
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        return employeeList;
    }

}
