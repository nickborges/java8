package ocp.streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMain {

	static void map(List<String> words){
		System.out.println("map = ");
		words.stream()
				.map(m -> m.charAt(0))
				.forEach(f -> System.out.print(f + ", "));

		words.stream()
				.map(m -> m.length())
				.forEach(f -> System.out.print(f + ", "));

		words.stream()
				.map(m -> m.startsWith("J"))
				.forEach(f -> System.out.print(f + ", "));

		System.out.println();
	}

	public static void main(String args[]) {
		List<String> words = Arrays.asList("Java", "Python", "Node", "MongoDB", "Zebra");

		map(words);

	}

}
