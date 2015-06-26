/**
 * Created by panasyuk on 25.06.2015.
 */
public class Cappuccino extends CoffeMilk{
    protected int milkCream;
   public Cappuccino(){
       setMilkPortion(2);
       name = "Cappucino";
       setVolume(0.05);
       setPrice(Price.espresso + Price.water*getVolume() + Price.milk*getMilkPortion() + Price.sugar * getSugar() + Price.kapuchinizaciya);
       components();
   }

    @Override
    public void makeDrink() {
        PrintMenu.print(this);
        components();
    }
    private void components() {
        getIngradients();
        ingradients[1] = new Ingradient_Water(getVolume());
        ingradients[3] = new Ingradient_Milk(getMilkPortion());

    }
}
