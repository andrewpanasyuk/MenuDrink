/**
 * Created by panasyuk on 24.06.2015.
 */
public class Coffe extends Drink implements MakeDrink, Price {
    protected TypeCoffe typeCoffe;
    protected double sugar;




    public Coffe(){
        name = "Espresso";
        setVolume(0.1);
        typeCoffe = TypeCoffe.ESPRESSO;
        setSugar(2);
        setPrice(Price.espresso + Price.water*getVolume() + Price.sugar * getSugar());
        components();
    }
    public Coffe(double sugar){
        name = "Espresso";
        setVolume(0.1);
        name = "Espresso";
        setSugar(sugar);
        setPrice(Price.espresso + Price.water*getVolume() + Price.sugar * getSugar());
    }

    @Override
    public void makeDrink() {
        components();
        PrintMenu.print(this);
    }
    private void components(){
        ingradients = new Ingradients[3];
        ingradients[0] = new Espresso(1);
        ingradients[1] = new Ingradient_Water(getVolume());
        ingradients[2] = new Ingradient_Sugar(getSugar());

    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }
}
