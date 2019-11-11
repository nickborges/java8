package oca.recursivo;

public class PrincipalRecursivo {

	public static int count = 0;
	
	/**
	 * 
	 * 5 ->	11	+	5 	=	16
	 * 4 -> 7	+	4	=	11
	 * 3 -> 4	+	3	=	7
	 * 2 -> 2 	+	2	=	4
	 * 1 -> 1 	+	1	=	2
	 * 
	 */
	public static int metodoRecursivo(int a) {
			if(a == 0)
				return 1;
			
			return a + metodoRecursivo(a - 1);//como se fosse uma pilha vai inserindo o valor de "a" e quando for zero come�a a retornar os dados de baixo pra cima
			
	}
	
	
	/**
	 * 5 ->	24	* 5 = 120
	 * 4 -> 6	* 4 = 24
	 * 3 -> 2	* 3 = 6
	 * 2 -> 1	* 2 = 2
	 * 1 -> 1	* 1 = 1
	 */
	public static int metodoRecursivoFatorial(int a) {
		if(a == 0)
			return 1;
		
		return a * metodoRecursivoFatorial(a - 1);
	}
	
	
	public static int metodoRecursivoBoolean(boolean a) {
		count++;
		if(count == 5)
			a = false;
		
		if(a == false)
			return 1;
		
		return count + metodoRecursivoBoolean(a);
	}
	
	
	public static void main(String args[]) {
		System.out.println(PrincipalRecursivo.metodoRecursivo(5));
		
		System.out.println(PrincipalRecursivo.metodoRecursivoFatorial(5));
	
		System.out.println(PrincipalRecursivo.metodoRecursivoBoolean(true));
	}
	
}
