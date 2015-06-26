/**
 * Created by panasyuk on 25.06.2015.
 */
public class Mocaccino extends CoffeMilk {
    protected int chocolate;

    public Mocaccino(){
        name = "Mocaccino";
        chocolate = 1;
        setPrice(getPrice() + Price.chocolate * chocolate);
        components();
    }

    @Override
    public void makeDrink() {
        PrintMenu.print(this);
        components();
    }
    private void components() {
        Ingradients[] temp = getIngradients();
        ingradients = new Ingradients[5];
        System.arraycopy(temp, 0, ingradients, 0, temp.length);
        ingradients[4] = new Ingradient_Chocolate();

    }
}
