import model.Pacient;
import model.PacientAbstractBuilder;
import model.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        PacientAbstractBuilder builder = new PacientBuilder("Andrei");

        Pacient pacient = builder.adaugaHalatInterior().adaugaPapuciCamera().build();

        System.out.println(pacient);
    }
}
