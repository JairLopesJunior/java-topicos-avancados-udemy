package aula07;

import java.util.StringTokenizer;

public class StringJoinerExemplo {

    public static void main(String[] args) {

        String nomes = "João, Pedro, Maria, Ana, Paulo";

        StringTokenizer st = new StringTokenizer(nomes, ",");

        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
