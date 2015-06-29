/**
 * Created by panasyuk on 24.06.2015.
 */
public class Tea extends AbstractDrink implements MakeDrink, Price {
    protected TypeTea typeTea;
    protected int sugar = 1;
    protected int lemon;

    public Tea() {

    }
    public Tea(TypeTea typeTea) {
        this.typeTea = typeTea;
        nameTea();
        components();
    }

    public Tea(TypeTea typeTea, int sugar, int lemon) {
        this.typeTea = typeTea;
        this.sugar = sugar;
        this.lemon = lemon;
        nameTea();
        components();
    }

    @Override
    public void makeDrink() {

        this.volume = 0.2;
        setPrice(Price.water * volume);
        if (typeTea == TypeTea.BLACK_TEA) {

            setPrice(getPrice() + Price.blackTea);
        } else if (typeTea == TypeTea.GREEN_TEA) {
            setPrice(getPrice() + Price.greenTea);
        } else if (typeTea == TypeTea.BERGAMOT_TEA) {
            setPrice(getPrice() + Price.bergamotTea);
        }
        setPrice(getPrice() + sugar*Price.sugar + lemon * Price.lemon);
//            System.out.println(typeTea + "; " + volume * 1000 + " ml. " + price + "$;");
        components();
        PrintMenu.print(this);

    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void nameTea() {
        if (typeTea == TypeTea.BLACK_TEA){
            setName("Black tea");
        } else if (typeTea == TypeTea.GREEN_TEA) {
            setName("Green tea");
        } else if (typeTea == TypeTea.BERGAMOT_TEA) {
            setName("Bergamot tea");
        }
    }
    private void components(){
       ingradients = new Ingradients[3];
        ingradients[0] = new Ingradient_Water(0.2);
        //ingradients[1] = nameTea();
        ingradients[1] = new Ingradient_Sugar(sugar);
        ingradients[2] = new Ingradient_Lemon(lemon);

    }
}


