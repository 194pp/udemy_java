package section6.oopBurgersChallenge;

import java.util.ArrayList;
import java.util.List;

public class Burger extends Costs{
    private List<Costs> contents = new ArrayList<Costs>();

    public Burger() {
        try {
            Meat meat = new Meat("chicken");
            Bread bread = new Bread("rye");
            Tomato tomato = new Tomato();
            addContent(tomato);
            addContent(meat);
            addContent(bread);
            calculatePrice();
        } catch (Exception e) {
            System.out.println("error creating a burger");
        }
    }

    public void addContent (Costs item){
        contents.add(item);
    }

    public void clearContent () {
        contents.clear();
    }

    public void calculatePrice () {
        double burgerPrice = 0;
        for (Costs item : contents) {
            burgerPrice += item.getPrice();
        }
        setPrice(burgerPrice);
    }

    public void countItems() {
        int counting = 0;
        for (Costs item : contents) {
            counting += getCount();
        }
        setCount(counting);
    }

    public void printContents() {
        for (Costs item : contents) {
            System.out.println("Type: " + item.getClass().getSimpleName());
            System.out.println("Price: " + item.getPrice());
        }
        System.out.println("Total items: " + getCount());
    }
}
