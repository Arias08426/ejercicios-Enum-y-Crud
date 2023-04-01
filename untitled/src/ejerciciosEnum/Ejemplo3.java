package ejerciciosEnum;

public class Ejemplo3 {
    enum Demarcacion{
        Portero, Defensa, Centrocampista, Delantero;
    }

    public class test{
        public static void main(String[] args){
            Demarcacion arr[] = Demarcacion.values();

            for (Demarcacion demarcacion : arr) {
                System.out.println(demarcacion + "at index" + demarcacion.ordinal());

            }
            System.out.println(Demarcacion.valueOf("Defensa"));
        }
    }
}
