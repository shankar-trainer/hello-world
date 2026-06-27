package example;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

class ReactiveEx1{
    public static void main(String[] args) {
        Flux<Integer> numbersStream = Flux.range(1, 5)
                .delayElements(Duration.ofMillis(500)); // Introduce delay for demonstration

//numbersStream.

        Flux<String> fruitFlux = Flux.just("Apple", "Orange", "Grape", "Banana", "Strawberry");

        fruitFlux.subscribe(
                f -> System.out.println("Here's some fruit: " + f)
        );

        fruitFlux.subscribe(
                fruit -> System.out.println("Received: " + fruit), // Consumer for each element
                error -> System.err.println("Error: " + error),   // Consumer for errors
                () -> System.out.println("Completed")             // Runnable for completion signal
        );

        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Orange");
        fruitList.add("Grape");
        fruitList.add("Banana");
        fruitList.add("Strawberry");

        Flux<String> fruitFlux1 = Flux.fromIterable(fruitList);

    }
}