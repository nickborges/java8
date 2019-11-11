package oca.expressaoRegular;

import java.util.regex.Pattern;

public class PrincipalExpressaoRegular {

	public static void main(String[] args) {
		
		
		if(Pattern.compile("[^a-z0-9\\._]").matcher("expressao�").find()) {
			System.out.println("n�o pode conter caracter especial");
		}

	}

}
