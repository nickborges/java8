package functionAndBiFunction;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * --------------------------------------------------------------------------------------------------
 * 		Functional Interfaces	|	Parameters		|	Return Type		|	Single Abstract Method
 * --------------------------------------------------------------------------------------------------
 * 		Supplier<T>				|		0			|		T			|			get
 * 		Consumer<T>				|		1 (T)		|		void		|			accept
 * 		BiConsumer<T, U>		|		2 (T, U)	|		void		|			accept
 * 		Predicate<T>			|		1 (T)		|		boolean		|			test
 * 		BiPredicate<T, U>		|		2 (T, U)	|		boolean		|			test
 * 		Function<T, R>			|		1 (T)		|		R			|			apply
 * 		BiFunction<T, U, R>		|		2 (T, U)	|		R			|			apply
 * 		UnaryOperator<T>		|		1 (T)		|		T			|			apply
 * 		BinaryOperator<T>		|		2 (T, T)	|		T			|			apply
 *  --------------------------------------------------------------------------------------------------
 * 
 */
public class PrincipalFunctionBiFunction<T, U, R> {

/******************************************************************************************************************************/
	public T supplier(T param) {
		Supplier<T> supp = () -> (T) String.valueOf(param);
		System.out.println("Supplier<T>\t\t = " + supp.get());
		return supp.get();
	}
	
/******************************************************************************************************************************/	
	public void consumer(T param) {
		Consumer<T> cons = (o1) -> System.out.println("Consumer<T>\t\t = " + o1);
		cons.accept(param);
	}
	
	public void biConsumer(T param1, U param2) {
		BiConsumer<T, U> biCons = (o1, o2) -> System.out.println("BiConsumer<T, U> \t = " + "Param 1: " + o1 + " Param 2: " + o2);
		biCons.accept(param1, param2);
		
		Map<T, T> map = new HashMap<>();
		BiConsumer<T, T> b1 = map::put;
		BiConsumer<T, T> b2 = (k, v) -> map.put(k, v);
		
		b1.accept(param1, (T)param2);
		b2.accept(param1, (T)param2);
		
		System.out.println("BiConsumer<T, U> HashMap = " + map);
	}

/******************************************************************************************************************************/
	public boolean predicate(T param1) {
		Predicate<T> pred = (o1) -> o1 != null ? true : false;
		
		//Predicate<String> pred2 = String::isEmpty;
		
		System.out.println("Predicate<T> \t\t = " + pred.test(param1));
		return pred.test(param1);
	}
	
	public boolean biPredicate(T param1, U param2) {
		BiPredicate<T, U> biPred = (o1, o2) -> o1 != null || o2 != null ? true : false;
		System.out.println("BiPredicate<T, U> \t = " + biPred.test(param1, param2));
		return biPred.test(param1, param2);
	}
	
/******************************************************************************************************************************/
	public R function(T param) {
		Function<T, R> func = (o1) -> o1 != null ? (R)o1 : null; 
		
		System.out.println("Function<T, R>\t\t = " + func.apply(param));
		return func.apply(param);
	}
	
	public R biFunction(T param1, U param2) {
		BiFunction<T, U, R> bifunc = (o1, o2) -> (o1 != null && o2 != null) && o2 instanceof HashMap ? (R)o2: (R)o1;
		
		if(bifunc.apply(param1, param2) instanceof HashMap) {
			
			Map<T, T> map = new HashMap<>();
			//BiFunction<T, T, R> b1 = (R) map::put;
			BiFunction<T, T, R> b2 = (k, v) -> (R)map.put(k, v);
			b2.apply(param1, (T)param2);
			System.out.println("BiFunction<T, U, R> HashMap = " + map);
			
			/************************************************************/
			
			System.out.println("BiFunction<T, U, R> HashMap = abaixo");
			HashMap mapa = (HashMap) bifunc.apply(param1, param2);
			mapa.forEach((f1, f2) -> System.out.println("Chave:" + f1 + " Valor: " + f2));
			
			return (R) mapa;
			
		} else {
			System.out.println("BiFunction<T, U, R>\t = " + bifunc.apply(param1, param2));
			return bifunc.apply(param1, param2);		
		}
	}
	
/******************************************************************************************************************************/	
	public T unaryoperator(T param1) {
		UnaryOperator<T> unar = (o1) -> o1 != null ?  o1 : null; // o retorno é do mesmo tipo do parametro de entrada, não precisa de (cast)
		System.out.println("UnaryOperator<T> \t = " + unar.apply(param1));
		return unar.apply(param1);
	}
	
	public T binaryoperator(T param1, T param2) {
		BinaryOperator<T> binar = (o1, o2) -> o1 != null || o2 != null ? (T) new String(String.valueOf(o1)).concat(" - ".concat(String.valueOf(o2))) : (T) "false";
		System.out.println("BinaryOperator<T> \t = " + binar.apply(param1, param2));
		return binar.apply(param1, param2);
		
	}

/******************************************************************************************************************************/	

	public static void main(String args[]) {
		
		try{
			PrincipalFunctionBiFunction<String, String, String> p = new PrincipalFunctionBiFunction<>();
			p.supplier("2000000_saas");
			p.consumer(String.valueOf(99999));
			p.biConsumer("AAA", "BCD");
			p.predicate(null);
			p.biPredicate("aa", null);
			p.function(String.valueOf(new BigDecimal(100)));
			p.biFunction("C", "2");
			p.unaryoperator("WAsasas");
			p.binaryoperator("asdasda", null);
			
			
			PrincipalFunctionBiFunction<Integer, Map, String> p2 = new PrincipalFunctionBiFunction<>();
			Map mapa = new HashMap<>();
			mapa.put(0, "A");
			mapa.put(1, "B");
			mapa.put(2, "C");
			mapa.put(3, "D");
			
			p2.biFunction(0, mapa);
			
		} catch(final Exception exception) {
			System.err.println(exception);
			
		}
	}	
	
}
