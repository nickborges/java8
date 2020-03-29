package ocp.streams.minmax;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamMain {

	static void compareToIgnoreCase(List<String> words){
		Optional<String> max = words.stream().max(String::compareToIgnoreCase);

		if(max.isPresent()){
			System.out.println("compareToIgnoreCase = " + max.get());
		}

	}

	//min, max
	public static void minMaxStream(){
		Stream<String> pos = Stream.of("a", "b", "c");
		Optional<String> min = pos.min((a1, a2) -> a1.length() - a2.length());
		min.ifPresent(System.out::println);
		//closed stream after call pos.min()
	}

	public static void main(String args[]) {
		List<String> words = Arrays.asList("Java", "Python", "Node", "MongoDB", "Zebra");

		compareToIgnoreCase(words);
		minMaxStream();

	}

}
