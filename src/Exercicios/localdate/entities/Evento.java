package Exercicios.localdate.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Evento {

    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String nome;
    private String endereço;
    private LocalDate data;

    public Evento() {
    }

    public Evento(String nome, String endereço, LocalDate data) {
        this.nome = nome;
        this.endereço = endereço;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", endereço='" + endereço + '\'' +
                ", data = " + dtf.format(data) +
                '}';
    }
}
