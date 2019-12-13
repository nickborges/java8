package ocp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Teste{

    public static int computeClosestToZero(int[] ts) {
        if(ts.length <= 0 ){
            return 0;
        }

        int current;
        int aux = ts[0];

        Arrays.sort(ts);

        for (int i=0; i < ts.length; i++ ){
            current = ts[i] * ts[i];
            if (current <= (aux * aux) )  {
                aux = ts[i];
            }
        }
        return aux;
    }

    public static int[] towSumMap(int[] array, int k){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<array.length; i++){
            int aux = k - array[i];
            if(map.containsKey(aux)){//verifica se o valor da diferenta entre a constante k e o valor da posição atual do array já está no map.
                return new int[]{map.get(aux), i};//recupera do map a posição do valor da diferença entre k e o valor da posição atual do array, passando a posição do elemento atual cujo a soma com o elemento anterior resulta em k.
            }
            map.put(array[i], i);//armazena no map o valor atual conforme a posição do array.
        }
        return new int[]{};
    }

    public static void main(String args[]) {
        computeClosestToZero(new int[]{-3,-1,3,-2});

        int[] ret = towSumMap(new int[]{9,14,3,5,15,13,11,4,5,4}, 9);
        Arrays.stream(ret).forEach(f -> {
            System.out.println(f);
        });

    }
}
