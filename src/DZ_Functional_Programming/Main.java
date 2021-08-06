package DZ_Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String inputString = "Функциональное программирование — парадигма программирования," +
                " в которой процесс вычисления трактуется как вычисление значений функций в математическом понимании последних. " +
                "Противопоставляется парадигме императивного программирования, которая описывает процесс вычислений как последовательное изменение состояний";

        Function<String, List<String>> dictionaryBuffer = d -> Arrays.stream(d.toLowerCase(Locale.ROOT).split(" "))
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        List<String> dictionary = dictionaryBuffer.apply(inputString);
        dictionary.forEach(System.out::println);

        System.out.println(inputString);
    }
}
