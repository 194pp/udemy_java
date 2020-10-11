package section6.oopBurgersChallenge;

public class Meat extends Costs {
    private String type;

    public Meat(String type) {
        setType(type);
    }

    public void setType(String type) {
        switch (type.toLowerCase()) {
            case "chicken":
                this.type = "Chicken";
                setPrice(0.30);
                break;
            case "beef":
                this.type = "Beef";
                setPrice(0.50);
                break;
            case "pork":
                this.type = "Pork";
                setPrice(0.40);
                break;
            default:
                System.out.println("invalid meat type");
        }
    }
}
