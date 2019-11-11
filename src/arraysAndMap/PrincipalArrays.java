package arraysAndMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalArrays {

	public static void teste(Object... param) {
		for(Object par: param) {
			System.out.println(par != null ? par.toString() : " null ");
		}
	}
	
	public static void arrayString(final Object... param){
		String emails = "";
		for(Object obj: param){
			emails = emails.concat(obj.toString()).concat(", ");
		}
		
		System.out.println(emails.substring(0, emails.length() - 2));
	}

	public static void varargs(String... s){}
	public static void array(String[] s){}

	public static void main(String[] args) {
		varargs("a", "b");
		varargs(new String[]{"a"});
		array(new String[]{"a"});


		//PrincipalArrays.teste(Arrays.asList("a", Arrays.asList("b")));

		//PrincipalArrays.arrayString(Arrays.asList("a", "b").toArray());

		/*List<String> a = new ArrayList<String>();

		a.add("D");
		a.add("A");
		a.add("B");
		a.add("7");*/

		/*System.out.println("\nOriginal\n" + Arrays.deepToString(a.toArray()));
		Collections.sort(a);
		System.out.println("\nCollections.sort(a);\n" + Arrays.deepToString(a.toArray()));

		System.out.println();

		//sort lambda
		List<String> b = new ArrayList<String>();
		b.add("D");
		b.add("A");
		b.add("B");
		b.add("7");

		System.out.println("\nOriginal\n" + b);
		b.sort((String o1, String o2) -> o1.compareTo(o2));
		System.out.println("\nb.sort((String o1, String o2) -> o1.compareTo(o2));\n" + b);
		*/


		/*List<Person> personList = new ArrayList<>();
		personList.add(new Person("Virat", "Kohli"));
		personList.add(new Person("Arun", "Kumar"));
		personList.add(new Person("Rajesh", "Mohan"));
		personList.add(new Person("Rahul", "Dravid"));

		for(Person p: personList)
			System.out.println(p.getA());

		Collections.sort(personList, (Person p1, Person p2) -> p1.getA().compareTo(p2.getA()));

		for(Person p: personList)
			System.out.println(p.getA());*/






	}

}
