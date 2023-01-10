package aula17;

public class TesteEvento {

    public static void main(String[] args) {
        ExemploInterfacePrivate log = new ExemploInterfacePrivate(){};

        log.logError("Conexão falhou");
    }
}
