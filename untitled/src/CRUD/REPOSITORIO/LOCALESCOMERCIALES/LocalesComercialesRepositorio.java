package CRUD.REPOSITORIO.LOCALESCOMERCIALES;
import CRUD.LOCALESCOMERCIALES.MODELO.LocalesComerciales;
import java.util.List;
public interface LocalesComercialesRepositorio {
    LocalesComerciales findById(int id);
    List <LocalesComerciales> findAll();
    void save(LocalesComerciales localesComerciales);
    void update(LocalesComerciales localesComerciales);
    void  delete(LocalesComerciales localesComerciales);

}
