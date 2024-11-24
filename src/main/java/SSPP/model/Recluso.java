package SSPP.model;

import java.util.Date;

public class Recluso {
    private int codRecluso;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private Integer codCrimen;
    private Integer codCurso;
    private Integer codConducta;
    private Integer codCelda;

    public Recluso() {}

    public Recluso(int codRecluso, String nombre, String apellido, Date fechaNacimiento,
                   Integer codCrimen, Integer codCurso, Integer codConducta, Integer codCelda) {
        this.codRecluso = codRecluso;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.codCrimen = codCrimen;
        this.codCurso = codCurso;
        this.codConducta = codConducta;
        this.codCelda = codCelda;
    }

    // Getters and Setters
    public int getCodRecluso() { return codRecluso; }
    public void setCodRecluso(int codRecluso) { this.codRecluso = codRecluso; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public Date getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(Date fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public Integer getCodCrimen() { return codCrimen; }
    public void setCodCrimen(Integer codCrimen) { this.codCrimen = codCrimen; }

    public Integer getCodCurso() { return codCurso; }
    public void setCodCurso(Integer codCurso) { this.codCurso = codCurso; }

    public Integer getCodConducta() { return codConducta; }
    public void setCodConducta(Integer codConducta) { this.codConducta = codConducta; }

    public Integer getCodCelda() { return codCelda; }
    public void setCodCelda(Integer codCelda) { this.codCelda = codCelda; }
}
