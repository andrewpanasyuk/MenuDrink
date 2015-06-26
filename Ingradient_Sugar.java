/**
 * Created by panasyuk on 26.06.2015.
 */
public class Ingradient_Sugar extends Ingradients{
    public Ingradient_Sugar(double item){
        name = "Sugar";
        this.item = item;
        //price = item*Price.sugar;
    }

    @Override
    public void setItem(double item) {
        super.setItem(item);
    }

}
