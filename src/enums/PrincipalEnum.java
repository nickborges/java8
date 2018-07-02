package enums;

public class PrincipalEnum {

	public static void main(String args[]){
		
		//ClasseEnum.SPRING.printHours();
		//System.out.println(ClasseEnum2.COD001.getCodigo());
		ClasseEnum2 array[] = ClasseEnum2.values();
		System.out.println(array[1].getCodigo());
	}
}
