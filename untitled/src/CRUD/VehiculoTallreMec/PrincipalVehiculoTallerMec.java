package CRUD.VehiculoTallreMec;
import CRUD.VehiculoTallreMec.MODELO.VehiculoTallerMec;
import CRUD.VehiculoTallreMec.REPOSITORIO.VehiculoTallerMecRepositorio;
import CRUD.VehiculoTallreMec.REPOSITORIO.VehiculoTallerMecRepositorioImpl;

import java.util.List;
import java.util.Scanner;
public class PrincipalVehiculoTallerMec {
    public static void main(String[] args) {
        String opc = "1";
        VehiculoTallerMecRepositorio report = new VehiculoTallerMecRepositorioImpl();
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Menu Del Concesionario Chevrolet \n 1. Agregar  \n 2. Listar \n 3. Editar " +
                    "\n 4. Eliminar  \n 5. Salir \n =>");
            opc = s.next();
            switch (opc) {
                //Placa, dueño, fecha, teléfono del dueño, modelo del Vehiculo, tiempo de revision,precio de revision
                case "1": {
                    System.out.println("Placa Del Vehiculo: ");
                    Integer plac = s.nextInt();
                    System.out.println("Nombre Del Dueño: ");
                    String due = s.next();
                    System.out.println("Fecha de Ingreso:");
                    String fecIngr = s.next();
                    System.out.println("Telefono Del Dueño: ");
                    Integer telef = s.nextInt();
                    System.out.println("Tiempo De La Revisióno: ");
                    Integer tiempoR = s.nextInt();
                    System.out.println("Modelo del Vehiculo: ");
                    String mod = s.next();
                    System.out.println("Precio Revisión:");
                    Integer precR = s.nextInt();
                    report.save(new VehiculoTallerMec(plac, due, fecIngr, telef,tiempoR , mod, precR));
                    break;
                }
                case "2": {
                    List<VehiculoTallerMec> VehiculoTallerMec = report.findAll();
                    VehiculoTallerMec.forEach(System.out::println);
                    break;
                }
                case "3": {
                    System.out.println("===== Editar ====");
                    System.out.println("Placa Del Vehiculo: ");
                    Integer plac = s.nextInt();
                    System.out.println("Ingrese El Nombre Del Dueño: ");
                    String due = s.next();
                    System.out.println("Ingrese La Fecha De Ingreso: ");
                    String fecIngr = s.next();
                    System.out.println("Ingrese El Telefono Del Dueño: ");
                    Integer telef = s.nextInt();
                    System.out.println("Tiempo De La Revisióno: ");
                    Integer tiempoR = s.nextInt();
                    System.out.println("Ingrese El Modelo Del vehiculo: ");
                    String modV = s.next();
                    System.out.println("Precio Revisión:");
                    Integer precR = s.nextInt();
                    VehiculoTallerMec beaActualizar = new VehiculoTallerMec(plac, due, fecIngr, telef, tiempoR, modV, precR);
                    report.update(beaActualizar);
                    break;
                }
                case "4": {
                    System.out.println("===== eliminar ======");
                    System.out.print("Ingrese La Placa Del Vehiculo");
                    Integer placa = s.nextInt();
                    report.delete(report.findByPlaca(placa));
                    report.findAll().forEach(System.out::println);
                    break;
                }
                case "5": {
                    opc = "5";
                    break;
                }
            }
        } while (opc != "5");
    }
}
