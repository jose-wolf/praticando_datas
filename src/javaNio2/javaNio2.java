package javaNio2;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;

public class javaNio2 {

    public static void main(String[] args) throws URISyntaxException, IOException {

        Path path = Path.of("C:\\Teste\\readme.txt");
        System.out.println(path); //conseguindo o camainho do diretório

        boolean exists = Files.exists(path);
        System.out.println("Existe = " + exists); // verificando se o arquivo existe

        FileTime tempoDaUltimaModificacao = Files.getLastModifiedTime(path);
        System.out.println("Ultima modificação feita: " + tempoDaUltimaModificacao);//verificando a ultima "mexida" do
        // arquivo

        long mismatcIndex = Files.mismatch(path, Path.of("C:\\Teste\\teste_generics.txt"));
        System.out.println("mismatch = " + mismatcIndex);

        UserPrincipal owner = Files.getOwner(path);
        System.out.println("owner = " + owner);// descobrindo o dono do arquivo

        Path novoDiretorio = Files.createDirectories(path.getParent().resolve("novoDiretorio"));
        System.out.println("novo diretório = " + novoDiretorio);

        Path novoArquivo = Files.createFile(novoDiretorio.resolve("arquivoVazio.txt"));
        System.out.println(novoArquivo);
    }

}
