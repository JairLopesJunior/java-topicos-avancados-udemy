package aula22MelhoriasNaApiStream;

import java.util.ArrayList;
import java.util.List;

class Product {
    private int id;
    private String description;

    public Product(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

public class Exemplo {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product(1000, "Geladeira 470L"));
        products.add(new Product(5000, "Geladeira 20L"));
        products.add(new Product(2000, "TV UHD 50''"));
        products.add(new Product(3000, "Microondas 20L"));
        products.add(new Product(4000, "Geladeira 500L"));

        products.stream()
                .takeWhile(p -> p.getDescription().contains("Geladeira"))
                .map(p -> p.getDescription())
                .forEach(System.out::println);

        System.out.println();
        System.out.println("==============");
        products.stream()
                .dropWhile(p -> p.getDescription().contains("Geladeira"))
                .map(p -> p.getDescription())
                .forEach(System.out::println);
    }
}



































