package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {
    }


    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {


        List<? extends T> elements = Arrays.stream();



            Optional <? extends T> min = stream.max(order);
            Optional <? extends T> max = stream.min(order);

            if (max.isPresent() && min.isPresent()) {
                minMaxConsumer.accept(min.get(), max.get());
            } else {
                minMaxConsumer.accept(null, null);
            }
    }
}
