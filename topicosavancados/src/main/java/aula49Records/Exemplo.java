package aula49Records;

class Figura2D {}

interface Figura3D {}

// (extends Figura2D) Não pode usar extends em records
record Retangulo(double largura, double altura) extends Figura2D implements Figura3D { // (implements) é valido utilizar!!

    private String nome; // Não é permitido membros não estáticos

        public static void imprimeNome() { // Código valido
            System.out.println("Olá eu sou um retangulo!!");
        }
}

public class Exemplo {

    // JAVA 14
    public static void main(String[] args) {

        Retangulo r1 = new Retangulo(300.0, 200.0);

        System.out.println(r1.altura());
        System.out.println(r1.largura());
    }
}
