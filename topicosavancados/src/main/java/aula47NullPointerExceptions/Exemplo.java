package aula47NullPointerExceptions;

class Aluno {

    private String nome = null;

    public Aluno() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

public class Exemplo {

    // JAVA 14
    public static void main(String[] args) {

        Aluno a = new Aluno();

        a.getNome().substring(0, 1);
    }
}























