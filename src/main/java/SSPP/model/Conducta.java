package SSPP.model;

public class Conducta {
    private int codConducta;
    private String nombre;
    private String descripcion;

    public Conducta() {}

    public Conducta(int codConducta, String nombre, String descripcion) {
        this.codConducta = codConducta;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Getters and Setters
    public int getCodConducta() { return codConducta; }
    public void setCodConducta(int codConducta) { this.codConducta = codConducta; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}
