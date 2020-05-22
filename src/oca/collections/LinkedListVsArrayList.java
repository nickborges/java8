package oca.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Onde uma ArrayList é lenta? Quando você for, por exemplo, inserir um novo elemento na primeira posição. Pois a implementação vai precisar mover todos os elementos que estão no começo da lista para a próxima posição.
 * Onde LinkedList é lenta? se você precisar acessar um determinado elemento, pois a implementação precisará percorrer todos os elementos até chegar ao décimo quinto, por exemplo.
 *
 * Onde LinkedList é rápida? ao inserir ou remover elementos da primeira posição.
 * Onde ArrayList é rápido? ao buscar um elemento em qualquer posição, internamente usa uma array para guardar os elementos. É muito eficiente ao buscar elementos pois invoca o método get(indice).
 *
 */
public class LinkedListVsArrayList {


    /*
     * removendo 100 elementos sempre na primeira posição
     */
    private static long removePrimeirosElementos(List<Integer> numeros) {
        long ini = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            numeros.remove(0); //removendo sempre o primeiro elemento
        }
        long fim = System.currentTimeMillis();
        return fim-ini;
    }

    private static long insereElementosNo(List<Integer> numeros, int quantidade) {
        long ini = System.currentTimeMillis();
        for (int i = 0; i < quantidade; i++) {
            numeros.add(i);
        }
        long fim = System.currentTimeMillis();
        return fim-ini;
    }

    private static long insereElementosInicio(List<Integer> numeros, int quantidade) {
        long ini = System.currentTimeMillis();
        for (int i = 0; i < quantidade; i++) {
            numeros.add(0);
        }
        long fim = System.currentTimeMillis();
        return fim-ini;
    }

    private static long getElemento(List<Integer> numeros, int posicao){
        long ini = System.currentTimeMillis();
        Integer elemento = numeros.get(posicao);
        long fim = System.currentTimeMillis();
        return fim-ini;
    }

    public static void main(String[] args) {

        System.out.println("**** ArrayList vs LinkedList ***");

        List<Integer> numerosArrayList = new ArrayList<>();
        List<Integer> numerosLinkedList = new LinkedList<>();
        int quantidadeElementos = 1000000;

        //inserção no fim da lista
        String tempoArrayList  = String.valueOf(insereElementosNo(numerosArrayList, quantidadeElementos)).concat("ms");
        String tempoLinkedList = String.valueOf(insereElementosNo(numerosLinkedList, quantidadeElementos)).concat("ms");

        System.out.println("Inserção na ArrayList demorou  " + tempoArrayList);
        System.out.println("Inserção na LinkedList demorou " + tempoLinkedList);

        //inserção no inicio da lista
        tempoArrayList  = String.valueOf(insereElementosInicio(numerosArrayList, quantidadeElementos)).concat("ms");
        tempoLinkedList = String.valueOf(insereElementosInicio(numerosLinkedList, quantidadeElementos)).concat("ms");

        System.out.println("Inserção no início da ArrayList demorou  " + tempoArrayList);
        System.out.println("Inserção no início da LinkedList demorou " + tempoLinkedList);

        //remoção elemento da lista
        tempoArrayList = String.valueOf(removePrimeirosElementos(numerosArrayList)).concat("ms");
        tempoLinkedList = String.valueOf(removePrimeirosElementos(numerosLinkedList)).concat("ms");

        System.out.println("Remoção da ArrayList demorou  " + tempoArrayList);
        System.out.println("Remoção da LinkedList demorou " + tempoLinkedList);

        //busca elemento da lista
        tempoArrayList = String.valueOf(getElemento(numerosArrayList, 10000)).concat("ms");
        tempoLinkedList = String.valueOf(getElemento(numerosLinkedList, 10000)).concat("ms");

        System.out.println("Busca da ArrayList demorou  " + tempoArrayList);
        System.out.println("Busca da LinkedList demorou " + tempoLinkedList);
    }

}
