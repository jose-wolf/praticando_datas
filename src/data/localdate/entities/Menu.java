package data.localdate.entities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Menu {

    public static void criarMenu() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Calendario calendario = new Calendario();

        int opcao;

        do {

            System.out.println("Menu: ");
            System.out.print("1- Adicionar evento\n2- Remover evento\n3- Listar eventos\n4- Listar eventos por data" +
                    "\n0- sair\nOpção: ");

            opcao = Integer.parseInt(br.readLine());
            switch (opcao) {
                case 1:
                    Evento evento = obterEventos(br);
                    calendario.adicionarEvento(evento);
                    break;
                case 2:
                    System.out.println("Digite o nome do evento para remover");
                    String removerPeloNome = br.readLine();

                    System.out.println("Digite a data do evento para remover");
                    String dataTexto = br.readLine();
                    LocalDate dataRemovida = LocalDate.parse(dataTexto,dtf);

                    Evento eventoNomeARemover = calendario.buscarEventoPeloNome(removerPeloNome);
                    Evento eventoDataARemover = calendario.buscarEventoPelaData(dataRemovida);

                    if((eventoNomeARemover != null) && (eventoDataARemover != null)){
                        calendario.removerEvento(eventoNomeARemover);
                    }else {
                        System.out.println("Evennto não encontrado");
                    }

                    break;
                case 3:
                    calendario.listarEventos();
                    break;
                case 4:
                    System.out.print("Digite a data que deseja encontrar: ");
                    String dataStr = br.readLine();
                    LocalDate localizarData = LocalDate.parse(dataStr, dtf);
                    calendario.listarEventosPorData(localizarData);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("opção invalida ");
            }

        } while (opcao != 0);
        br.close();
    }

    private static Evento obterEventos(BufferedReader br) throws IOException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Digite o evento: ");
        String nomeEvento = br.readLine();

        System.out.print("Digite o endereço: ");
        String endereco = br.readLine();

        System.out.print("Digite a data: ");
        String data = br.readLine();
        LocalDate dataEvento = LocalDate.parse(data,dtf);

        return new Evento(nomeEvento, endereco, dataEvento);
    }

}
