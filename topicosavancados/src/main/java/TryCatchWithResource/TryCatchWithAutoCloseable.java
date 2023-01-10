package TryCatchWithResource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchWithAutoCloseable {

    public static void main(String[] args) throws IOException {

        lerArquivo("C:\\Users\\Oem\\Documents\\Projetos GIT-HUB\\UDEMY\\java-topicos-avancados-udemy\\topicosavancados\\src\\main\\java\\TryCatchWithResource\\file.txt");
    }

    // Esta forma é possivel ser feita a partir do Java 7
    private static void lerArquivo(String path) throws IOException {
        String linha = "";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            while((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        }
    }
}
