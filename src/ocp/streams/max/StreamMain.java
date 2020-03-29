package ocp.streams.max;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMain {

	static void compareToIgnoreCase(List<String> words){
		Optional<String> max = words.stream().max(String::compareToIgnoreCase);

		if(max.isPresent()){
			System.out.println("compareToIgnoreCase = " + max.get());
		}

	}

	public static void main(String args[]) {
		List<String> words = Arrays.asList("Java", "Python", "Node", "MongoDB", "Zebra");
		compareToIgnoreCase(words);

	}

}
