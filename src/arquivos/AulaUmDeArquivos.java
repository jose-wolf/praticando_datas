package arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AulaUmDeArquivos {

    public static void main(String[] args) {

            String path = "C:\\Users\\wolfj\\OneDrive\\Documentos\\comprimento.txt";

        try(Scanner sc = new Scanner(new File(path))){

            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        }catch (IOException e){
            e.printStackTrace();
        }


    }

}
