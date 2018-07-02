package interfaces;

/**
 * Java define uma interface funcional como uma interface que contém um único método abstrato.
 * As interfaces funcionais são usadas como base para expressões lambda na programação funcional.
 * @author nick.borges
 *
 */
@FunctionalInterface
public interface InterfaceFuncional {
	
	public boolean testeFuncional(ClasseAnimal animal);
	//public boolean testeFuncional(ClasseAnimal animal, ClasseAnimal2 animal2);
	public boolean equals(Object o);
	public String toString();	
	
}
