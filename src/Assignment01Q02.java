public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int n = Integer.parseInt(args[0]);
        double denominator = 1.0;
        char opp = '+';
        for (int i = 0; i <n ; i++) {
            if (opp == '+') {
                approxPi += 1.0 / denominator;
                opp = '-';
            } else {
                approxPi -= 1.0 / denominator;
                opp = '+';
            }
            denominator += 2.0;
        }
        approxPi *= 4;
        System.out.println(approxPi + " " + actualPi);
    }
}
