package SSPP.model;

public class Curso {
    private int codCurso;
    private String nombre;
    private String descripcion;

    public Curso() {}

    public Curso(int codCurso, String nombre, String descripcion) {
        this.codCurso = codCurso;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Getters and Setters
    public int getCodCurso() { return codCurso; }
    public void setCodCurso(int codCurso) { this.codCurso = codCurso; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}
