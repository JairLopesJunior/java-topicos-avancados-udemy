package aula20FactoryMethod;

import java.util.List;

public class FactoryMethodExemplo {

    public static void main(String[] args) {

        List<String> lista = List.of("Banana", "Maça", "Pera");

        for(String s : lista) {
            System.out.println(s);
        }
    }
}
