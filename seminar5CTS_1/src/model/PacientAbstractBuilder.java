package model;

public interface PacientAbstractBuilder {
    public abstract PacientBuilder adaugaPatRabatabil();
    public abstract PacientBuilder adaugaMicDejunInclus();
    public abstract PacientBuilder adaugaPapuciCamera();
    public abstract PacientBuilder adaugaHalatInterior();

    public abstract Pacient build();
}
