package oca.enums;

public class PrincipalEnum {

	private static void enumConvert(){
		Boolean result1 = EnumStringToBoolean.fromString("S");
		Boolean result2 = EnumStringToBoolean.fromString("N");
		System.out.println(result1);
		System.out.println(result2);

		String result3 = EnumBooleanToString.fromBoolean(Boolean.TRUE);
		String result4 = EnumBooleanToString.fromBoolean(Boolean.FALSE);
		System.out.println(result3);
		System.out.println(result4);
	}

	public static void main(String args[]){

		//ClasseEnum.SPRING.printHours();
		//System.out.println(ClasseEnum2.COD001.getCodigo());
		ClasseEnum2 array[] = ClasseEnum2.values();
		System.out.println(array[1].getCodigo());

		enumConvert();
	}
}
