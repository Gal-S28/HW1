public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int current = 1;
        int next = 1;
        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            System.out.print(current);
            if (i < x - 1) {
                System.out.print(" ");
            }
            if (current % 2 != 0) {
                numOdd++;
            }
            int sum = current + next;
            current = next;
            next = sum;
        }

        System.out.println();
                
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
