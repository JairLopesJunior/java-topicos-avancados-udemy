package aula25InferenciaDeTiposEmVariaveisLocais;

import java.util.List;

public class Exemplo2 {

    public static void main(String[] args) {

        var listaDeFrutas = List.of("banana", "maçã", "abacaxi");

        // Enhanced For
        for(var fruta : listaDeFrutas) {
            System.out.println(fruta);
        }

        // Índice laço for
        for (var i = 0; i < listaDeFrutas.size(); i++) {
            System.out.println(listaDeFrutas.get(i));
        }

        // Por que utilizar o var? (Ajuda a simplicar a digitação do código)
        ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
        var ex = new ArrayIndexOutOfBoundsException();
    }
}
