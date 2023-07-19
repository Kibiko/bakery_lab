package models;

import interfaces.IEggsNeeded;
import interfaces.ISell;

import java.util.ArrayList;

public class Bakery {

    private String name;
    private ArrayList<ISell> stock;
    private double till;
    private ArrayList<IEggsNeeded> eggCakes;

    public Bakery(String name){
        this.name = name;
        this.stock = new ArrayList<>();
        this.till = 0;
        this.eggCakes = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public ArrayList<ISell> getStock(){
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
        for (ISell cake : this.stock){
            sum += (cake.calculateMargin());
        }
        return sum;
    }

    public void addEggCakes(IEggsNeeded cake){
        this.eggCakes.add(cake);
    }

    public ArrayList<IEggsNeeded> getEggCakes(){
        return this.eggCakes;
    }

}
