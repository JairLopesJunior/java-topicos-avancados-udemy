package aula33MetodosDaClasseFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Exemplo01 {

    public static void main(String[] args) throws IOException {

        String caminho = "meuTexto.txt";
        String meuTexto = "Curso Java Tópicos Avançados";

        Files.writeString(new File(caminho).toPath(), meuTexto);
    }
}
