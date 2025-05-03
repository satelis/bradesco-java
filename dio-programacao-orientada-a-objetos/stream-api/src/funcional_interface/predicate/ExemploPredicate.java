package funcional_interface.predicate;

import java.util.Arrays;
import java.util.List;

public class ExemploPredicate {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        palavras.stream().filter(palavra -> palavra.length() > 5).forEach(System.out::println);
    }
}
