public class DiagonalStar {
    public static void printSquareStar(int number){
        if (number < 5){
            System.out.println("Invalid Value");
            return;
        }
        for (int i = 1; i <= number; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 1; j <= number; j++) {
                if (i==1 || j==1 || j==number || i==j || i==number || i==(number-j+1)) {
                    stringBuilder.append("*");
                }
                else {
                    stringBuilder.append(" ");
                }
            }
            System.out.println(stringBuilder.toString());
        }
    }
}
