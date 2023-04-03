package CRUD.VehiculoTallreMec.REPOSITORIO;
import CRUD.VehiculoTallreMec.MODELO.VehiculoTallerMec;
import java.util.List;
public interface VehiculoTallerMecRepositorio {

    VehiculoTallerMec findByPlaca(int placa);

    List<VehiculoTallerMec> findAll();
    void save(VehiculoTallerMec vehiculoTallerMec);
    void update(VehiculoTallerMec vehiculoTallerMec);
    void delete(VehiculoTallerMec vehiculoTallerMec);
}
