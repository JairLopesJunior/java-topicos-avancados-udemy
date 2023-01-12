package aula39NovosMetodosJavaString;

public class Exemplo2 {

    // JAVA 12
    public static void main(String[] args) {

        String texto = "Olá Mundo!\nEste é o módulo Java 12.";

        String textoInvertido = texto.transfrom(s -> new StringBuilder(s).reverse().toString());

        System.out.println(textoInvertido);
    }
}
