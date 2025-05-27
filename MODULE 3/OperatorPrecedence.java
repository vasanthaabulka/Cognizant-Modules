public class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2; // 5 * 2 = 10, then 10 + 10 = 20
        int result2 = (10 + 5) * 2; // 10 + 5 = 15, then 15 * 2 = 30
        System.out.println("10 + 5 * 2 = " + result1 + " (Multiplication first)");
        System.out.println("(10 + 5) * 2 = " + result2 + " (Parentheses first)");
    }
}
