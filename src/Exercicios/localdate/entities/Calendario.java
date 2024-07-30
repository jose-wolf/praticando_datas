package Exercicios.localdate.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Calendario {

    private List<Evento> eventos = new ArrayList<>();


    public Calendario(){
        this.eventos = new ArrayList<>();
    }



    public void adicionarEvento(Evento evento){
        eventos.add(evento);
    }

    public void removerEvento(Evento evento){
        if(eventos.remove(evento)){
            System.out.println("Evento removido com sucesso! ");
        }else{
            System.out.println("Evento não encontrado! ");
        }
    }

    public Evento buscarEventoPeloNome(String nome){
        for(Evento evento : eventos){
            if (evento.getNome().equals(nome)){
                return evento;
            }
        }
        return null;
    }

    public Evento buscarEventoPelaData(LocalDate data){
        for (Evento evento: eventos){
            if (evento.getData().isEqual(data)){
                return evento;
            }
        }

        return null;
    }

    public void listarEventos(){
        if(eventos.isEmpty()){
            System.out.println("Nenhum evento encontrado");
        }
        System.out.println("Eventos cadastrados: ");
        for(Evento evento : eventos){
            System.out.println(evento);
        }
    }

    public void listarEventosPorData(LocalDate data){
        boolean encontroEventos = false;

        System.out.println("Evento em " + data + ":");
        for (Evento evento : eventos){
            if (evento.getData().isEqual(data)){
                System.out.println(evento);
                encontroEventos = true;
            }
        }

        if(!encontroEventos){
            System.out.println("Nenhum evento encontrado para esta data");
        }

    }
}
