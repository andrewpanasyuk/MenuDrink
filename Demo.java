/**
 * Created by panasyuk on 24.06.2015.
 */
public class Demo {

    public static void main(String[] args) {
        //PrintMenu newMenu = new PrintMenu();
        PrintMenu.hedMenu();
        zavarnik(new Tea(TypeTea.BLACK_TEA, 2, 2));
        zavarnik(new Tea(TypeTea.GREEN_TEA));
        zavarnik(new Tea(TypeTea.BERGAMOT_TEA));
        zavarnik(new Coffe());
        zavarnik(new CoffeMilk());
        zavarnik(new Mocaccino());
        zavarnik(new Americano());
        zavarnik(new Cappuccino());



    }

    public static void zavarnik(MakeDrink drink){
        drink.makeDrink();

    }
}
