package model;

public class PacientBuilder implements PacientAbstractBuilder {
    private Pacient pacient;


    public PacientBuilder(String nume) {
        this.pacient = new Pacient();
        this.pacient.setNume(nume);
    }

    @Override
    public PacientBuilder adaugaPatRabatabil() {
        pacient.setArePatRabatabil(true);
        return this;
    }

    @Override
    public PacientBuilder adaugaMicDejunInclus() {
        pacient.setAreMicDejunInclus(true);
        return this;
    }

    @Override
    public PacientBuilder adaugaPapuciCamera() {
        pacient.setArePapuciCamera(true);
        return this;
    }

    @Override
    public PacientBuilder adaugaHalatInterior() {
        pacient.setAreHalatInterior(true);
        return this;
    }

    @Override
    public Pacient build() {
        return null;
    }
}
