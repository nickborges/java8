package oca.classesAninhadas;

public class ClasseAninhadaAbstrata {

	abstract class ClasseInnerAbstrata{
		abstract Object imprime();
	}
	
	public Object retornoMetodoAbstrato() {
		ClasseInnerAbstrata abs = new ClasseInnerAbstrata() {
			
			@Override
			Object imprime() {
				return "retorno aqui do medodo da classe aninhada abstrata!";
			}
		};
		return abs.imprime();
	}
}
