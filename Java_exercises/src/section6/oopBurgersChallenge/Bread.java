package section6.oopBurgersChallenge;

import com.sun.jdi.InvalidTypeException;

public class Bread extends Costs {
    private String type;

    public Bread(String type) {
        try {
            setType(type);
            add();
        } catch (Exception e) {
            System.out.println("error creating bread");
        }
    }

    public void setType(String type) throws InvalidTypeException {
        switch (type.toLowerCase()) {
            case "rye":
                this.type = "Rye Bread";
                setPrice(0.20);
                break;
            case "white":
                this.type = "White bread";
                setPrice(0.10);
                break;
            default:
                throw new InvalidTypeException();
        }
    }
}
