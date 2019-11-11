package oca.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author nick.borges
 * @param <T>
 * ***************************************************
 * E for an element
 * K for a map key
 * V for a map value
 * N for a number
 * T for a generic data type
 * S, U, V, and so forth for multiple generic types
 * ***************************************************
 */
public class ClasseGenericaT_U<T, U> {

	private T atributo;
	private U multAtributo;
	private Map<T, U> listaTU;
	
	public ClasseGenericaT_U() {
		listaTU = new HashMap<>();
	}
	
	public void populaLista(T param1, U param2) {
		listaTU.put(param1, param2); 
	}
	
	public void imprimeValuesMap(final Map<T,U> map) {
		System.out.println(":: imprimeValuesMap ::");
		if(map != null) {
			Object[] obj = map.values().toArray();
			for(int i=0; i<obj.length; i++) {
				ArrayList<String> array = (ArrayList<String>) obj[i];
				array.forEach(c -> System.out.println(c));
			}
		}
	}
	
	public List retornaListaValuesMap(final Map<T,U> map) {
		System.out.println(":: retornaListaValuesMap ::");
		List lista = new ArrayList();
		if(map != null) {
			Object[] obj = map.values().toArray();
			for(int i=0; i<obj.length; i++) {
				lista = new ArrayList();
				lista = (List) obj[i];
				lista.sort( (Object o1, Object o2) -> String.valueOf(o1).compareTo(String.valueOf(o2)) );//ordena
				lista.forEach(c -> System.out.println(c));
			}
		}
		return lista;
	}
	
	public List retornaListaValuesMap(final int chave, final Map<T,U> map) {
		System.out.println(":: retornaListaValuesMap ::");
		List lista = new ArrayList();
		if(chave >= 0 && map != null) {
			lista = (ArrayList) map.get(chave);
			lista.forEach(c -> System.out.println(c));
		}
		return lista;
	}
	
	public T getAtributo() {
		return atributo;
	}

	public void setAtributo(T atributo) {
		this.atributo = atributo;
	}

	public U getMultAtributo() {
		return multAtributo;
	}

	public void setMultAtributo(U multAtributo) {
		this.multAtributo = multAtributo;
	}

	public Map<T, U> getListaTU() {
		return listaTU;
	}

	public void setListaTU(Map<T, U> listaTU) {
		this.listaTU = listaTU;
	}
	
	
	
	
}
