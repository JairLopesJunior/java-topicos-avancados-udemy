package aula31NovosMetodosNaClasseString;

import java.util.stream.Collectors;

public class Exemplo02 {

    public static void main(String[] args) {

        String str = "Java\nTópicos\nAvançados";

        System.out.println(str.lines().collect(Collectors.joining(" ")));
    }
}
