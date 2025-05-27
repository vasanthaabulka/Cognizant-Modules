public class TypeCasting {
    public static void main(String[] args) {
        double doubleNum = 123.456;
        int intNum = (int) doubleNum;
        System.out.println("Double to int: " + intNum);

        int number = 100;
        double doubleFromInt = (double) number;
        System.out.println("Int to double: " + doubleFromInt);
    }
}