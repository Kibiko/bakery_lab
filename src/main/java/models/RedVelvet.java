package models;
import interfaces.IEggsNeeded;

import java.util.ArrayList;

public class RedVelvet extends Cake implements IEggsNeeded{

    private int layers;
    private ArrayList<String> decorativeMessages;

    public RedVelvet(String name, String baseFlavour, double cost, double sellPrice, boolean vegan ,int layers){
        super(name, baseFlavour, cost, sellPrice, vegan);
        this.layers = layers;
        this.decorativeMessages = new ArrayList<>();
    }

    public int getLayers(){
        return this.layers;
    }

    public void setLayers(int layers){
        this.layers = layers;
    }

    public ArrayList<String> getMessages(){
        return this.decorativeMessages;
    }

    public void setMessages(String message1){  //OVERLOADED METHODS
        this.decorativeMessages = new ArrayList<>();
        this.decorativeMessages.add(message1);
    }

    public void setMessages(String message1, String message2){
        this.decorativeMessages = new ArrayList<>();
        this.decorativeMessages.add(message1);
        this.decorativeMessages.add(message2);
    }

    public void setMessages(String message1, int age, String message3){
        this.decorativeMessages = new ArrayList<>();
        this.decorativeMessages.add(message1);
        this.decorativeMessages.add(age + "th");
        this.decorativeMessages.add(message3);
    }

    public double calcSellPrice(){
        return 5.50 + this.layers; //price is now dependent on layer count
    }

    //Interface methods

    public int getEggsNeeded(){
        return this.layers * 2;
    }

    public boolean isProfitable(){
        if (this.calcSellPrice() > cost){
            return true;
        }
        return false;
    }

}
