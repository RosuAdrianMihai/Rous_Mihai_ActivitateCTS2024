package model;

public class Pacient {
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuciCamera;
    private boolean areHalatInterior;

    protected Pacient() {
    }

    public Pacient(String nume, boolean arePatRabatabil, boolean areMicDejunInclus, boolean arePapuciCamera, boolean areHalatInterior) {
        this.nume = nume;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejunInclus = areMicDejunInclus;
        this.arePapuciCamera = arePapuciCamera;
        this.areHalatInterior = areHalatInterior;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    protected void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    protected void setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.areMicDejunInclus = areMicDejunInclus;
    }

    protected void setArePapuciCamera(boolean arePapuciCamera) {
        this.arePapuciCamera = arePapuciCamera;
    }

    protected void setAreHalatInterior(boolean areHalatInterior) {
        this.areHalatInterior = areHalatInterior;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", arePatRabatabil=").append(arePatRabatabil);
        sb.append(", areMicDejunInclus=").append(areMicDejunInclus);
        sb.append(", arePapuciCamera=").append(arePapuciCamera);
        sb.append(", areHalatInterior=").append(areHalatInterior);
        sb.append('}');
        return sb.toString();
    }

    public static class PacientBuilder implements PacientAbstractBuilder {
        private String nume;
        private boolean arePatRabatabil;
        private boolean areMicDejunInclus;
        private boolean arePapuciCamera;
        private boolean areHalatInterior;

        public PacientBuilder(String nume){
            this.nume = nume;
        }

        @Override
        public PacientAbstractBuilder adaugaPatRabatabil(boolean arePatRabatabil) {
            this.arePatRabatabil = arePatRabatabil;

            return this;
        }

        @Override
        public PacientBuilder adaugaMicDejunInclus(boolean areMicDejunInclus) {
            this.areMicDejunInclus = areMicDejunInclus;
            return this;
        }

        @Override
        public PacientBuilder adaugaPapuciCamera(boolean arePapuciCamera) {
            this.arePapuciCamera = arePapuciCamera;
            return this;
        }

        @Override
        public PacientBuilder adaugaHalatInterior(boolean areHalatInterior) {
            this.areHalatInterior = areHalatInterior;
            return this;
        }

        @Override
        public Pacient build() {
            return new Pacient(nume, arePatRabatabil, areMicDejunInclus, arePapuciCamera, areHalatInterior);
        }
    }
}
