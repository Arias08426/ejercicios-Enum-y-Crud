package CRUD.EMPLEADOS.EMPLEADOS.REPOSITORIO;

import CRUD.EMPLEADOS.MODELO.Empleados;

import java.util.List;

public interface EmpleadosRepositorio {
    Empleados findById(int id);
    List<Empleados> findAll();
    void save(Empleados empleado);
    void update(Empleados empleado);
    void delete(Empleados empleado);
}
