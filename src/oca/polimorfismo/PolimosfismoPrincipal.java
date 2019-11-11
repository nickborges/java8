package oca.polimorfismo;

public class PolimosfismoPrincipal extends Primeiro implements Segundo{
	
	public static void main(String args[]) {
		
		try {
			PolimosfismoPrincipal p = new PolimosfismoPrincipal();
			
			p.setStatus(true);
			System.out.println("p = " + p.toString());
			
	
		} catch(final Exception exception) {
			System.out.println(exception);
		}
	
	}

	@Override
	public boolean metodoSegundoInterface() {
		return false;
	}
	
	@Override
	public boolean methodStatus(boolean param) {
		return param;
	}
	
}
