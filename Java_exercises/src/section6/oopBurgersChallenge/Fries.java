package section6.oopBurgersChallenge;

public class Fries extends Costs{
    private boolean isSalted;
    private boolean isLarge;

    public Fries(boolean isLarge, boolean isSalted) {
        if (isSalted) {
            setPrice(0.50);
        }
        else {
            setPrice(0.45);
        }
        if (isLarge) {
            increasePrice(0.20);
        }
    }
}
