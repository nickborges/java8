package oca.cloneable;

public class CloneablePrincipal {

	public static void main(String args[]) {

		try {
			ExemploCloneable original = new ExemploCloneable();
			original.setNome("AA");
			
			ExemploCloneable clone = (ExemploCloneable) original.clone();
			clone.setNome("BB");
			
			System.out.println("Orginal = " + original);
			System.out.println("Clone = " + clone);
		} catch(final Exception exception){
			
		}
	}
}
