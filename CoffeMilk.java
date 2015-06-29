/**
 * Created by panasyuk on 25.06.2015.
 */
public class CoffeMilk extends Coffe {
    protected int milkPortion = 1;

    public CoffeMilk() {
        name = "CoffeMilk";
        setPrice(getPrice() + Price.milk * getMilkPortion());
        components();
    }

    public CoffeMilk(int milkPortion, int sugar) {
        name = "CoffeMilk";
        this.milkPortion = milkPortion;
        setSugar(sugar);
        setPrice(getPrice() + Price.milk * milkPortion + Price.sugar*sugar);
        components();
    }


    @Override
    public void makeDrink() {
        PrintMenu.print(this);
        components();
    }

    private void components() {
        Ingradients[] temp = getIngradients();

        ingradients = new Ingradients[4];
        System.arraycopy(temp, 0, ingradients, 0, temp.length-1);
        ingradients[2] = new Ingradient_Sugar(getSugar());
        ingradients[3] = new Ingradient_Milk(getMilkPortion());

    }

    public int getMilkPortion() {
        return milkPortion;
    }

    public void setMilkPortion(int milkPortion) {
        this.milkPortion = milkPortion;
    }
}
