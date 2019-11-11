package oca.interfaces;

public class ClasseFilhaFuncional implements InterfaceFuncional{

	@Override
	public boolean testeFuncional(ClasseAnimal animal) {
		return animal.isExiste();
	}

	@Override
	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}
	
}
