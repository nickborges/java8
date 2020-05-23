#### List x Set
* List: interface que estende de Collection
    * adicionar um elemente: feito de forma incremental em ordem.
    * comparar um elemento: pelo método contains, feito elemento por elemento até encontrá-lo.
    * ArrayList, LinkedList
* Set: interface que estende de Collection
    * adicionar um elemente: feito de forma aleatória desordenado se usado HashSet(mais rápido que List) caso use LinkedHashSet fica ordenado;
    * comparar um elemento: pelo método contains, feito através de uma tabela de espalhamento através.
    * HashSet, LinkedHashSet, TreeSet
