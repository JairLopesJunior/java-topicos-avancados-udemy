package aula33MetodosDaClasseFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Exemplo02 {

    public static void main(String[] args) throws IOException {

        String caminho = "meuTexto.txt";

        String s = Files.readString(new File(caminho).toPath());

        System.out.println(s);
    }
}
