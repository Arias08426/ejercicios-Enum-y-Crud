package CRUD.LOCALESCOMERCIALES.MODELO;
import CRUD.REPOSITORIO.LOCALESCOMERCIALES.LocalesComercialesRepositorio;
import CRUD.REPOSITORIO.LOCALESCOMERCIALES.LocalesComercialesRepositorioImpl;

import java.util.List;
import java.util.Scanner;

public class PrincipalLocalesComerciales {
    public static void main(String[] args) {
        String opc = "1";
        LocalesComercialesRepositorio repo = new LocalesComercialesRepositorioImpl();
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Menu De La Cámara De Comercio \n 1. Agregar  \n 2. Listar \n 3. Editar " +
                    "\n 4. Eliminar  \n 5. Salir \n =>");
            opc = s.next();
            switch (opc) {
                case "1": {
                    System.out.println("Id Del Local Comercial: ");
                    Integer idloc = s.nextInt();
                    System.out.println("Nombre Del Local Comercial: ");
                    String nomb = s.next();
                    System.out.println("Ubicación Del Local Comercial: ");
                    String ubic = s.next();
                    System.out.println("Telefono Del local Comercial: ");
                    Integer telef = s.nextInt();
                    repo.save(new LocalesComerciales(idloc, nomb, ubic, telef));
                    break;
                }
                case "2": {
                    List<LocalesComerciales> locales = repo.findAll();
                    locales.forEach(System.out::println);
                    break;
                }
                case "3": {
                    System.out.println("===== Editar ====");
                    System.out.print("Id Del Local: ");
                    Integer idloc = s.nextInt();
                    System.out.print("Ingrese El Nombre Del Local Comercial: ");
                    String nomb = s.next();
                    System.out.print("Ingrese La Ubicación Del Local Comercial: ");
                    String ubic = s.next();
                    System.out.print("Ingrese El Telefono Del Local Comercial: ");
                    double telef = s.nextDouble();
                    LocalesComerciales beaActualizar = new LocalesComerciales(idloc, nomb, ubic, telef);
                    repo.update(beaActualizar);
                    break;
                }
                case "4": {
                    System.out.println("===== Eliminar ======");
                    System.out.print("Ingrese Id Del Local Comercial: ");
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
