package ejerciciosEnum;

public class Ejemplo4 {
    enum Equipo{
        Madrid, Bayer, Napoli, Chelsea, Milan, ManchesterCity;

        public void equipoInfo() {

        }
    }
    private void Equipo() {
        System.out.println("Constructor called for : " + this.toString());

    }
    public void equipoInfo(){
        System.out.println("La inteligencia gana campeonatod");
    }
    public class Test2 {
        public static void main(String[] args){
            Equipo Equipo1 =Equipo.Madrid;
            System.out.println(Equipo1);
            Equipo1.equipoInfo();
        }
    }
}
