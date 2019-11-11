package oca.arraysAndMap;

import java.util.HashMap;
import java.util.Map;

public class PrincipalMap{

	
	public static void main(final String args[]) {
		
		Map<Integer,String> hashMap = new HashMap<>();
		hashMap.put(0, "A");
		hashMap.put(1, "B");
		hashMap.put(2, null);
		
		hashMap.putIfAbsent(1, "D"); //putIfAbsent() verifica se j� tem valor setado na mesma chave 
		hashMap.putIfAbsent(2, "E");
		hashMap.putIfAbsent(3, "F");
		
		System.out.println(hashMap);
		
		
	}
}
