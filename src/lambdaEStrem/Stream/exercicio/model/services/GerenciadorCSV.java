package lambdaEStrem.Stream.exercicio.model.services;

import lambdaEStrem.Stream.exercicio.model.entities.Produto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorCSV {

    private static final String SEPERADOR_CSV = ",";
    private String nomeArquivo;

    public GerenciadorCSV() {
    }

    public GerenciadorCSV(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public List<Produto> lerProdutosCSV(String nomeArquivo){
        List<Produto> produtoList = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))){
            String linha = br.readLine();

            while(linha != null){
                String[] camposCSV = linha.split(SEPERADOR_CSV);
                produtoList.add(new Produto(camposCSV[0],Double.parseDouble(camposCSV[1])));
                linha = br.readLine();
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        return produtoList;
    }

}
