package SSPP.model;

public class Crimen {
    private int codCrimen;
    private String nombre;
    private String descripcion;

    public Crimen() {}

    public Crimen(int codCrimen, String nombre, String descripcion) {
        this.codCrimen = codCrimen;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Getters and Setters
    public int getCodCrimen() { return codCrimen; }
    public void setCodCrimen(int codCrimen) { this.codCrimen = codCrimen; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}
