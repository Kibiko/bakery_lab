public abstract class Cake{

    protected String name;
    protected String baseFlavour;
    protected double cost;
    protected double sellPrice;
    protected boolean vegan;

    public Cake(String name, String baseFlavour, double cost, double sellPrice, boolean vegan){
        this.name = name;
        this.baseFlavour = baseFlavour;
        this.cost = cost;
        this.sellPrice = sellPrice;
        this.vegan = vegan;
    }

    public double calculateMargin(){
        return this.sellPrice - this.cost;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSellPrice(){
        return this.sellPrice;
    }

    public void setSellPrice(double price){
        this.sellPrice = price;
    }

    public double getCost(){
        return this.cost;
    }

    public void setCost(double cost){
        this.cost = cost;
    }

    public String getBaseFlavour(){
        return this.baseFlavour;
    }

    public void setBaseFlavour(String baseFlavour){
        this.baseFlavour = baseFlavour;
    }

    public boolean isVegan(){
        return this.vegan;
    }

    public void setVegan(boolean vegan){
        this.vegan = vegan;
    }

    public abstract double calcSellPrice(); //ABSTRACT METHOD

    interface Extras{
        public int getEggsNeeded();
        public boolean isProfitable();
    }


}
