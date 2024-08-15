package arquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AulaDoisDeArquivos {

    public static void main(String[] args) {

        String[] lines = new String[] {
                "Good morning",
                "Good Afternoon",
                "Segunda Aula de arquivos"
        };

        String path = "C:\\Users\\wolfj\\OneDrive\\Documentos\\comprimento2.txt";


        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        try(Scanner sc = new Scanner(new File(path))){

            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
