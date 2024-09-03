package colecoes.equalsHashCode.application;

import colecoes.equalsHashCode.entities.Client;

public class Program {

    public static void main(String[] args) {

        Client client1 = new Client("nomeExemplo1", "nomeEmailExemplo1@gmail.com");
        Client client2 = new Client("nomeExemplo2", "nomeEmailExemplo2@hotmail.com");
        Client client3 = new Client("nomeExemplo1", "nomeEmailExemplo2@outlook.com");

        System.out.println(client1.hashCode());
        System.out.println(client2.hashCode());
        System.out.println(client3.hashCode());
        System.out.println();
        System.out.println(client1.equals(client2));
        System.out.println(client1.equals(client3));
        System.out.println(client1 == client3);


        String s1 = "Teste";
        String s2 = "Teste";
        String s3 = new String("Teste");

        System.out.println();
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }

}
