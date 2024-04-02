package adapter.softNou;

public class Bautura {
    private String denumire;
    private float pret;
    private float gradAlcool;

    public Bautura(String denumire, float pret, float gradAlcool) {
        this.denumire = denumire;
        this.pret = pret;
        this.gradAlcool = gradAlcool;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public float getGradAlcool() {
        return gradAlcool;
    }

    public void setGradAlcool(float gradAlcool) {
        this.gradAlcool = gradAlcool;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bautura{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", gradAlcool=").append(gradAlcool);
        sb.append('}');
        return sb.toString();
    }
}
