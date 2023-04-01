package ejerciciosEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ejemplo9 {



    public class Animals{
        public static void main(String[] args) {
            List<String> lAnimals = new ArrayList<>(Arrays.asList("6.000kg","elefante","mamifero"));

            for (int i=0; i<lAnimals.size();i++){
                System.out.println(lAnimals.get(i) + "<==>");
            }

            System.out.println();

            for (String str: lAnimals)
                System.out.println(str);

            Iterator<String> iterador = lAnimals.iterator();
            while (iterador.hasNext()) {
                String elemento = iterador.next();
                System.out.println(elemento + "--");
            }
        }
    }
}
