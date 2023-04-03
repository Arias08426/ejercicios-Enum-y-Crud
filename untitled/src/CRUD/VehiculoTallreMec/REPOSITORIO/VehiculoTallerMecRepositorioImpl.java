package CRUD.VehiculoTallreMec.REPOSITORIO;
import CRUD.VehiculoTallreMec.MODELO.VehiculoTallerMec;

import java.util.List;
import java.util.ArrayList;
public class VehiculoTallerMecRepositorioImpl implements VehiculoTallerMecRepositorio {
    private  List<VehiculoTallerMec> VehiculoTalleresMec;
    public VehiculoTallerMecRepositorioImpl() { VehiculoTalleresMec = new ArrayList<>();}

    @Override
    public VehiculoTallerMec findByPlaca(int placa) {
        return VehiculoTalleresMec.stream()
                .filter(VehiculoTallerMec -> VehiculoTallerMec.getPlaca() == placa)
                .findFirst()
                .orElse( null);
    }

    @Override
    public  List<VehiculoTallerMec> findAll() {return VehiculoTalleresMec;}

    @Override
    public void save (VehiculoTallerMec taller) {VehiculoTalleresMec.add(taller);}

    @Override
    public void update(VehiculoTallerMec taller) {
        VehiculoTallerMec oldTaller = findByPlaca(taller.getPlaca());
        if (oldTaller != null){
            VehiculoTalleresMec.remove(oldTaller);
            VehiculoTalleresMec.add(taller);
        }
    }
    @Override
    public void delete(VehiculoTallerMec taller) { VehiculoTalleresMec.remove(taller); }
}
