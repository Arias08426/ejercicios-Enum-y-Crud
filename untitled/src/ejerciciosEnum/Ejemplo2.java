package ejerciciosEnum;

public class Ejemplo2 {
enum Meses{
    Enero,
    Febrero,
    Marzo,
    Abril,
    Mayo,
    Junio,
    Julio,
    Agosto,
    Septiembre,
    Octubre,
    Noviembre,
    Diciembre;
}
public class Test{
    Meses meses;
    public Test(Meses meses){this.meses=meses;}

    public void mesesIslike(){
        switch (meses) {
            case Enero:
                System.out.println("Fiesta de Reyes");
                break;
            case Febrero:
                System.out.println("Día de San Valentín");
                break;
            case Marzo:
                System.out.println("Día Internacional de la Mujer");
                break;
            case Abril:
                System.out.println("Día Mundial de la Salud en la Organización Mundial de la Salud");
                break;
            case Mayo:
                System.out.println("Día de la Madre");
                break;
            case Junio:
                System.out.println("Día del Padre");
                break;
            case Julio:
                System.out.println("Día del Dibujante");
                break;
            case Agosto:
                System.out.println("Día del Ingeniero.");
                break;
            case Septiembre:
                System.out.println("Día de Amor y Amistad.");
                break;
            case Octubre:
                System.out.println("Día de los Tecnólogos");
                break;
            case Noviembre:
                System.out.println("Día del Administrador.");
                break;
            case Diciembre:
                System.out.println("Día de los Inocentes.");
                break;
            default:
                System.out.println("Los meses del año tienen algunas fechas importantes");
                break;
        }
    }
}
}
