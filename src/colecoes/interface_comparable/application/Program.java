package interface_comparable.application;

import interface_comparable.model.entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Funcionario> list = new ArrayList<>();

        String path = "C:\\JOGOS\\comparable_teste2.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String funcionarioCSV = br.readLine();
            while(funcionarioCSV != null){

                String[] arrayFuncionacio = funcionarioCSV.split(",");
                String name = arrayFuncionacio[0];
                double salario = Double.parseDouble(arrayFuncionacio[1]);
                list.add(new Funcionario(name, salario));
                funcionarioCSV = br.readLine();

            }

            Collections.sort(list);
            for(Funcionario funcionario : list){
                System.out.println(funcionario.getNome() + ", " + funcionario.getSalario());
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
