class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or older");
            }
            System.out.println("Age is valid: " + age);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}
