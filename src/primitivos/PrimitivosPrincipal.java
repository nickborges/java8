package primitivos;

import java.math.BigInteger;

public class PrimitivosPrincipal {

	public static void main(String arg[]) {
		/*primitivos*/
		boolean booleann = true;
		byte	bytee	 = 127;					// 8-bit - 127 � o limite
		short	shortt	 = 29999;				// 16-bit - 29999 � o limite
		char	charr	 = 'a';					//16-bit
		int 	intt	 = 1999999999;			// 32-bit
		long 	longg	 = 8999999999999999999L;// 64-bit
		float 	floatt	 = 299999999999999999999999999999999999999.99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999F;//32-bit
		double	doublee	 = 99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999D; // 64-bit

	
		System.out.println(booleann 
				+ "\n" + bytee 
				+ "\n" + shortt 
				+ "\n" + intt 
				+ "\n" + longg 
				+ "\n" + floatt 
				+ "\n" + doublee 
				+ "\n" + charr);
		/*primitivos*/
				
		
		/*Object*/
		String aa = "asas";
		BigInteger bigint = new BigInteger("a", 1);
		
		System.out.println(bigint.toString());
		/*Object*/

		//Nomenclatura
		boolean Boolean = true;
		byte Byte = 1;
		char Character = 'a';
		short Short = 2;
		int Integer = 0;
		long Long = 5;
		float Float = 10;
		double Double = 0;



	}
}
