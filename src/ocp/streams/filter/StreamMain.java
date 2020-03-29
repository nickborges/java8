package ocp.streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMain {

	static void filter(List<String> words){
		long count =
				words.parallelStream()
						.filter(f -> f.length() > 5)
						.count();

		System.out.println("filter = " + count);
	}


	public static void main(String args[]) {
		List<String> words = Arrays.asList("Java", "Python", "Node", "MongoDB", "Zebra");
		filter(words);

	}

}
