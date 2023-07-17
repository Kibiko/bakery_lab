public class Cupcake extends Cake{

    private String[] toppings;

    public Cupcake(String name, String baseFlavour, double cost, double sellPrice, boolean vegan, int numOfToppings){
        super(name, baseFlavour, cost, sellPrice, vegan);
        this.toppings = new String[numOfToppings];
    }

    public String[] getToppings(){
        return this.toppings;
    }

    public void setToppings(String[] toppings){
        this.toppings = toppings;
    }

}
