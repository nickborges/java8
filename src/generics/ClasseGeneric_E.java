package generics;

import java.util.Arrays;
import java.util.List;

public class ClasseGeneric_E<E> {

	/******** JAVA 8_LAMBDA ********/
	public void genericOrderLambda(List<E> obj) throws Exception{		
		try {
			validaPosicaoListaNull(obj);
			obj.sort((E o1, E o2) -> o1.toString().compareTo(o2.toString()));		
		} catch(final Exception exception) {
			throw new Exception(exception);
		}
	}
	
	public void validaPosicaoListaNull(List<E> lista) throws Exception {
		int aux = 0;
		if(lista != null && lista.size() > 0)
			for(E lis: lista) {
				if(lis == null)
					throw new Exception("Lista com valor nulo na posição = " + aux);
				aux++;
			}
		else
			throw new Exception("Lista vazia!");
	}
		
	/******** JAVA 8 ********/
	public Object[] metodoGenerico(E...obj) throws Exception{
		Object array[] = {};
		try {
			validaPosicaoArrayNulo(obj);		
			Arrays.sort(obj);
			array = obj.clone();			
		} catch(final Exception exception) {
			throw new Exception(exception);
		}
		
		return array;
	}
	
	public void validaPosicaoArrayNulo(final E...array) throws Exception{
		int aux = 0;
		if(array != null && array.length > 0) {
			for(E arr: array) {
				if(arr == null)
					throw new Exception("Array com valor nulo na posição = " + aux);
				aux++;
			}
		} else {
			throw new Exception("Array vazio!");
		}
	}
}
