import adapter.softNou.Bar;
import adapter.softNou.Bautura;
import adapter.softVechi.AdapterBarRestaurant;
import adapter.softVechi.AdapterBauturaProdus;
import adapter.softVechi.Produs;
import adapter.softVechi.Restaurant;

public class Main {
    public static void platesteConsumatie(Restaurant restaurant){
        restaurant.printareBon();
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        restaurant.adaugaProdus(new Produs("Ciorba", 23));
        restaurant.adaugaProdus(new Produs("Pilaf", 30));
        restaurant.adaugaProdus(new Produs("Limonada", 15));

        platesteConsumatie(restaurant);

        Bar bar = new Bar();

        bar.adaugaBautura(new Bautura("Tequilla", 24, 3));
        bar.adaugaBautura(new Bautura("Vodca", 25, 50));

        AdapterBarRestaurant adapterBarRestaurant = new AdapterBarRestaurant();

        adapterBarRestaurant.adaugaBautura(new Bautura("Cola", 20, 0));
        adapterBarRestaurant.adaugaBautura(new Bautura("Sprite", 25, 0));
        adapterBarRestaurant.adaugaBautura(new Bautura("Fanta", 23, 0));

        Bautura bautura = new Bautura("Apa", 5, 0);
        AdapterBauturaProdus adapterBauturaProdus = new AdapterBauturaProdus(bautura);
        adapterBauturaProdus.

        adapterBarRestaurant.printareBon();
    }
}
