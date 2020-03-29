package ocp.streams.map;

import ocp.streams.dto.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

	public static void mapStream(){
		List<Pessoa> p = Arrays.asList(
				new Pessoa("Fulano", 20),
				new Pessoa("Fulano1", 21),
				new Pessoa("Fulano2", 22)
		);

		List<Estado> e = Arrays.asList(
				new Estado("RS"),
				new Estado("SP"),
				new Estado("RJ")
		);

		TesteResponde t = new TesteResponde();
		t.getPessoa().addAll(p.stream().map(PessoaDTO::new).collect(Collectors.toList()));
		t.getEstados().addAll(e.stream().map(EstadoDTO::new).collect(Collectors.toList()));

		t.getPessoa().forEach(f -> System.out.println(f));

		t.getEstados().forEach(d -> System.out.println(d));

	}

	public static void main(String args[]) {
		List<String> words = Arrays.asList("Java", "Python", "Node", "MongoDB", "Zebra");

		map(words);
		mapStream();

	}

}
