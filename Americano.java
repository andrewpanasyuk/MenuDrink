/**
 * Created by panasyuk on 25.06.2015.
 */
public class Americano extends Coffe{
    public Americano(){
        name = "Americano";
        setVolume(0.2);
        setPrice(getPrice() + Price.water*0.1);
        components();
    }
    public Americano(int sugar){
        name = "Americano";
        setVolume(0.2);
        setSugar(sugar);
        setPrice(getPrice() + Price.water*0.1 + Price.sugar*sugar);
        components();
    }

    @Override
    public void makeDrink() {
//        setPrice(getPrice() + Price.water*0.1);
//        System.out.println("Americano" + " - " + getVolume() * 1000 + " ml. " + getPrice() + "$");
        PrintMenu.print(this);
        components();
    }
    private void components() {
        getIngradients();
        ingradients[1] = new Ingradient_Water(0.2);

    }
}
