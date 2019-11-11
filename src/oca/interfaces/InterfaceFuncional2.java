package oca.interfaces;

/**
 * Java define uma interface funcional como uma interface que cont�m um �nico m�todo abstrato.
 * As oca.interfaces funcionais s�o usadas como base para express�es lambda na programa��o funcional.
 * @author nick.borges
 *
 */
@FunctionalInterface
public interface InterfaceFuncional2 {
	
	public int testeFuncional(ClasseAnimal2 animal2);
	//public boolean testeFuncional(ClasseAnimal animal, ClasseAnimal2 animal2);
	public boolean equals(Object o);
	public String toString();	
	
}
