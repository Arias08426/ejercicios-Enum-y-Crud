package CRUD.EMPLEADOS.EMPLEADOS.REPOSITORIO;

import CRUD.EMPLEADOS.MODELO.Empleados;

import java.util.ArrayList;
import java.util.List;

public class EmpleadosRepositorioImpl implements EmpleadosRepositorio {
        private List<Empleados> empleados;
        public  EmpleadosRepositorioImpl(){
            empleados = new ArrayList<>();
        }

        @Override
        public Empleados findById(int id){
            return empleados.stream()
                    .filter(local -> local.getId() == id)
                    .findFirst()
                    .orElse(null);
        }
        @Override
        public List<Empleados> findAll(){
            return empleados;
        }

        @Override
        public void save(Empleados empleado){
            empleados.add(empleado);
        }

        @Override
        public  void update(Empleados empleado){
            Empleados oldEmpleado = findById(empleado.getId());
            if (oldEmpleado != null){
                empleados.remove(oldEmpleado);
                empleados.add(empleado);
            }
        }
        @Override
        public void delete(Empleados empleado) {empleados.remove(empleado);}
    }


