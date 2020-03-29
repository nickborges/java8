package oca.strings;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringStream {

    public static void main(String args[]){

        String f2 = "003ç9ç[1-10-50,2-30-2.50,3-40-3.10]çPedro";

        //String[] d1 = f2.split("ç");
        //String d2 = d1[1];
        // System.out.println(d2);

        List list = Arrays.asList(f2.substring(f2.indexOf("["), f2.indexOf("]")+1)
                .replace("[", "")
                .replace("]", "")
                .replace(",", "-")
                .split("-")).stream().collect(Collectors.toList());

        int mod = list.size()-1;
        if(mod % 2 != 0){
            System.out.println("parametro faltando " + mod);
        } else {


            int aux = 0;
            double sum = 0;
            for (Object aa : list) {
                aux++;
                if (aux % 3 == 0) {
                    sum += Double.parseDouble(list.get(aux - 1).toString());
                }
            }
            System.out.println(sum);
        }
    }
}
