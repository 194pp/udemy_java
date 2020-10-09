package section5;

public class FlourPacker {
    /*
    bigCount - 5 kilo bags
    smallCount - 1 kilo bags
    goal - amount needed to assemble
     */
    final static int BIG = 5;
    final static int SMALL = 1;

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (goal < 0)
            return false;
        int currentLoad = 0;
        if (goal >= bigCount * BIG) {
            currentLoad += bigCount * BIG;
        }
        else if (goal > 4) {
            currentLoad += (goal/5) * BIG;
        }
        return goal <= currentLoad + (smallCount * SMALL);
    }
}
