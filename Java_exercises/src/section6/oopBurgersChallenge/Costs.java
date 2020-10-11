package section6.oopBurgersChallenge;

public class Costs {
    private double price;
    private double totalPrice = 0;
    private int count = 0;

    public void add() {
        count++;
        totalPrice += price;
    }

    public void remove() {
        if (count < 1) {
            System.out.println("No items to remove");
        }
        else {
            count--;
            totalPrice -= price;
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void increasePrice(double increase) {
        price += increase;
    }

    public void reducePrice(double reduce) {
        if (price <= 0 || price < reduce) {
            System.out.println("invalid reduce");
        }
        else {
            price -= reduce;
        }
    }
}
