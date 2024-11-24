package SSPP.model;

public class Sentencia {
    private int codSentencia;
    private int codRecluso;
    private int codCrimen;

    public Sentencia() {}

    public Sentencia(int codSentencia, int codRecluso, int codCrimen) {
        this.codSentencia = codSentencia;
        this.codRecluso = codRecluso;
        this.codCrimen = codCrimen;
    }

    // Getters and Setters
    public int getCodSentencia() { return codSentencia; }
    public void setCodSentencia(int codSentencia) { this.codSentencia = codSentencia; }

    public int getCodRecluso() { return codRecluso; }
    public void setCodRecluso(int codRecluso) { this.codRecluso = codRecluso; }

    public int getCodCrimen() { return codCrimen; }
    public void setCodCrimen(int codCrimen) { this.codCrimen = codCrimen; }
}
