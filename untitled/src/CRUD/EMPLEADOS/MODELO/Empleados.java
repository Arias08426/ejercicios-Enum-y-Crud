package CRUD.EMPLEADOS.MODELO;


    public class Empleados {
        public Integer Id;
        private String nombreEmpleado;
        private Integer telefonoEmpleado;
        public String cargoEmpleado;
        public String tipoContratoEmpleado;

        public Empleados(Integer id, String nombreEmpleado, Integer telefonoEmpleado, String puestoEmpleado, String cont){
            Id = id;
            this.nombreEmpleado = nombreEmpleado;
            this.telefonoEmpleado = telefonoEmpleado;
            this.cargoEmpleado = puestoEmpleado;
            this.tipoContratoEmpleado = tipoContratoEmpleado;
        }

        public  Integer getId(){
            return Id;
        }
        public void setId(Integer id) {Id = id;}

        public String getNombreEmpleado() {return nombreEmpleado;}
        public void setNombreEmpleado(String nombreEmpleado) {this.nombreEmpleado = nombreEmpleado;}
        public Integer getTelefonoEmpleado(){ return telefonoEmpleado;}
        public void setTelefonoEmpleado(Integer telefonoEmpleado) { this.telefonoEmpleado = telefonoEmpleado;}

        public String getPuestoEmpleado() {return cargoEmpleado;}
        public void setPuestoEmpleado(String puestoEmpleado) {this.cargoEmpleado = puestoEmpleado;}

        public String getTipoContratoEmpleado(){return  tipoContratoEmpleado;}
        public void setTipoContratoEmpleado(String tipoContratoEmpleado){this.tipoContratoEmpleado = tipoContratoEmpleado;}


        @Override
        public String toString() {
            return "Empleados ->" +
                    "Id= " + Id +
                    ", Nombre Del Empleado= " + nombreEmpleado + '\'' +
                    ", Telefono Del Empleado= " + telefonoEmpleado + '\'' +
                    ", Cargo Del Empleado= " + cargoEmpleado +'\'' +
                    ",Tipo De Empleado=" + tipoContratoEmpleado;
        }
    }
