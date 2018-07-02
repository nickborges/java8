package arraysAndMap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class PrincipalMap{

	
	public static void main(final String args[]) {
		
		Map<Integer,String> hashMap = new HashMap<>();
		hashMap.put(0, "A");
		hashMap.put(1, "B");
		hashMap.put(2, null);
		
		hashMap.putIfAbsent(1, "D"); //putIfAbsent() verifica se já tem valor setado na mesma chave 
		hashMap.putIfAbsent(2, "E");
		hashMap.putIfAbsent(3, "F");
		
		System.out.println(hashMap);
		
		
	}
}
