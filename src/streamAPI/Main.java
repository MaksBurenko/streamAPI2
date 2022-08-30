package streamAPI;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {
    }


    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {


        List<? extends T> elements = stream.collect(Collectors.toList());

            if (elements != null && !elements.isEmpty()) {
                elements.sort(order);
                minMaxConsumer.accept(Collections.min(elements, order), Collections.max(elements, order));
            } else {
                minMaxConsumer.accept(null, null);
            }
    }
}



