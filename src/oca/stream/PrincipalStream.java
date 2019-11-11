package oca.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrincipalStream {

	

	public static void main(String args[]) {
		/*
		 * List<String> list = Arrays.asList("a", "b", "c"); 
		 * Stream<String> fromList = list.oca.stream();
		 * Stream<String> fromListParallel = list.parallelStream();
		 * Stream<Double> randoms = Stream.generate(Math::random); Stream<Integer>
		 * oddNumbers = Stream.iterate(1, n -> n + 2);
		 * 
		 * oddNumbers.forEach(n -> System.out.println(n)); fromList.forEach(o1 ->
		 * System.out.println(o1));
		 * 
		 * System.out.println(fromListParallel);
		 */
		/*
		 * String aa = "  -"; System.out.println(aa.trim());
		 */
		
		final String arquivo = "C:/Ambiente/Data.csv";
		String DEFAULT_SEPARATOR = ",";
		String DEFAULT_QUOTE = "";

		Map<Integer, List> mapa = new HashMap<>();
		
        try {

        	int chave = 0;
        	
        	List listaCSV = new ArrayList();
        	BufferedReader br = new BufferedReader(new FileReader(arquivo));
        	
            while ((DEFAULT_QUOTE = br.readLine()) != null) {

                String[] array = DEFAULT_QUOTE.split(DEFAULT_SEPARATOR);

                
                int virgula = 0;
                for(String linha: array) {
                	
                	while(linha.length() >=0) {
	                	String aa = linha.replaceFirst(";", ",");
	                	virgula = aa.lastIndexOf(",");
	                	String a = ""; 
	                			
	                	if(virgula >= 0) {
	                		a = linha.substring(0, virgula);
	                		listaCSV.add(a);
	                		
	                	} else {
	                		a = linha.toString();
	                		listaCSV.add(a);
	                		break;
	                	}
	                	
	                	if(virgula > 0) {
	                		linha = linha.substring(virgula + 1,   ( linha.length() - 1)  );
	                	} else {
	                		linha = linha.substring(virgula + 1, aa.length() - 2 );
	                	}
                	}
                	
                }
                mapa.put(chave++ , listaCSV);
                listaCSV = new ArrayList<>();
                
                
            }
            
            mapa.forEach((key, valor) -> System.out.println("Chave: " + key + " - " + "Valor: " + valor));

        } catch (final IOException exception) {
            System.err.println(exception);
        }
        
	}
	
		
	
}
