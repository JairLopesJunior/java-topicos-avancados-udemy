package aula35SwitchExpressions;

import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {

        System.out.println("Digite o dia da Semana: ");

        Scanner scan = new Scanner(System.in);

        String dia = scan.nextLine();

        scan.close();

        String resultado = "";

        // JAVA 12
        resultado = switch(dia) {
            case "Segunda", "Terça", "Quarta", "Quinta", "Sexta" -> "Dia útil";
            case "Sabado" -> "Final de Semana";
            case "Domingo" -> "Final de Semana";
            default -> "Dia inválido!!"; // É obrigatório o DEFAULT
        };

        System.out.println(resultado);
    }
}
