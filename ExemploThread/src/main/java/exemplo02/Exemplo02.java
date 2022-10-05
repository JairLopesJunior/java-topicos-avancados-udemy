package exemplo02;

interface Figura {

    void desenhar();
}

public class Exemplo02 {

    public static void main(String[] args) {

        Figura fig1 = new Figura() {
            @Override
            public void desenhar() {
                System.out.println("Desenha figura 1");
            }
        };

        fig1.desenhar();

        Figura fig2 = () -> System.out.println("Desenha figura 2");
        fig2.desenhar();
    }
}
