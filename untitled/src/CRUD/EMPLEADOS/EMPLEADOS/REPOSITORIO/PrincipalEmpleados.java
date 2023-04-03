package CRUD.EMPLEADOS.EMPLEADOS.REPOSITORIO;
import CRUD.EMPLEADOS.MODELO.Empleados;

import java.util.List;
import java.util.Scanner;
public class PrincipalEmpleados {
    public static void main(String[] args) {
        String opc = "1";
        EmpleadosRepositorio repo = new EmpleadosRepositorioImpl() {
        };
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Portafolio De Empleados \n 1. Agregar  \n 2. Listar \n 3. Editar " +
                    "\n 4. Eliminar  \n 5. Salir \n =>");
            opc = s.next();
            switch (opc) {
                case "1": {
                    System.out.println("Id Del Empleado: ");
                    Integer id = s.nextInt();
                    System.out.println("Nombre Del Empleado: ");
                    String nom = s.next();
                    System.out.println("Telefono Del Empleado: ");
                    Integer tel = s.nextInt();
                    System.out.println("Cargo Del Empleado: ");
                    String car = s.next();
                    System.out.println("Tipo de Contrato Del Empleado: ");
                    String cont = s.next();
                    repo.save(new Empleados(id, nom, tel, car,cont));
                    break;
                }
                case "2": {
                    List<Empleados> empleados = repo.findAll();
                    empleados.forEach(System.out::println);
                    break;
                }
                case "3": {
                    System.out.println("===== Editar ====");
                    System.out.println("Id Del Empleado: ");
                    Integer idp = s.nextInt();
                    System.out.println("Ingrese El Nombre Del Empleado: ");
                    String nom = s.next();
                    System.out.println("Ingrese El Telefono Del Empleado: ");
                    Integer tel = s.nextInt();
                    System.out.println("Ingrese El Cargo Del Empleado: ");
                    String car = s.next();
                    System.out.println("Ingrese El Tipo de contrato Del Empleado: ");
                    String cont = s.next();
                    Empleados beaActualizar = new Empleados(idp, nom, tel, car,cont);
                    repo.update(beaActualizar);
                    break;
                }
                case "4": {
                    System.out.println("===== Eliminar ======");
                    System.out.println("Ingrese El Id Del Empleado: ");
                    Integer id = s.nextInt();
                    repo.delete(repo.findById(id));
                    repo.findAll().forEach(System.out::println);
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
