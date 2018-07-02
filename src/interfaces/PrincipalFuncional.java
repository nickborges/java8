package interfaces;

public class PrincipalFuncional {
	
	private static Object carryOutWork(ClasseAnimal animal, InterfaceFuncional interfaceFuncional) {
		
		// Esta expressão significa que Java deve chamar um método com um parâmetro Animal que retorna um valor, neste caso boolean. Pode ser String, inteiro e etc..
		if (interfaceFuncional.testeFuncional(animal)) {
			System.out.println("Objeto Animal true = ");
			return animal;
		} else {
			System.out.println("Objeto Animal false = ");
			return animal;
		}
	}
	
	private static Object carryOutWork(ClasseAnimal2 animal2, InterfaceFuncional2 interfaceFuncional) {
		// Esta expressão significa que Java deve chamar um método com um parâmetro Animal que retorna um valor, neste caso boolean. Pode ser String, inteiro e etc..
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
		 * Uma vez que o método desta interface recebe um Animal,
		 * significa que o parâmetro lambda deve ser um Animal
		 * e como o método da interface retorna um booleano, sabemos que o lambda retorna um booleano.
		 * 
		 * Lado ESQUERDO do operador de seta -> indica os parâmetros de entrada para a expressão lambda.
		 * Pode ser consumido por uma interface funcional cujo método abstrato possui o mesmo número de parâmetros e tipos de dados compatíveis.
		 * 
		 * Lado DIREITO é referido como o corpo da expressão lambda.
		 * Ele pode ser consumido por uma interface funcional cujo método abstrato retorna um tipo de dados compatível.
		 * 
		 * Especificamos um único parâmetro com o nome b, d, g e etc....
		 * 	O operador de seta -> (também chamado de arrow function) separa o parâmetro do corpo.
		 * 	O corpo chama um único método e retorna o resultado desse método.
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
