package aula12;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class ReflexaoExemplo {

    public static void main(String[] args) {

        // Instância da classe PRODUTO
        Produto p = new Produto("Geladeira", 3000.00);

        // Instância da classe CLASS
        Class c = p.getClass();

        // Todos os métodos declarados da classe PRODUTO
        Method[] methods = c.getDeclaredMethods();
        for(Method m: methods) {
            System.out.println(m.getName());

            Parameter[] parameters = m.getParameters();
            for(Parameter pp: parameters) {
                System.out.println(pp);
            }
        }
    }
}
