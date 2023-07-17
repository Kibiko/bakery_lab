import java.util.ArrayList;

public class Bakery {

    private String name;
    private ArrayList<Cake> stock;
    private double till;

    public Bakery(String name){
        this.name = name;
        this.stock = new ArrayList<>();
        this.till = 0;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public ArrayList<Cake> getStock(){
        return this.stock;
    }

    public int getStockCount(){
        return this.stock.size();
    }

    public void addCakeToStock(Cake cake){
        this.stock.add(cake);
    }

    public void removeCakeFromStock(Cake cake){
        this.stock.remove(cake);
    }

    public double getTill(){
        return this.till;
    }

    public void setTill(double amount){
        this.till = amount;
    }

    public double getStockProfit(){
        double sum = 0;
        for (Cake cake : this.stock){
            sum += (cake.calculateMargin());
        }
        return sum;
    }

}
