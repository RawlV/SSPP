package SSPP.model;

public class CalificacionCond {
    private int codCalificacionCond;
    private int codRecluso;
    private int codConducta;

    public CalificacionCond() {}

    public CalificacionCond(int codCalificacionCond, int codRecluso, int codConducta) {
        this.codCalificacionCond = codCalificacionCond;
        this.codRecluso = codRecluso;
        this.codConducta = codConducta;
    }

    // Getters and Setters
    public int getCodCalificacionCond() { return codCalificacionCond; }
    public void setCodCalificacionCond(int codCalificacionCond) { this.codCalificacionCond = codCalificacionCond; }

    public int getCodRecluso() { return codRecluso; }
    public void setCodRecluso(int codRecluso) { this.codRecluso = codRecluso; }

    public int getCodConducta() { return codConducta; }
    public void setCodConducta(int codConducta) { this.codConducta = codConducta; }
}
