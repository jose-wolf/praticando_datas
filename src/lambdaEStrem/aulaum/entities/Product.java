package lambdaEStrem.aulaum.entities;

public class Product {

    private String nome;
    private Double preco;

    public Product(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public static String staticUppercaseNome(Product p){
        return p.getNome().toUpperCase();
    }

    public String noStaticUppercaseNome(){
        return nome.toUpperCase();
    }

    @Override
    public String toString() {
        return nome + " - "  + String.format("%.2f", preco);
    }
}

