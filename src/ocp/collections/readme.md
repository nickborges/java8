#### List x Set
* **Imutabilidade**
    * **List:** utilizar Collections.unmodifiableList
    * **Set:** utilizar Collections.unmodifiableSet
    
* **List: interface que estende de Collection**
    * adicionar um elemente: feito de forma incremental em ordem.
    * comparar um elemento: pelo método contains, busca elemento por elemento até encontrá-lo.
    * ArrayList: adiciona em ordem e a busca é feita elemento por elemento
    * LinkedList: adiciona em ordem
    
* **Set: interface que estende de Collection**
    * adicionar um elemente: feito de forma aleatória se usado HashSet(mais rápido que List) caso use LinkedHashSet fica ordenado;
    * comparar um elemento: pelo método contains, feito através de uma tabela de espalhamento busca o elemento mais rápido que a List.
    * HashSet: adiciona em ordem aleatória
    * LinkedHashSet: adiciona em ordem
    * TreeSet: ordena os seus elementos na hora da inserção. Qual é o critério da ordenação depende e pode ser definido através de um Comparator.
    
#### Resumo
* **List** é uma sequência, aceita elementos duplicados e a busca é feita comparando elemento por elemento. 
* **Set** éum conjunto, não aceita elementos duplicados e não define ordem(a inserção é feita aleatoriamente, se não for utilizado LinkedHashSet). 
