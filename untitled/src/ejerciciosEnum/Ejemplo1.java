package ejerciciosEnum;

public  class Ejemplo1 {
    public enum Estaciones {
        PRIMAVERA, VERANO, INVIERNO, OTOÑO
    }

    class Main {
        public static void main(String[] args) {
            Estaciones miEstacion = Estaciones.INVIERNO;
            System.out.println(miEstacion);
        }
    }
}