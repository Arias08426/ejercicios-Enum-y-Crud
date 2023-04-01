package ejerciciosEnum;
import java.util.ArrayList;
import java.util.List;
public class Ejemplo8 {
    public class listaAutos{
        public static void main (String[]args){
        List<String> al = new ArrayList<>();
        al.add ("Mercedez");
        al.add("Mazda");
        al.add("Ferrari");

        boolean isPresent = al.contains("Ferrari");
            System.out.println("Is Ferrari present in the list " + isPresent);
    }
    }
}
