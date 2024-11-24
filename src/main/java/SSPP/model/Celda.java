package SSPP.model;

public class Celda {
    private int codCelda;
    private int numero;
    private int capacidad;
    private Integer codPrision;

    public Celda() {}

    public Celda(int codCelda, int numero, int capacidad, Integer codPrision) {
        this.codCelda = codCelda;
        this.numero = numero;
        this.capacidad = capacidad;
        this.codPrision = codPrision;
    }

    // Getters and Setters
    public int getCodCelda() { return codCelda; }
    public void setCodCelda(int codCelda) { this.codCelda = codCelda; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    public Integer getCodPrision() { return codPrision; }
    public void setCodPrision(Integer codPrision) { this.codPrision = codPrision; }
}
