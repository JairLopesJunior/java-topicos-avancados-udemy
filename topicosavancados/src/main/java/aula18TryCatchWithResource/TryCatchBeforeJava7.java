package aula18TryCatchWithResource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchBeforeJava7 {

    public static void main(String[] args) throws IOException {

        lerArquivo("C:\\Users\\Oem\\Documents\\Projetos GIT-HUB\\UDEMY\\java-topicos-avancados-udemy\\topicosavancados\\src\\main\\java\\TryCatchWithResource\\file.txt");
    }

    // Antes do Java 7 - "Modo Tradicional"
    private static void lerArquivo(String path) throws IOException {
        String linha = "";

        BufferedReader br = new BufferedReader(new FileReader(path));

        try {
            while((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch(IOException e) {
            throw e;
        } finally {
            if(br != null) {
                br.close();
            }
        }
    }
}
