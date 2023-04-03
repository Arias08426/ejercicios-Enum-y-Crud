package CRUD.LOCALESCOMERCIALES.MODELO;

public class LocalesComerciales {
    public Integer Id;
    private String nombrelocalComercial;
    private String ubicacionlocalComercial;
    private double telefonolocalComercial;

    public LocalesComerciales(Integer id, String nombrelocalComercial, String ubicacionlocalComercial, double telefonolocalComercial) {
        Id = id;
        this.nombrelocalComercial = nombrelocalComercial;
        this.ubicacionlocalComercial = ubicacionlocalComercial;
        this.telefonolocalComercial = telefonolocalComercial;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNombrelocalComercial() {
        return nombrelocalComercial;
    }

    public void setNombrelocal(String nombrelocalComercial) {
        this.nombrelocalComercial = nombrelocalComercial;
    }

    public String getUbicacionLocal() {
        return ubicacionlocalComercial;
    }

    public void setUbicacionLocal(String ubicacionLocal) {
        this.ubicacionlocalComercial = ubicacionlocalComercial;
    }

    public double getTelefonoLocal() {
        return telefonolocalComercial;
    }

    public void setTelefonoLocal(double telefonoLocal) {
        this.telefonolocalComercial = telefonoLocal;
    }

    @Override
    public String toString() {
        return "Local ->" +
                "Id= " + Id +
                ", Nombre Del Local= " + nombrelocalComercial + '\'' +
                ", Ubicación Del Local= " + ubicacionlocalComercial + '\'' +
                ", Telefono Del Local= " + telefonolocalComercial ;
    }


}
