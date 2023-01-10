package aula19InferenceTypes;

public class InferenciaExemplo {

    // Classe interna anònima
    public static void main(String[] args) {

        SomaTudo<String> somar = new SomaTudo<>() {
            @Override
            public String soma(String a, String b) {
                return a + b;
            }
        };

        System.out.println(somar.soma("Olá ", "Mundo!"));
    }
}
