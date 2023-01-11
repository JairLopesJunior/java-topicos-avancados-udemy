package aula32VarEmParametrosLambda;

import java.util.function.Function;

public class Exemplo {

    public static void main(String[] args) {

        var x = 100;

        Function<String, String> concatena = (var s) -> s + ". ";
    }
}
