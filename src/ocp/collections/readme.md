#### List x Set
* **Imutabilidade**
    * **List:** utilizar no método get o retorno Collections.unmodifiableList
    * **Set:** utilizar no método get o retorno Collections.unmodifiableSet
    
* **List: interface que estende de Collection**
    * **ArrayList:** adiciona em ordem
    * **LinkedList:** adiciona em ordem
    * **adicionar um elemente:** feito de forma incremental em ordem.
    * **comparar um elemento:** pelo método contains, busca elemento por elemento até encontrá-lo.
    * **Onde uma ArrayList é lenta?** 
      * Ao inserir ou remover um elemento no no início ou no meio da lista. Pois a implementação vai precisar reordenar as posições(index) dos elementos.
    * **Onde LinkedList é lenta?** 
      * Ao buscar elemento em uma determinada posição, precisará percorrer todos os elementos até chegar a posição desejada.
    * **Onde ArrayList é rápido?** 
      * Ao buscar um elemento em qualquer posição, internamente usa um array para guardar os elementos. É muito eficiente ao buscar elementos pois invoca o método get(indice).
    * **Onde LinkedList é rápida?**
      * Ao inserir ou remover elementos da primeira posição.
    
* **Set: interface que estende de Collection**
    * **adicionar um elemente:** feito de forma aleatória se usado HashSet(mais rápido que List) caso use LinkedHashSet fica ordenado e não aceita elementos repetidos;
    * **comparar um elemento:** pelo método contains, feito através de uma tabela de espalhamento busca o elemento mais rápido que a List.
    * **HashSet:** adiciona em ordem aleatória
    * **LinkedHashSet:** adiciona em ordem
    * **TreeSet:** ordena os seus elementos na hora da inserção. Qual é o critério da ordenação depende e pode ser definido através de um Comparator.
        
#### Resumo
* **List:** 
    * É uma sequência, aceita elementos repetidos.
    * Vantagens:
        * Buscar um elemento é feita rapidamente pois é indexada.
    * Desvantagens:
        * Adicionar e Remover elementos, se for em uma determinada posição que não a última vai reordenar todas as posições(index) de cada elemento.
        * contains, a comparação do elemento é mais lenta que o do Set pois é feita elemento por elemento.
        * remove, a remoção do elemento é mais lenta que o do Set pois é feita elemento por elemento.
     
* **Set:**
    * É um conjunto, não aceita elementos repetidos.
    * Vantagens:
        * Adicionar e Remover elementos, mais rápida que o da List pois não existe uma ordenação é feito através de uma tabela de espalhamento(Conjunto).
        * contains, a comparação deste método é mais rápida que o da List pois não existe uma ordenação é feito através de uma tabela de espalhamento.
        * remove, também é mais rápida que o da List pois não existe uma ordenação é feito através de uma tabela de espalhamento(Conjunto).
    * Desvantagens:
        * Buscar um elemento, não existe o método get.
        * Adicionar elementos, não define ordem(a inserção é feita aleatoriamente, se não for utilizado LinkedHashSet).
        
        

