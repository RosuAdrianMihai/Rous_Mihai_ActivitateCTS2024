package adapter.softVechi;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements SoftRestaurant {
    private List<Produs> listaProduse = new ArrayList<>();

    public Restaurant() {
    }

    public Restaurant(List<Produs> listaProduse) {
        this.listaProduse = listaProduse;
    }

    public void adaugaProdus(Produs produs){
        this.listaProduse.add(produs);
    }

    public void printareBon(){
        float sumaTotala = 0;

        for(Produs p : listaProduse){
            System.out.println(p);
            sumaTotala += p.getPret();
        }

        System.out.println("Total: " + sumaTotala);
    }
}
