public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        try {
            int z = x / y; // Potential ArithmeticException
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        }
    }
}