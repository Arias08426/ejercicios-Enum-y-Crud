package ejerciciosEnum;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo7 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();

        l1.add(4,5);
        l1.add(5,6);
        System.out.println(l1);

        List<Integer> l2 = new ArrayList<>();
        l2.add(7);
        l2.add(8);
        l2.add(9);
        l1.addAll(7,l2);
        System.out.println(l1);

        l1.remove(7);
        System.out.println(l1);

        System.out.println(l1.get(9));

        l1.set(0,8);
        System.out.println(l1);
    }
}
