package records.recordsAtual.entities;

public record Pessoa(String nome, String endereco) {

    public static String ENDERECO_VAZIO = "Vazio";

    public static Pessoa nomeNulo(String endereco){
        return new Pessoa("vazio", endereco);
    }
}
