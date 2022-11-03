package aula04;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Exemplo {

    public static void main(String[] args) {

        String str = "A classe Base64 no Java8!";
        System.out.println(str);

        try {
            String strCodificado = Base64.getEncoder().encodeToString(str.getBytes("utf-8"));
            System.out.println(strCodificado);

            String strDecodificado = new String(Base64.getDecoder().decode(strCodificado), "utf-8");
            System.out.println(strDecodificado);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
