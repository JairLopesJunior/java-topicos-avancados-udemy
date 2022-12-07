package aula11;

import java.util.ArrayList;
import java.util.List;

class ImprimeProdutos {

    public static void imprime(List<String> lista) {
        lista.forEach(System.out::println);
    }
}

public class TypeInferenceExemplo {

    public static void main(String[] args) {

        // Operador DIAMONT <>
        List<String> lista = new ArrayList<>();
        lista.add("João");
        lista.add("Maria");

        ImprimeProdutos.imprime(lista);
    }
}
