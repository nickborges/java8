#### List x Set
* **Imutabilidade**
    * **List:** utilizar Collections.unmodifiableList
    * **Set:** utilizar Collections.unmodifiableSet
    
* **List: interface que estende de Collection**
    * adicionar um elemente: feito de forma incremental em ordem.
    * comparar um elemento: pelo método contains, feito elemento por elemento até encontrá-lo.
    * ArrayList: adiciona em ordem
    * LinkedList: adiciona em ordem
    
* **Set: interface que estende de Collection**
    * adicionar um elemente: feito de forma aleatória desordenado se usado HashSet(mais rápido que List) caso use LinkedHashSet fica ordenado;
    * comparar um elemento: pelo método contains, feito através de uma tabela de espalhamento busca o elemento mais rápido que a List.
    * HashSet: adiciona em ordem aleatória
    * LinkedHashSet: adiciona em ordem
    * TreeSet: ?
    
#### Resumo
* List é uma sequência e aceita elementos duplicados. Set não aceita duplicados e não define ordem(se não for utilizado LinkedHashSet). 
