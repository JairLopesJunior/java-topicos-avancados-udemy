package aula35SwitchExpressions;

import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {

        System.out.println("Digite o dia da Semana: ");

        Scanner scan = new Scanner(System.in);

        String dia = scan.nextLine();

        scan.close();

        String resultado = "";

        switch(dia) {
            case "Segunda":
            case "Terça":
            case "Quarta":
            case "Quinta":
            case "Sexta":
                resultado = "dia útil";
                break;
            case "Sabado":
            case "Domingo":
                resultado = "Final de Semana";
                break;
            default:
                resultado = "Dia inválido!!";
        }

        System.out.println(resultado);
    }
}
