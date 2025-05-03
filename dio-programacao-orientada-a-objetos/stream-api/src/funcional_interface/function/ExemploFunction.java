package funcional_interface.function;

import java.util.Arrays;
import java.util.List;

public class ExemploFunction {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> numerosDobrados = numeros.stream().map(n -> n * 2).toList();

        numerosDobrados.forEach(System.out::println);
    }
}
