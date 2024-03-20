import model.Pacient;
import model.PacientAbstractBuilder;

public class Main {
    public static void main(String[] args) {
        PacientAbstractBuilder builder = new Pacient.PacientBuilder("Andrei");

        Pacient pacient = builder.adaugaHalatInterior(true).adaugaPapuciCamera(true).build();

        System.out.println(pacient);
    }
}
