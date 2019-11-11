package oca.classesAninhadas;

public class ClasseAninhada {

	protected static class Inner{
		private String aa = "Mensagem da classe Inner!";
		
		public void imprime() {
			System.out.println(aa);
		}
	}
}
