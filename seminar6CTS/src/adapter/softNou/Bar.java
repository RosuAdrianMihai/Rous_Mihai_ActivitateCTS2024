package adapter.softNou;

import adapter.softVechi.Produs;

import java.util.ArrayList;
import java.util.List;

public class Bar {
    private List<Bautura> listaBauturi;

    public Bar() {
        this.listaBauturi = new ArrayList<Bautura>();
    }

    public void adaugaBautura(Bautura bautura){
        this.listaBauturi.add(bautura);
    }

    public void printareBon(){
        float sumaTotala = 0;

        for(Bautura b : listaBauturi){
            System.out.println(b);
            sumaTotala += b.getPret();
        }

        System.out.println("Total: " + sumaTotala);
    }
}
