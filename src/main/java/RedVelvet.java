public class RedVelvet extends Cake{

    private int layers;

    public RedVelvet(String name, String baseFlavour, double cost, double sellPrice, boolean vegan ,int layers){
        super(name, baseFlavour, cost, sellPrice, vegan);
        this.layers = layers;
    }

    public int getLayers(){
        return this.layers;
    }

    public void setLayers(int layers){
        this.layers = layers;
    }

}
