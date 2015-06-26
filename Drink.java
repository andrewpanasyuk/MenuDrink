/**
 * Created by panasyuk on 24.06.2015.
 */
public abstract class Drink {
protected Drink drink;
    protected String name;
    protected double volume;
    protected double price;
    protected Ingradients[] ingradients;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Ingradients[] getIngradients() {
        return ingradients;
    }

    public void setIngradients(Ingradients[] ingradients) {
        this.ingradients = ingradients;
    }
}
