package model;

public interface PacientAbstractBuilder {
    public abstract PacientAbstractBuilder adaugaPatRabatabil(boolean arePatRabatabil);
    public abstract PacientAbstractBuilder adaugaMicDejunInclus(boolean areMicDejunInclus);
    public abstract PacientAbstractBuilder adaugaPapuciCamera(boolean arePapuciCamera);
    public abstract PacientAbstractBuilder adaugaHalatInterior(boolean areHalatInterior);

    public abstract Pacient build();
}
