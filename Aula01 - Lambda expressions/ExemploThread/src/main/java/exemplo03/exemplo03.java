package exemplo03;

import java.util.ArrayList;
import java.util.List;

class Produto {
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

public class exemplo03 {

    public static void main(String[] args) {

        List<Produto> list = new ArrayList<>();
        list.add(new Produto("TV 42", 2000.00));
        list.add(new Produto("Geladeira 470L", 3200.00));
        list.add(new Produto("Fogão 4 bocas", 900.00));
        list.add(new Produto("Videogame", 1999.00));
        list.add(new Produto("Microondas", 550.00));

        list.forEach((p) -> System.out.println(p.getNome() + " = " + p.getPreco()));
        System.out.println();

        list.sort((p1, p2) -> p1.getPreco().compareTo(p2.getPreco()));

        list.forEach((p) -> System.out.println(p.getNome() + " = " + p.getPreco()));
    }
}
