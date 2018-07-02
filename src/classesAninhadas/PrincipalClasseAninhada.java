package classesAninhadas;

import classesAninhadas.ClasseAninhada.Inner;

public class PrincipalClasseAninhada {
	
	public static void main(final String args[]) {
		
		Inner inner = new Inner();
		inner.imprime();
		
		ClasseAninhadaAbstrata abs = new ClasseAninhadaAbstrata();
		System.out.println(abs.retornoMetodoAbstrato());
	}

}
