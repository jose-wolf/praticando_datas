package lambdaEStrem.Stream.exercicio.application;

import lambdaEStrem.Stream.exercicio.model.entities.Produto;
import lambdaEStrem.Stream.exercicio.model.services.GerenciadorCSV;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        String nomeArquivo = "C:\\Teste\\produtos2versao.CSV";

        GerenciadorCSV gerenciadorCSV = new GerenciadorCSV(nomeArquivo);

        List<Produto> produtoList = gerenciadorCSV.lerProdutosCSV(nomeArquivo);

        double media = produtoList.stream()
                .map(p -> p.getPreco())
                .reduce(0.0, (x,y) -> x + y) / produtoList.size();

        System.out.println("Preço médio: " + media);

        Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

        List<String> nomesList = produtoList.stream()
                .filter(p -> p.getPreco() < media)
                .map(p -> p.getNome())
                .sorted(comp.reversed())
                .collect(Collectors.toList());

        nomesList.forEach(System.out::println);
    }

}
