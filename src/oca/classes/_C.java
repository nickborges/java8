package oca.classes;

public class _C {
	
	private static int $;
	
	{ System.out.println("setting field"); }
	
	public _C(){
		$ = 10;
		System.out.println("setting constructor");
	}
	
	public static void main(String args[]) {
		_C c = new _C();
		System.out.println(c.$);
		
				
	}

}
