package adapter.softVechi;

import adapter.softNou.Bautura;

public class AdapterBauturaProdus extends Produs implements SoftRestaurant{
    private Bautura bautura;

    public AdapterBauturaProdus(Bautura bautura){
        super(bautura.getDenumire(), bautura.getPret());

        this.bautura = bautura;
    }


    @Override
    public void printareBon() {

    }

    @Override
    public void adaugaProdus(Produs produs) {
    }
}
