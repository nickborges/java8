package oca.interfaces;

public class PrincipalFuncional {
	
	private static Object carryOutWork(ClasseAnimal animal, InterfaceFuncional interfaceFuncional) {
		
		// Esta express�o significa que Java deve chamar um m�todo com um par�metro Animal que retorna um valor, neste caso boolean. Pode ser String, inteiro e etc..
		if (interfaceFuncional.testeFuncional(animal)) {
			System.out.println("Objeto Animal true = ");
			return animal;
		} else {
			System.out.println("Objeto Animal false = ");
			return animal;
		}
	}
	
	private static Object carryOutWork(ClasseAnimal2 animal2, InterfaceFuncional2 interfaceFuncional) {
		// Esta express�o significa que Java deve chamar um m�todo com um par�metro Animal que retorna um valor, neste caso boolean. Pode ser String, inteiro e etc..
		if (interfaceFuncional.testeFuncional(animal2) >= 2) {
			System.out.println("Objeto Animal com 2 anos ou mais = ");
			return animal2;
		} else {
			System.out.println("Objeto Animal com menos de 2 anos = ");
			return animal2;
		}
	}
	
	public static void main(String args[]) {
		
		/**
		 * Uma vez que o m�todo desta interface recebe um Animal,
		 * significa que o par�metro lambda deve ser um Animal
		 * e como o m�todo da interface retorna um booleano, sabemos que o lambda retorna um booleano.
		 * 
		 * Lado ESQUERDO do operador de seta -> indica os par�metros de entrada para a express�o lambda.
		 * Pode ser consumido por uma interface funcional cujo m�todo abstrato possui o mesmo n�mero de par�metros e tipos de dados compat�veis.
		 * 
		 * Lado DIREITO � referido como o corpo da express�o lambda.
		 * Ele pode ser consumido por uma interface funcional cujo m�todo abstrato retorna um tipo de dados compat�vel.
		 * 
		 * Especificamos um �nico par�metro com o nome b, d, g e etc....
		 * 	O operador de seta -> (tamb�m chamado de arrow function) separa o par�metro do corpo.
		 * 	O corpo chama um �nico m�todo e retorna o resultado desse m�todo.
		 */
		System.out.println( carryOutWork(new ClasseAnimal("fish", 5.5F, 1, false), b -> b.isExiste() ).toString());
		
		System.out.println( carryOutWork(new ClasseAnimal("dog", 6F, 2, true), d -> d.isExiste() ).toString());
		
		System.out.println( carryOutWork(new ClasseAnimal(), g -> g.isExiste()).toString() );
		
		//outro modo de fazer
		System.out.println( carryOutWork(new ClasseAnimal(), (ClasseAnimal a) -> {return a.isExiste();} ).toString() );
		System.out.println( carryOutWork(new ClasseAnimal(), z -> {return z.isExiste();} ).toString() );
		//System.out.println( carryOutWork(new ClasseAnimal(), (ClasseAnimal x, ClasseAnimal2 y) -> y.isExiste() ) );
		
		System.out.println( carryOutWork(new ClasseAnimal2("Elefante", 100000F, 11, true), z -> {return z.getIdade();} ).toString() );
		
	}
	
}
