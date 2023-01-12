package aula42SwitchExpressionsYield;

public class Exemplo {

    // JAVA 13
    public static void main(String[] args) {

        String dia = "";

        String resultado = switch(dia) {
            case "Segunda":
                yield "dia útil";
            case "Terca":
                yield "dia útil";
            case "Quarta":
                yield "dia útil";
            default:
                yield "dia inválido";
        }
    }
}
