package expressaoRegular;

import java.util.regex.Pattern;

public class PrincipalExpressaoRegular {

	public static void main(String[] args) {
		
		
		if(Pattern.compile("[^a-z0-9\\._]").matcher("expressaoç").find()) {
			System.out.println("não pode conter caracter especial");
		}

	}

}
