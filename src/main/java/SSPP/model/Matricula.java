package SSPP.model;

public class Matricula {
    private int codMatricula;
    private int codRecluso;
    private int codCurso;

    public Matricula() {}

    public Matricula(int codMatricula, int codRecluso, int codCurso) {
        this.codMatricula = codMatricula;
        this.codRecluso = codRecluso;
        this.codCurso = codCurso;
    }

    // Getters and Setters
    public int getCodMatricula() { return codMatricula; }
    public void setCodMatricula(int codMatricula) { this.codMatricula = codMatricula; }

    public int getCodRecluso() { return codRecluso; }
    public void setCodRecluso(int codRecluso) { this.codRecluso = codRecluso; }

    public int getCodCurso() { return codCurso; }
    public void setCodCurso(int codCurso) { this.codCurso = codCurso; }
}
