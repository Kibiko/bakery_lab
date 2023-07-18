public class Cheesecake extends Cake{

    private boolean baked;
    private String base;

    public Cheesecake(String name, String baseFlavour, double cost, double sellPrice, boolean vegan, boolean baked, String base){
        super(name, baseFlavour, cost, sellPrice, vegan);
        this.baked = baked;
        this.base = base;
    }

    public boolean getBaked(){
        return this.baked;
    }

    public void setBaked(boolean baked){
        this.baked = baked;
    }

    public String getBase(){
        return this.base;
    }

    public void setBase(String base){
        this.base = base;
    }

    public double calcSellPrice(){
        if(base.equals("hobknobs")){
            return this.sellPrice + 1;
        } else if(base.equals("digestives")){
            return this.sellPrice + 2;
        }
        return this.sellPrice;
    }




}
