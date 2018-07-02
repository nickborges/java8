package generics;

import java.util.ArrayList;
import java.util.List;

public class PrincipalGeneric<E> {
	
	public static void main(String args[]){
		
		try {
		/****************************************/
			ClasseGeneric_E u = new ClasseGeneric_E<>();
	
			List<String> lista = new ArrayList<String>();
			lista.add("B");
			lista.add("A");
			lista.add("D");
			lista.add("C");
			
			u.genericOrderLambda(lista);
			lista.forEach(c -> System.out.print(c));
			
		/****************************************/
			System.out.println("\n");
		/****************************************/
			
			List<Integer> inteiro = new ArrayList<Integer>();
			inteiro.add(3);
			inteiro.add(2);
			inteiro.add(4);
			inteiro.add(1);
			
			Object[] aa = u.metodoGenerico(inteiro.toArray());
			for(Object obj: aa)
				System.out.print(obj);
			
		/****************************************/
			System.out.println("\n");
		/****************************************/	
		
			ClasseGenericaT_U tu = new ClasseGenericaT_U<>();
			
			List<String> listaTU = new ArrayList<String>();
			listaTU.add("kk");
			listaTU.add("2c");
			listaTU.add("Ca");
			
			for(int i=0; i<5; i++)
				tu.populaLista(i, listaTU);
	
			tu.getListaTU().forEach((c, cc) -> System.out.println("Chave: " + c + " Lista: " +cc));
						
			tu.imprimeValuesMap(tu.getListaTU());
			
			tu.retornaListaValuesMap(tu.getListaTU());
			
			tu.retornaListaValuesMap(1, tu.getListaTU());
			
		} catch(final Exception exception) {
			System.err.println(exception.getMessage());			
		}
		
	}

}
