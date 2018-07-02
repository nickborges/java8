package polimorfismo;

import java.io.Serializable;

public abstract class Primeiro implements Serializable{

	private static final long serialVersionUID = 6243142172662586615L;
	private static boolean status;
	
/*
	public static synchronized Primeiro getInstance() {

		if(instance == null)
			instance = new Primeiro() {
			private static final long serialVersionUID = 6243142172662586615L;
				@Override
				public boolean methodStatus(boolean param) {
					return param;
				}
			};
			
		return instance;
	}
	*/
/*
  static {
	try {
		instance = new Primeiro() {	
			private static final long serialVersionUID = -8572690396898899632L;
			@Override
			public boolean isStatus(boolean param) {
				status = param;
				return status;
			}
		};
	} catch(final Exception exception) {
		try {
			throw new Exception("Algo deu errado ao instanciar a classe");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}*/
	public abstract boolean methodStatus(boolean param);

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		Primeiro.status = status;
	}
	
	@Override
	public String toString() {
		return "Primeiro [isStatus()=" + isStatus() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}	
	
}
