package java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import reactor.core.publisher.Flux;

public class Test1 {

	public static void main(String[] args) {
		
		Flux<Integer> publisher=Flux.range(1, 10);
		Flux<Integer> publisher1=Flux.fromStream(Stream.of(11,22,33,44));
		Flux<Integer> publisher2=Flux.fromStream(Arrays.asList(11,22,3).stream());
		
		publisher.subscribe(a->System.out.print(a+","));
		System.out.println();
		publisher1.subscribe(a->System.out.print(a+","));
		
		System.out.println();
		publisher2.subscribe(a->System.out.print(a+","));
	}
}
