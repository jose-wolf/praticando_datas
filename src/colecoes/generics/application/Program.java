package colecoes.generics.application;

import colecoes.generics.services.PrintService;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService<String> ps = new PrintService<>();

        System.out.print("Quantos valores: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            String value = sc.next();
            ps.addValue(value);
        }

        System.out.println("First: " + ps.first());

        ps.print();

        sc.close();
    }

}
