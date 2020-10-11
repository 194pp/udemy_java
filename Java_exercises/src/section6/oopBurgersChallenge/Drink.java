package section6.oopBurgersChallenge;
import com.sun.jdi.InvalidTypeException;

public class Drink extends Costs{
    private int size;
    private String name;

    public Drink(String name, int size) {
        try {
            setName(name);
            setSize(size);
            add();

        } catch (Exception e) {
            System.out.println("There was an error setting a drink");
        }
    }

    private void setName(String name) throws InvalidTypeException {
        switch (name.toLowerCase()) {
            case "cola":
                this.name = "Cola";
                setPrice(0.50);
                break;
            case "diet cola":
                this.name = "diet cola";
                setPrice(0.50);
                break;
            case "pepsi":
                this.name = "Pepsi";
                setPrice(0.50);
                break;
            case "sprite":
                this.name = "Sprite";
                setPrice(0.60);
                break;
            case "fanta":
                this.name = "Fanta";
                setPrice(0.40);
                break;
            default:
                throw new InvalidTypeException();
        }
    }

    private void setSize(int size) {
        switch (size) {
            case 1:     // small
                break;
            case 2:     // medium
                increasePrice(0.10);
                break;
            case 3:     //large
                increasePrice(0.30);
                break;
            default:
                System.out.println("invalid size");
                break;
        }

    }
}
