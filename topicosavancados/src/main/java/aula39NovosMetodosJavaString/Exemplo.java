package aula39NovosMetodosJavaString;

public class Exemplo {

    // JAVA 12
    public static void main(String[] args) {

        String texto = "Olá Mundo!\nEste é o módulo Java 12.";

        // Adiciona 4 espaços em branco
        texto = texto.indent(4);

        System.out.println(texto);

        // Remove 1 espaço em branco
        text = texto.indent(-1);

        System.out.println(texto);
    }
}
