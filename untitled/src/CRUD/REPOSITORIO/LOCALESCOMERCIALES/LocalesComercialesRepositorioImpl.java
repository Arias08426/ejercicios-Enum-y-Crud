package CRUD.REPOSITORIO.LOCALESCOMERCIALES;
import CRUD.LOCALESCOMERCIALES.MODELO.LocalesComerciales;
import java.util.List;
import java.util.ArrayList;


public class LocalesComercialesRepositorioImpl implements LocalesComercialesRepositorio {
    private List <LocalesComerciales> localesComerciales;
    public LocalesComercialesRepositorioImpl(){localesComerciales = new ArrayList<>();}
    @Override
    public LocalesComerciales findById (int id){
            return localesComerciales.stream()
                    .filter(localesComerciales -> localesComerciales.getId() == id)
                    .findFirst()
                    .orElse(null);
    }
    @Override
    public List<LocalesComerciales> findAll(){return localesComerciales;}

    public void save(LocalesComerciales localComercial) {
        localesComerciales.add(localComercial);
    }

    @Override
    public void update(LocalesComerciales localComercial) {
        LocalesComerciales oldLocalComercial = findById(localComercial.getId());
        if (oldLocalComercial != null) {
            localesComerciales.remove(oldLocalComercial);
            localesComerciales.add(localComercial);
        }
    }

    @Override
    public void delete(LocalesComerciales localComercial) {localesComerciales.remove(localComercial);
    }

}
