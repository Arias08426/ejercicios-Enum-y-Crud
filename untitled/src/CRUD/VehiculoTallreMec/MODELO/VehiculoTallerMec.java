package CRUD.VehiculoTallreMec.MODELO;

public class VehiculoTallerMec {
    public Integer Placa;

    private String nombreDueño;
    public int tiempoRevision;
    public int precioReparacion;

    public String fechaIngreso;
    private double telefonoDueño;
    public String modeloVehiculo;

    public VehiculoTallerMec(Integer placa, String nombreDueño, String fechaIngreso, double  telefonoDueño, Integer tiempoR, String modeloVehiculo, Integer precR){
        Placa = placa;
        this.nombreDueño = nombreDueño;
        this.fechaIngreso = fechaIngreso;
        this.telefonoDueño = telefonoDueño;
        this.modeloVehiculo = modeloVehiculo;
        this.tiempoRevision = tiempoRevision;
        this.precioReparacion = precioReparacion;
    }

    public Integer getPlaca() { return  Placa;}

    public void setPlaca(Integer placa) { Placa = placa;}

    public String getNombreDueño() { return nombreDueño;}

    public void setNombreDueño(String nombreDueño) {this.nombreDueño = nombreDueño;}

    public String getFechaIngreso() { return fechaIngreso;}

    public void setFecha(String fechaIngreso) { this.fechaIngreso = fechaIngreso;}

    public double getTelefenoDueño() { return telefonoDueño;}

    public void setTelefonoDueño(double telefonoDueño) { this.telefonoDueño = telefonoDueño;}

    public Integer getTiempoRevision() { return tiempoRevision;}

    public void setTiempoRevision(Integer tiempoRevision) { this.tiempoRevision = tiempoRevision;}
    public Integer getTPrecioReparacion() { return precioReparacion;}

    public void setPrecioReparacion(Integer precioReparacion) { this.precioReparacion = precioReparacion;}

    @Override
    public String toString() {
        return "Taller ->" +
                "Placa= " + Placa +
                ", Nombre Del Dueño= " + nombreDueño + '\'' +
                ", Fecha De Ingreso= " + fechaIngreso + '\'' +
                ", Telefono Del Dueño= "+ telefonoDueño + '\'' +
                ", Modelo Del Auto= " + modeloVehiculo +
                ", Tiempo De Revisión= " + tiempoRevision +
                ", Precio De Reparación= " + precioReparacion ;

    }
}
