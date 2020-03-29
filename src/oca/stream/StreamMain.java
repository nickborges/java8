package oca.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;

public class StreamMain {

	static void filter(List<String> words){
		long count =
				words.parallelStream()
						.filter(f -> f.length() > 5)
						.count();

		System.out.println("filter = " + count);
	}

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

	static void compareToIgnoreCase(List<String> words){
		Optional<String> max = words.stream().max(String::compareToIgnoreCase);

		if(max.isPresent()){
			System.out.println("compareToIgnoreCase = " + max.get());
		}

	}

	/**
	 * executa métodos em sequência
	 */
	static void flatMap(){
		Optional<Double> result =
				Optional.of(3.0)
						.flatMap(StreamMain::inverse)
						.flatMap(StreamMain::squareRoot);

		if(result.isPresent()){
			System.out.println("flatMap = " + result.get());
		}
	}

	public static Optional<Double> inverse(Double x) {
		return x == 0 ? Optional.empty() : Optional.of(12 / x);
	}

	public static Optional<Double> squareRoot(Double x) {
		return x < 0 ? Optional.empty() : Optional.of(Math.sqrt(x));
	}

	static void reduce(List<Integer> integers, List<String> strings){
		Optional<Integer> i;
		i = integers.stream().reduce(Integer::max);
		System.out.println("reduce max = " + i.get());

		i = integers.stream().reduce(Integer::sum);
		System.out.println("reduce sum = " + i.get());

		i = integers.stream().reduce(Integer::min);
		System.out.println("reduce min = " + i.get());

		Optional<String> s;
		String a = "M";
		Optional<String> s1 = strings.stream().reduce((x, y) -> x.contains(a) ? x : y.contains(a) ? y : "");
		System.out.println(s1.get());

	}

	public static void main(String args[]) {
		List<String> words = Arrays.asList("Java", "Python", "Node", "MongoDB", "Zebra");
		List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9);

		filter(words);
		map(words);
		compareToIgnoreCase(words);
		flatMap();
		reduce(integers, words);

	}

}
