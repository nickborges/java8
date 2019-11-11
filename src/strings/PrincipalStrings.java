package strings;

public class PrincipalStrings {
	
	public static void main(String args[]) {

		//creating an String
		String s1 = "Fluffy"; //use String Poll
		String s2 = new String("Fluffy");//create a new String Object

		//reference memory
		System.out.println(s1 == s2); //false

		//concatenation
		System.out.println(1 + 2); //3
		System.out.println("a" + "b"); //ab
		System.out.println("a" + "b" + 3); //ab3
		System.out.println(1 + 2 + "c"); //3c
		System.out.println(s1 + 3); //Fluffy3
		s1 += 4;
		System.out.println(s1); //Fluffy4

			int three = 3;
			String four = "4";
			System.out.println(1 + 2 + three + four); //64

		//length() : int
		System.out.println(s1.length()); //7

		//charAt(index) : char
		System.out.println(s1.charAt(6)); //4
		//System.out.println(s1.charAt(7)); //StringIndexOutOfBoundsException

		//indexOf(int ch) : int or indexOf(int ch, int fromIndex): int
		//indexOf(String str) : int or indexOf(String str, int fromIndex) : int
		System.out.println(s1.indexOf(0)); //-1
		System.out.println(s1.indexOf("f")); //3
		System.out.println(s1.indexOf('f')); //3
		System.out.println(s1.indexOf('z')); //-1
		//System.out.println(s1.indexOf(null)); //NullPointerException
		System.out.println(s1.indexOf(9, 10)); //-1
		System.out.println(s1.indexOf("F", 3)); //-1
		System.out.println(s1.indexOf("f", 3)); //3
		System.out.println(s1.indexOf("f", 10)); //-1
		//System.out.println(s1.indexOf(null, 10)); //NullPointerException

		//substring(int startIndex) : String
		//substring(int startIndex, int endIndex) : String
		System.out.println(s1.substring(1)); //luffy
		//System.out.println(s1.substring(-1)); //StringIndexOutOfBoundsException
		System.out.println(s1.substring(1, 4)); //luf
		System.out.println(s1.substring(1, 1)); //blank
		//System.out.println(s1.substring(1, 0)); //StringIndexOutOfBoundsException

		//toLowerCase() : String
		//toUpperCase() : String
		System.out.println(s1.toLowerCase()); //fluffy
		System.out.println(s1.toUpperCase()); //FLUFFY

		//equals(Object obj) : boolean
		//equalsIgnoreCase(String str) : boolean
		System.out.println(s1.equals(null));
		System.out.println(s1.equals("Fluffy4")); //true
		System.out.println(s1.equals(new StringBuilder("Fluffy4"))); //false
		System.out.println(s1.equalsIgnoreCase("FlUffY4")); //true
		//System.out.println(s1.equalsIgnoreCase(new StringBuilder("FlUffY4")); //Error copilation
		System.out.println(s1.equalsIgnoreCase(null)); //NullPointerException

		//startsWith(String str) : boolean
		//endsWith(String str) : boolean
		System.out.println(s1.startsWith("F")); //true
		System.out.println(s1.startsWith("f")); //false
		System.out.println(s1.endsWith("4")); //true
		//System.out.println(s1.endsWith('4')); //Error compilation
		System.out.println(s1.endsWith(null)); //NullPointerException

		//contains(String str) : boolean
		System.out.println(s1.contains("F")); //true
		//System.out.println(s1.contains('F')); //Error compilation
		System.out.println(s1.contains("z")); //false
		System.out.println(s1.contains(null)); //NullPointerException

		//replace(String str1, String str2) : String
		System.out.println(s1.replace("f", "tt")); //Flutttty4
		System.out.println(s1.replace("ff", "tt")); //Flutty4
		System.out.println(s1.replace("F", "T")); //Tluffy4
		System.out.println(s1.replace('F', 'T')); //Tluffy4
		System.out.println(s1.replace('Z', 'T')); //Fluffy4
		System.out.println(s1.replace("F", null)); //NullPointerException

		//trim() : String
		s1 += "  ";
		System.out.println(s1.trim()); //Fluffy4


	}

	
}
