package aula38TeeingCollector;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exemplo {

    public static void main(String[] args) {

        // Collectors.teeing(soma, qtde, media);

        double resultado = Stream.of(50, 10, 3, 19, 11, 22, 19)
                .collect(
                        Collectors.teeing(
                                Collectors.summingDouble(i -> i),
                                Collectors.counting(),
                                (soma, qtde) -> soma / qtde
                        )
                );

        System.out.println(resultado);
    }
}
