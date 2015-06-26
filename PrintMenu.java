/**
 * Created by panasyuk on 25.06.2015.
 */


public  class PrintMenu {
    //PrintMenu a = new PrintMenu();

    public static void hedMenu(){
        System.out.printf("%-15s %15s %15s %n", "Name drink", "Ingradients", "Price");
        System.out.println("---------------------------------------------------");
    }
    public static void print(Drink drink){
        System.out.printf("%-15s %15s %,15.2f %n", drink.getName(), " ", drink.getPrice());
        for (int i =0; i<drink.getIngradients().length; i++){
            if (drink.getIngradients()[i].getItem()>0) {
                System.out.printf("%-15s%15s%n"," ",drink.getIngradients()[i].getName()+" - "+drink.getIngradients()[i].getItem());
            }
        }
        System.out.println("---------------------------------------------------");
    }


}
