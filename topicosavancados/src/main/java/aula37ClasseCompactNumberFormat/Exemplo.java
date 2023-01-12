package aula37ClasseCompactNumberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class Exemplo {

    public static void main(String[] args) {

        NumberFormat nf = CompactNumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
        System.out.println(nf.format(50_000));
    }
}
